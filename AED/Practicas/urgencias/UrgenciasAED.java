package aed.urgencias;




import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.map.*;

import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import java.util.Iterator;



public class UrgenciasAED implements Urgencias {
	private HeapPriorityQueue<Paciente,Paciente> urgencias = new HeapPriorityQueue<>();
	private Map<String,Entry<Paciente, Paciente>> DNIs = new HashTableMap<>();
	

	int pacientesAtendidos = 0;
	int tiempoTotal = 0;
	
	//log n
	public Paciente admitirPaciente(String DNI, int prioridad, int hora) throws PacienteExisteException {
		if(DNIs.containsKey(DNI))
			throw new PacienteExisteException();
		Paciente x = new Paciente(DNI, prioridad, hora, hora);
		DNIs.put(DNI, urgencias.enqueue(x, x));
		return x;
	}

	
	@Override
	public Paciente salirPaciente(String DNI, int hora) throws PacienteNoExisteException {
		if(!DNIs.containsKey(DNI)) {
				throw new PacienteNoExisteException();
			}
		 urgencias.remove(DNIs.get(DNI));
		 return DNIs.remove(DNI).getValue();
		}
	

	@Override
	public Paciente cambiarPrioridad(String DNI, int nuevaPrioridad, int hora) throws PacienteNoExisteException {
		if(!DNIs.containsKey(DNI))
			throw new PacienteNoExisteException();
		
		Paciente x = DNIs.get(DNI).getValue();

		if(x.getPrioridad()== nuevaPrioridad)
			return x;
		else {
			urgencias.remove(DNIs.get(DNI));
			DNIs.remove(DNI);
			
			x.setPrioridad(nuevaPrioridad);
			x.setTiempoAdmisionEnPrioridad(hora);
			
			DNIs.put(DNI, urgencias.enqueue(x, x));
			return x;	
		}
	}

	@Override

	public Paciente atenderPaciente(int hora) {
		if(DNIs.isEmpty()) {
			return null;
		}
		else {
			pacientesAtendidos ++;
			Paciente x = urgencias.first().getValue();
			tiempoTotal += hora - x.getTiempoAdmision();
			DNIs.remove(urgencias.dequeue().getValue().getDNI());
			return x;
	}
	}


	//n log n
	@Override
	public void aumentaPrioridad(int maxTiempoEspera, int hora) {
	    Iterator<Entry<Paciente, Paciente>> it = urgencias.iterator();
	    while (it.hasNext()) {
	        Entry<Paciente, Paciente> entradaActual = it.next();
	        Paciente x = entradaActual.getKey();

	        if(hora-x.getTiempoAdmisionEnPrioridad() > maxTiempoEspera && x.getPrioridad()!= 0) {
	    			urgencias.remove(DNIs.get(x.getDNI()));
	    			DNIs.remove(x.getDNI());
	    			
	    			x.setPrioridad(x.getPrioridad()-1);
	    			x.setTiempoAdmisionEnPrioridad(hora);
	    			
	    			DNIs.put(x.getDNI(), urgencias.enqueue(x, x));	
	    		}
	        }
	    }

	


	@Override
	public Iterable<Paciente> pacientesEsperando() {
		IndexedList<Paciente> pacientes = new ArrayIndexedList<>();
        Iterator<Entry<Paciente, Paciente>> it = urgencias.iterator();
		while(it.hasNext()) {
			Entry<Paciente,Paciente> x = it.next();
			ordenar(x.getValue(), pacientes);
			
		}
		return pacientes;
        }
	
	
	
//	public static List<Paciente> ordenar(List<Paciente> a) {
//        Collections.sort(a);
//        return a;
//	}


	
	private IndexedList<Paciente> ordenar(Paciente x, IndexedList<Paciente> pacientes) {
	    int x1,x2,x3;
	    boolean encontrado = false;
	    
	    x1 = 0;
	    x2 = pacientes.size() - 1;

	    while(x1 < x2 && !encontrado) {
	      x3 = (x1 + x2) / 2;
	      
	      switch(x.compareTo(pacientes.get(x3))) {
	      case -1 :
	    	  x2 = x3 - 1;
	    	  break;
	    	  
	      case 0 : 
	    	  pacientes.add(x3,x);
	    	  encontrado = true;
	    	  break;
	    	  
	      case 1 : 
	    	  x1 = x3 + 1;
	      }
	      }
	      
	    if (!encontrado && (pacientes.isEmpty() || x.compareTo(pacientes.get(x1)) <= 0)) {
	    	pacientes.add(x1, x);
	    }
			else if (!encontrado) {
				pacientes.add(x1 + 1, x);
	    }
	    
	    return pacientes;
	  }
	
	
	//o(1)
	@Override
	public Paciente getPaciente(String DNI) {
        Entry<Paciente, Paciente> aux = DNIs.get(DNI);
        if(aux == null){
            return null;
        }
        return aux.getValue();
    }
	@Override
	public Pair<Integer, Integer> informacionEspera() {
		return new Pair<>(tiempoTotal, pacientesAtendidos);
	}


}