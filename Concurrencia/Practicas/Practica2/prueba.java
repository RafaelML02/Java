package Java.Concurrencia.Practica2;
// BlockchainCSP.java
// Lars-Ake Fredlund - MMXXIV


import org.jcsp.lang.Alternative;
import org.jcsp.lang.AltingChannelInput;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;
import org.jcsp.lang.ProcessManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prueba implements Blockchain, CSProcess {

    // peticiones aplazadas: un canal por operación
    private Any2OneChannel chCrear;
    private Any2OneChannel chDisponible;
    private Any2OneChannel chTransferir;
    private Any2OneChannel chAlertar;

    private final Map<String, Integer> cuentas = new HashMap<>();
    private final Map<String, String> ids = new HashMap<>();
    private final List<PetTransferir> transferencias = new ArrayList<>();
    private final List<PetAlertar> alertas = new ArrayList<>();

    public class PetCrear {
        String idPrivado;
        String idPublico;
        int saldo;
        One2OneChannel resp; // para tratamiento de excepciones

        public PetCrear(String idPrivado, String idPublico, int saldo) {
            this.idPrivado = idPrivado;
            this.idPublico = idPublico;
            this.saldo = saldo;
            this.resp = Channel.one2one();
        }
    }

    public class PetDisponible {
        String idPrivado;
        One2OneChannel resp; // para tratamiento de excepciones

        public PetDisponible(String idPrivado) {
            this.idPrivado = idPrivado;
            this.resp = Channel.one2one();
        }
    }

    // Transferir por peticiones aplazadas
    public class PetTransferir {
        String idPrivado;
        String idPublico;
        int saldo;
        One2OneChannel resp; // para tratamiento de excepciones

        public PetTransferir(String idPrivado, String idPublico, int saldo) {
            this.idPrivado = idPrivado;
            this.idPublico = idPublico;
            this.saldo = saldo;
            this.resp = Channel.one2one();
        }
    }

    // Alertar por peticiones aplazadas
    public class PetAlertar {
        String idPrivado;
        int saldo_maximo;
        One2OneChannel resp; // para tratamiento de excepciones

        public PetAlertar(String idPrivado, int saldo_maximo) {
            this.idPrivado = idPrivado;
            this.saldo_maximo = saldo_maximo;
            this.resp = Channel.one2one();
        }
    }

    public prueba() {
        // peticiones aplazadas: un canal por operación
		this.chCrear      = Channel.any2one();
		this.chAlertar    = Channel.any2one();
		this.chDisponible = Channel.any2one();
		this.chTransferir = Channel.any2one();	
        // arrancamos el servidor al crear un BlockchainCSP!
        new ProcessManager(this).start();
    }

    public void crear(String idPrivado, String idPublico, int saldo) {
        PetCrear pet = new PetCrear(idPrivado, idPublico, saldo);
        chCrear.out().write(pet);

        // recibir respuesta y tratar posible excepcion
        int respuesta = (Integer) pet.resp.in().read();
        if (respuesta == -1) {
            throw new IllegalArgumentException("Existe una cuenta asociada al id");
        }
    }

    public void transferir(String idPrivado, String idPublico, int v) {
        PetTransferir pet = new PetTransferir(idPrivado, idPublico, v);
        chTransferir.out().write(pet);

        // recibir respuesta y tratar posible excepcion
        int respuesta = (Integer) pet.resp.in().read();
        if (respuesta == -1) {
            throw new IllegalArgumentException("Alguna de las cuentas no existe o son la misma cuenta");
        }
    }

    public int disponible(String idPrivado) {
        PetDisponible pet = new PetDisponible(idPrivado);
        chDisponible.out().write(pet);

        // recibir respuesta y tratar posible excepcion
        int respuesta = (Integer) pet.resp.in().read();
        if (respuesta == -1) {
            throw new IllegalArgumentException("No se encuentra la cuenta pedida");
        }
        return respuesta;
    }

    public void alertarMax(String idPrivado, int max) {
        PetAlertar pet = new PetAlertar(idPrivado, max);
        chAlertar.out().write(pet);

        // recibir respuesta y tratar posible excepcion
        int respuesta = (Integer) pet.resp.in().read();
        if (respuesta == 0) {
            throw new IllegalArgumentException("M es menor que 0, o no se encuentra la cuenta pedida");
        }
    }

    // Código del servidor
    public void run() {
        final int CREAR = 0;
        final int DISPONIBLE = 1;
        final int TRANSFERIR = 2;
        final int ALERTAR = 3;

        final Guard[] guards = new AltingChannelInput[4];
        guards[CREAR]      = chCrear.in();
		guards[DISPONIBLE] = chDisponible.in();
		guards[TRANSFERIR] = chTransferir.in();
		guards[ALERTAR]    = chAlertar.in();
        Alternative servicios = new Alternative(guards);

        // Bucle principal del servicio
        while (true) {
            int servicio = servicios.fairSelect();

            switch (servicio) {
                case CREAR: // CPRE: Cierto
                    // recibir petición
                    PetCrear aux0 = (PetCrear) chCrear.in().read();

                    // tratar PRE
                    if (aux0.saldo < 0 || cuentas.get(aux0.idPublico) != null || cuentas.get(ids.get(aux0.idPrivado)) != null)
                        aux0.resp.out().write(-1); 
					else {
                        // realizar operación
                        cuentas.put(aux0.idPublico, aux0.saldo);
        				ids.put(aux0.idPrivado, aux0.idPublico);
                        aux0.resp.out().write(1);
                    }
                    break;

                case DISPONIBLE: // CPRE: Cierto
                    // recibir petición
                    PetDisponible aux1 = (PetDisponible) chDisponible.in().read();

                    // tratar PRE
                    if (!cuentas.containsKey(ids.get(aux1.idPrivado))) 
                        aux1.resp.out().write(-1);
					else {
                        // realizar operación
                        aux1.resp.out().write(cuentas.get(ids.get(aux1.idPrivado)));
                    }
                    break;
                case TRANSFERIR: // CPRE aplazada
                    // recibir petición
                    PetTransferir aux2 = (PetTransferir) chTransferir.in().read();

                    // tratar PRE
                    if (aux2.saldo <= 0 || !cuentas.containsKey(aux2.idPublico) ||!cuentas.containsKey(ids.get(aux2.idPrivado)) ||
						ids.get(aux2.idPrivado).equals(aux2.idPublico))
								aux2.resp.out().write(-1);
                    
					else {
                        boolean hayCola = false;
                        for (int i = 0; i < transferencias.size() && !hayCola; i++) {
                            hayCola = transferencias.get(i).idPrivado.equals(aux2.idPrivado);
                        }

                        if (cuentas.get(ids.get(aux2.idPrivado)) < aux2.saldo || hayCola) {
                            hayCola = true;
							transferencias.add(aux2);
							//Creo que habria que haber algo
                        } 
						else {
                            int cantCuentaOrigen = cuentas.get(aux2.idPrivado);
                            cuentas.put(aux2.idPrivado, cantCuentaOrigen - aux2.saldo);

                            String idPrivDestino = ids.get(aux2.idPublico);
                            int cantCuentaDestino = cuentas.get(idPrivDestino);
                            cuentas.put(idPrivDestino, cantCuentaDestino + aux2.saldo);

                            aux2.resp.out().write(1);
                        }
                    }
                    break;
                case ALERTAR: // CPRE aplazada
                    // recibir petición
                    PetAlertar aux3 = (PetAlertar) chAlertar.in().read();

                    // tratar PRE
                    if (aux3.saldo_maximo < 0 || !cuentas.containsKey(ids.get(aux3.idPrivado))) 
                        aux3.resp.out().write(-1);
                    
					else {
                        if (cuentas.get(ids.get(aux3.idPrivado)) <= aux3.saldo_maximo)
                            alertas.add(aux3);
                        else {
                            aux3.resp.out().write(1);
                        }
                    }
                    break;
            }

            // tratamiento de peticiones aplazadas
            boolean signaled = false;
			Map <String, String> pendientes = new HashMap<>();

            while (!signaled) {

                // Conjunto para bloquear transferencias subsecuentes
                for (int i = 0; i < transferencias.size(); i++) {
                    PetTransferir x = transferencias.get(i);

                    if (cuentas.get(ids.get(x.idPrivado)) >= x.saldo && !pendientes.containsKey(x.idPrivado)) {
                        transferencias.remove(i);
						pendientes.remove(x.idPrivado);
						signaled = true;

                        int cantCuentaOrigen = cuentas.get(x.idPrivado);
                        cuentas.put(x.idPrivado, cantCuentaOrigen - x.saldo);

                        String idPrivDestino = ids.get(x.idPublico);
                        int cantCuentaDestino = cuentas.get(idPrivDestino);
                        cuentas.put(idPrivDestino, cantCuentaDestino + x.saldo);

                        x.resp.out().write(1);
                    }
					else {
						pendientes.put(x.idPrivado, null);
					}
                }

                // Conjunto para bloquear alertas subsecuentes
                for (int i = 0; i < alertas.size() && !signaled; i++) {
                    PetAlertar x = alertas.get(i);

                    if (cuentas.get(ids.get(x.idPrivado)) > x.saldo_maximo) {
                        alertas.remove(i);
                        signaled = true;
						x.resp.out().write(1);
                    }
                }
            }
        }
    }
}