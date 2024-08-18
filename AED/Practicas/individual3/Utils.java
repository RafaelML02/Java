package aed.individual3;

import java.util.Iterator;

public class Utils {
    public static boolean estaOrdenadoInverso(Iterable<Integer> l) {
        Iterator<Integer> it = l.iterator();
        Integer anterior = null;
        while (it.hasNext()) {
            Integer cursor = it.next();
            if (cursor != null) {
                if (anterior != null && anterior.compareTo(cursor) < 0) {
                    return false;
                }
                anterior = cursor;
            }
        }
        return true;
    }
    
	
    public static boolean estaOrdenado(Iterable<Integer> l) {
        Iterator<Integer> it = l.iterator();
        Integer anterior = null;
        while (it.hasNext()) {
            Integer cursor = it.next();
            if (cursor != null) {
                if (anterior != null && anterior.compareTo(cursor) > 0) {
                    return false;
                }
                anterior = cursor;
            }
        }
        return true;
    }
    
    
  public static boolean isArithmeticSequence(Iterable<Integer> l) {
	  boolean resultado = true;
	  Iterator<Integer> it = l.iterator();
	  Integer anterior = null;
	  Integer diferencia = null;
	  
	  if(!estaOrdenado(l)  && !estaOrdenadoInverso(l)) resultado = false;

	  
	  while(it.hasNext() && resultado == true) {
		  Integer cursor = it.next();
		  // si el cursor es null ya pasas al siguiente 
		  if(cursor != null) {
			  // si anterior es null, le agencias el primer valor
			  if(anterior == null) anterior = cursor;
			  else {
				  // si diferencia es null, la calculas
				  if(diferencia == null) {
					  diferencia = cursor - anterior;
					  anterior = cursor;
				  } // del segundo if
				  else{
					  Integer suma = anterior + diferencia;
					  // compruebas que se cumple el requisito
					  if(suma != cursor) resultado = false;
					  else {
						  anterior = cursor;
					  }  
			  } // del segundo else
				  } // del primer else
			  } // del primer if
		  } // del while
	  return resultado;
  } // del metodo
  } // de la clase







