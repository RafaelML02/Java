package Java.Concurrencia.Practica1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.babel.cclib.Monitor;

public class BlockchainPrueba implements Blockchain {

    private Map<String, Integer> c1;
    private Map<String, String> id1;

    private Monitor mutex;
    private List<EspTransferir> condicion1; 
    private List<EspAlertar> condicion2; 

    public BlockchainPrueba() {
        c1 = new HashMap<String, Integer>();
        id1 = new HashMap<String, String>();

        mutex = new Monitor();
        condicion1 = new ArrayList<EspTransferir>();
        condicion2 = new ArrayList<EspAlertar>();
    }

    //Crear una cuenta con un saldoinicial
    public void crear(String idPrivado, String idPublico, int v) {
        if(v < 0 || id1.get(idPublico) != null || c1.get(idPrivado) != null) 
            throw new IllegalArgumentException();

        mutex.enter();

        id1.put(idPublico, idPrivado);
        c1.put(idPrivado, v);

        desbloqueoSimple();
        mutex.leave();
    }













    
    //Transferir fondos de una cuenta a otra
    public void transferir(String idPrivado, String idPublico, int v) {
        if(v <= 0 || id1.get(idPublico) == null || c1.get(idPrivado) == null || id1.get(idPublico).equals(idPrivado)) 
            throw new IllegalArgumentException();

        mutex.enter();

        boolean encontrado = false;
        for(int i=0; i < condicion1.size() && !encontrado; i++) {
            encontrado = condicion1.get(i).id.equals(idPrivado);
        }

        if(encontrado || c1.get(idPrivado) < v) {
            EspTransferir et = new EspTransferir(idPrivado, v);
            condicion1.add(et);
            et.c.await();
        }

        int cantCuentaOrigen = c1.get(idPrivado);
        c1.put(idPrivado, cantCuentaOrigen - v); 
        String idPrivDestino = id1.get(idPublico);
        int cantCuentaDestino = c1.get(idPrivDestino);
        c1.put(idPrivDestino, cantCuentaDestino + v); 

        desbloqueoSimple();
        mutex.leave();
    }

//Declarar una alerta cuando el saldo de una cuenta sube por encima de un determinado saldo
    public void alertarMax(String idPrivado, int m) {
        if(m < 0 || !id1.containsValue(idPrivado))
            throw new IllegalArgumentException();

        mutex.enter();

        if(c1.get(idPrivado) <= m) {
            EspAlertar ea = new EspAlertar(idPrivado, m);
            condicion2.add(ea);
            ea.c.await();
        }

        desbloqueoSimple();
        mutex.leave();
    }
    
//Comprobar el saldo disponible en una cuenta
    public int disponible(String idPrivado) {
        if(!c1.containsKey(idPrivado)) 
            throw new IllegalArgumentException();

        int result = 0;

        mutex.enter();
        result = c1.get(idPrivado);
        desbloqueoSimple();
        mutex.leave();

        return result;
    }

//El metodo de desbloqueo
    private void desbloqueoSimple() {
        boolean desbloqueado = false;
        
        if(condicion2.size() > 0) {
            for(int i=0; i < condicion2.size() && !desbloqueado; i++) {
                EspAlertar ea = condicion2.get(i);
                if(c1.get(ea.id) > ea.valor) {
                    desbloqueado = true;
                    condicion2.remove(i);
                    ea.c.signal();
                }
            }
         }

        if(condicion1.size() > 0 && !desbloqueado) {
            for(int i=0; i < condicion1.size() && !desbloqueado; i++) {
                EspTransferir et = condicion1.get(i);
                if(c1.get(et.id) >= et.valor) {
                    desbloqueado = true;
                    condicion1.remove(i);
                    et.c.signal();
                }
            }
        }
    }

    private class EspTransferir {
        String id;
        int valor;
        Monitor.Cond c;

        EspTransferir(String id, int valor) {
            this.id = id;
            this.valor = valor;
            c = mutex.newCond();
        }
    }

    private class EspAlertar {
        String id;
        int valor;
        Monitor.Cond c;

        EspAlertar(String id, int valor) {
            this.id = id;
            this.valor = valor;
            c = mutex.newCond();
        }
    }
}
