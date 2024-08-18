// BlockchainCSP.java
// Lars-Ake Fredlund - MMXXIV

//package Java.Concurrencia.Practica2;
package cc.blockchain;


import org.jcsp.lang.Alternative;
import org.jcsp.lang.AltingChannelInput;
import org.jcsp.lang.Any2OneChannel;
import org.jcsp.lang.CSProcess;
import org.jcsp.lang.Channel;
import org.jcsp.lang.Guard;
import org.jcsp.lang.One2OneChannel;
import org.jcsp.lang.ProcessManager;

// importar bibliotecas para estructuras de datos
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BlockchainCSP implements Blockchain, CSProcess {

    // peticiones aplazadas: un canal por operación
    private Any2OneChannel chCrear;						
    private Any2OneChannel chDisponible;
    private Any2OneChannel chTransferir;
    private Any2OneChannel chAlertar;

    private final Map<String, Integer> cuentas = new HashMap<>();	// un mapa de todas las cuentas, la clave es el idPrivado y el Integer el valor
    private final Map<String, String> ids = new HashMap<>();	// un mapa de todos los ids, la clave es el idPublico y el segundo es la idPrivada
    private final List<PetTransferir> transferencias = new ArrayList<>();	//Una lista de transferencias que no se pueden realizar porque no cumplen la PRE
    private final List<PetAlertar> alertas = new ArrayList<>();	//Una lista de alertas que no se pueden realizar porque no cumplen la PRE

//Las cuatro clases para los canales
    public class PetCrear {
        String idPrivado;
        String idPublico;
        int saldo;
        One2OneChannel resp; // para tratamiento de excepciones

		//El constructor
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

		//El constructor
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

		//El constructor
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

		//El constructor
        public PetAlertar(String idPrivado, int saldo_maximo) {
            this.idPrivado = idPrivado;
            this.saldo_maximo = saldo_maximo;
            this.resp = Channel.one2one();
        }
    }

    public BlockchainCSP() {
		//El constructor
        // peticiones aplazadas: un canal por operación
		this.chCrear      = Channel.any2one();
		this.chAlertar    = Channel.any2one();
		this.chDisponible = Channel.any2one();
		this.chTransferir = Channel.any2one();	
        // arrancamos el servidor al crear un BlockchainCSP!
        new ProcessManager(this).start();
    }

    public void crear(String idPrivado, String idPublico, int saldo) {
        // enviar peticion al servidor
		PetCrear aux = new PetCrear(idPrivado, idPublico, saldo);
        chCrear.out().write(aux);

        // recibir respuesta y tratar posible excepcion
        int res = (Integer) aux.resp.in().read();
        if (res == -1) {
            throw new IllegalArgumentException("Existe una cuenta asociada al id");
        }
    }

    public void transferir(String idPrivado, String idPublico, int v) {
       // enviar peticion al servidor
		PetTransferir aux = new PetTransferir(idPrivado, idPublico, v);
        chTransferir.out().write(aux);

        // recibir respuesta y tratar posible excepcion
        int res = (Integer) aux.resp.in().read();
        if (res == -1) {
            throw new IllegalArgumentException("Alguna de las cuentas no existe o son la misma cuenta");
        }
    }

    public int disponible(String idPrivado) {
        // enviar peticion al servidor
		PetDisponible aux = new PetDisponible(idPrivado);
        chDisponible.out().write(aux);

        // recibir respuesta y tratar posible excepcion
        int res = (Integer) aux.resp.in().read();
        if (res == -1) {
            throw new IllegalArgumentException("No se encuentra la cuenta pedida");
        }
        return res;
    }

    public void alertarMax(String idPrivado, int max) {
       // enviar peticion al servidor
		PetAlertar aux = new PetAlertar(idPrivado, max);
        chAlertar.out().write(aux);

        // recibir respuesta y tratar posible excepcion
        int res = (Integer) aux.resp.in().read();
        if (res == -1) {
            throw new IllegalArgumentException("M es menor que 0, o no se encuentra la cuenta pedida");
        }
    }

    // Código del servidor
    public void run() {
		final int CREAR      = 0;
		final int DISPONIBLE = 1;
		final int TRANSFERIR = 2;
		final int ALERTAR    = 3;

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
                    // Leemos lo que hemos escrito en los metodos de arriba(crear, transferir, disponible y alertaMax)
                    PetCrear aux0 = (PetCrear) chCrear.in().read();

                    // Escribir un -1 en caso de no cumplir 
                    if (aux0.saldo < 0 || ids.get(aux0.idPublico) != null || cuentas.get(aux0.idPrivado) != null) 
                        aux0.resp.out().write(-1);
                    
					// Aqui la implementacion de cada metodo
					else {
                        ids.put(aux0.idPublico, aux0.idPrivado);
                        cuentas.put(aux0.idPrivado, aux0.saldo);
                        aux0.resp.out().write(1);
                    }
                    break;

                case DISPONIBLE: // CPRE: Cierto
                    // Leemos lo que hemos escrito en los metodos de arriba(crear, transferir, disponible y alertaMax)
                    PetDisponible aux1 = (PetDisponible) chDisponible.in().read();

                    // Escribir un -1 en caso de no cumplir
                    if (!cuentas.containsKey(aux1.idPrivado)) 
                        aux1.resp.out().write(-1);
                
					// Aqui la implementacion de cada metodo
					else {
                        aux1.resp.out().write(cuentas.get(aux1.idPrivado));
                    }
                    break;

                case TRANSFERIR: // CPRE aplazada
                    // Leemos lo que hemos escrito en los metodos de arriba(crear, transferir, disponible y alertaMax)
                    PetTransferir aux2 = (PetTransferir) chTransferir.in().read();

                    // Escribir un -1 en caso de no cumplir
                    if (aux2.saldo <= 0 || ids.get(aux2.idPublico) == null || cuentas.get(aux2.idPrivado) == null ||
                            ids.get(aux2.idPublico).equals(aux2.idPrivado)) 
                                aux2.resp.out().write(-1);

					// Aqui la implementacion de cada metodo
					else {
                        boolean hayCola = false;
		
							for (int i = 0; i < transferencias.size() && !hayCola; i++) {
								hayCola = transferencias.get(i).idPrivado.equals(aux2.idPrivado);
							}
						
                        if (cuentas.get(aux2.idPrivado) < aux2.saldo || hayCola){
                            transferencias.add(aux2);
				}
                         else {
                            cuentas.put(aux2.idPrivado, cuentas.get(aux2.idPrivado) - aux2.saldo);
                            int res = cuentas.get(ids.get(aux2.idPublico));
                            cuentas.put(ids.get(aux2.idPublico), res + aux2.saldo);
                            aux2.resp.out().write(1);
                        }
                    }
                    break;

                case ALERTAR: // CPRE aplazada
                    // Leemos lo que hemos escrito en los metodos de arriba(crear, transferir, disponible y alertaMax)
                    PetAlertar aux3 = (PetAlertar) chAlertar.in().read();

                    // Escribir un -1 en caso de no cumplir
                    if (aux3.saldo_maximo < 0 || !ids.containsValue(aux3.idPrivado)) 
                        aux3.resp.out().write(-1);
                
					// Aqui la implementacion de cada metodo
					else {
                        if (cuentas.get(aux3.idPrivado) <= aux3.saldo_maximo) 
                            alertas.add(aux3);
                         
						else {
                            aux3.resp.out().write(1);
                        }
                    }
                    break;
            }

            // tratamiento de peticiones aplazadas
            boolean signaled = true;
			
            while (signaled) {
				signaled  = false;
				Set<String> pendientes = new HashSet<String>(); //Mapa para saber que idsPrivados ya estan esperando 

				//Sirve para desbloquear las transacciones que ya se puedan 
                for (int i = 0; i < transferencias.size() ; i++) {
                    PetTransferir x = transferencias.get(i);
	
					//comprobamos que x.idPrivado no este en pendientes y que su saldo sea mayor al importe que le pide
                    if (cuentas.get(x.idPrivado) >= x.saldo && !pendientes.contains(x.idPrivado)) {
                        transferencias.remove(i);

						//Aqui se hace el cambio de los valores del saldo de cada uno de los ids
                        cuentas.put(x.idPrivado, cuentas.get(x.idPrivado) - x.saldo);
                        int res = cuentas.get(ids.get(x.idPublico));
                        cuentas.put(ids.get(x.idPublico), res + x.saldo);

                        x.resp.out().write(1);
						i--;
                        signaled = true;
                    }
					else {
						//Se añade esa transferencia a las pendientes
						pendientes.add(x.idPrivado);
					}
                }
				
				//Sirve para desbloquear las alertas que ya se puedan 
                for (int i = 0; i < alertas.size(); i++) {
                    PetAlertar x = alertas.get(i);

					//Comprueba que se cumpla que el saldo sea mayor que el saldo_maximo
                    if (cuentas.get(x.idPrivado) > x.saldo_maximo) {
                        alertas.remove(i);
                        x.resp.out().write(1);
                        signaled = true;
						i--;
                    }
                }
            }
        }
    }// run()
}
