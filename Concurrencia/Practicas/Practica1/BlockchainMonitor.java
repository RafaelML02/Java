package Java.Concurrencia.Practica1;
//package cc.blockchain; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.babel.cclib.Monitor;



public class BlockchainMonitor implements Blockchain {

    //Creamos las variables que se necesitaran en la practica
    // que luego les daremos valor en el constructor

    private Map<String, Integer>cuentas;        // un mapa de todas las cuentas, la clave es el idPublico y el Integer el valor
    private Map<String, String> ids;            // un mapa de todos los ids, la clave es el idPrivado y el segundo es la id publica
    private Monitor mutex;                      //El monitor que usaremos 
 
    private List<Auxiliar> transferencias;   //Una lista de transferencias que no se pueden realizar porque no cumplen la PRE
    private List <Auxiliar> alertas;       //Una lista de alertas que no se pueden realizar porque no cumplen la PRE
  


// Creamos el constructor para darle valor a las variables que hemos declarado arriba
    public BlockchainMonitor() {
        cuentas = new HashMap<>();
        ids = new HashMap<>();
        mutex = new Monitor();

        transferencias = new ArrayList<>();
        alertas = new ArrayList<>();
    }

    //Crear una cuenta con un saldoinicial
    public void crear(String idPrivado, String idPublico, int v) {
        //Lanzamos la excepcion
        if(v<0 || cuentas.containsKey(idPublico) || cuentas.containsKey(ids.get(idPrivado)))
            throw new IllegalArgumentException("Existe una cuenta asociada al id");
            
        //Entramos en la seccion critica
        mutex.enter();
        
        // Codigo de la operacion
        cuentas.put(idPublico, v);
        ids.put(idPrivado, idPublico);
        desbloqueoSimple();

        //Salimos de la seccion critica
        mutex.leave();
    
    }

    //Transferir fondos de una cuenta a otra
    public void transferir(String idPrivado, String idPublico, int v) {
        //Lanzamos la excepcion
        if(v<=0 || !cuentas.containsKey(idPublico) || 
        !cuentas.containsKey(ids.get(idPrivado)) || ids.get(idPrivado).equals(idPublico))
            throw new IllegalArgumentException("Alguna de las cuentas no existe o son la misma cuenta");
        
        //Entramos en la seccion critica
        mutex.enter();
        boolean hayCola = false;

        //bucle para comprobar si la cuenta privada(la que manda el dinero) ya tiene un proceso bloqueado 
        for(int i = 0; i<transferencias.size() && !hayCola; i++){
            hayCola = transferencias.get(i).idPrivado.equals(idPrivado);
        }

        // Codigo de la operacion
        //Se comprueba que se cumpla la PRE y tambien que no este metida ya 
        //dentro de las transferencias pendientes la cuenta que manda el dinero
        if(cuentas.get(ids.get(idPrivado)) < v || hayCola){
            Auxiliar x = new Auxiliar(idPrivado, idPublico, v);
            hayCola = true;
            transferencias.add(x);
            x.c.await();
        }

        //Aqui se actualizan las dos cuentas para finalizar la transaccion
        cuentas.put(idPublico, cuentas.get(idPublico) + v);
        
        //Creo una variable que sea el idPublico de la cuenta origen 
        String idPublico_origen = ids.get(idPrivado);
        cuentas.put(idPublico_origen, cuentas.get(idPublico_origen) - v);
        desbloqueoSimple();

        //Salimos de la seccion critica
        mutex.leave();
    }

    //Declarar una alerta cuando el saldo de una cuenta sube por encima de un determinado saldo
    public void alertarMax(String idPrivado, int m) {
        //Lanzamos la excepcion
        if(m<0 || !cuentas.containsKey(ids.get(idPrivado)))
            throw new IllegalArgumentException("M es menor que 0, o no se encuentra la cuenta pedida");
        
        //Entramos en la seccion critica
        mutex.enter();
     
        // Codigo de la operacion
        //Se comprueba que se cumpla la PRE
        if(cuentas.get(ids.get(idPrivado)) <= m){
            Auxiliar x = new Auxiliar(idPrivado, ids.get(idPrivado), m);
            alertas.add(x);
            x.c.await();
        }
            
        desbloqueoSimple();
        
        //Salimos de la seccion critica
        mutex.leave();
    }

    //Comprobar el saldo disponible en una cuenta
    public int disponible(String idPrivado){
        //Lanzamos la excepcion
        if(!cuentas.containsKey(ids.get(idPrivado)))
            throw new IllegalArgumentException("No se encuentra la cuenta pedida");
    
        //Entramos en la seccion critica
        mutex.enter();
        desbloqueoSimple();
       
        //Salimos de la seccion critica
        mutex.leave();
        
        //Returnamos lo que pide
        return cuentas.get(ids.get(idPrivado));
    }

    //El metodo de desbloqueo
    private void desbloqueoSimple() {
        boolean signaled = false;   //El boolean para que salga en cuanto se ponga a true y asi no recorra todo el bucle
        Map <String, String> pendientes = new HashMap<>(); //Creamos un mapa de las transferencias pendientes

        // Desbloquear transferencias pendientes
        if (!transferencias.isEmpty()) {
            for (int i = 0; i < transferencias.size() && !signaled; i++) {
                Auxiliar x = transferencias.get(i);
                
                //Comprobamos que el dinero de la cuenta sea mayor que el dinero que le piden 
                //y ademas comprobamos que no hay ningun transferencia pendiente de esa cuenta 
                if (cuentas.get(ids.get(x.idPrivado)) >= x.dinero && !pendientes.containsKey(x.idPrivado)) {
                    transferencias.remove(i);
                    pendientes.remove(x.idPrivado);
                    signaled = true;
                    x.c.signal();
              }  
              else if(!pendientes.containsKey(x.idPrivado))
                 pendientes.put(x.idPrivado, null);
            }
        }
    
        // Desbloquear alertas pendientes
        if (!alertas.isEmpty() && !signaled) {
            for (int i = 0; i < alertas.size() && !signaled; i++) {
                Auxiliar x = alertas.get(i);
                //Comprobamos si se cumple la PRE antes de desbloquearlo
                if (cuentas.get(ids.get(x.idPrivado)) > x.dinero) {
                    alertas.remove(i);
                    signaled = true;
                    x.c.signal();
                } 
            }
        }
    }


//Clase auxiliar para crear los objetos que se puedan guardar en las listas transferencias y alertas
//Cada objeto creado tendra una Monitor.Cond que sea la que quede bloqueada y la que se tenga que desbloquear
    private class Auxiliar{
        private String idPrivado;
        private int dinero;
        Monitor.Cond c;

         Auxiliar(String a, String b, int d){
            idPrivado = a;
            dinero = d;
            c = mutex.newCond();
    }
}
}



