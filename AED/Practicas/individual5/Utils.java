package aed.individual5;

import java.util.Iterator;
import java.util.Map;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.map.*;



public class Utils {
	
	public static <E> boolean iguales(PositionList<E> l, E elem) {
	    for (E elemento : l) {
	        if ((elemento == null && elem == null) || 
	        		(elemento != null && elemento.equals(elem))) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
  public static <E> PositionList<E> deleteRepeated(PositionList<E> l) {
    PositionList<E> nueva = new NodePositionList <>();
    Position<E> cursor = l.first();	
    boolean hayUnNull = false;
    
	        while (cursor != null) {
	        	if(cursor.element() == null) {
	        		if(!hayUnNull) {
	        			nueva.addLast(null);
	        			hayUnNull = true;
	        		}
	        	}
	        	else if (!iguales(nueva, cursor.element())) {
	        		nueva.addLast(cursor.element());  
	            } 
	            	cursor = l.next(cursor);
	        }
	    return nueva;
	}



  
//  public static <E> PositionList<E> compactar (Iterable<E> lista) {
//	  if(lista == null) throw new IllegalArgumentException();
//	  PositionList<E> nueva = new NodePositionList <>();
//	  Iterator<E> it = lista.iterator(); 
//	  
//	  while(it.hasNext()) {
//		  E value = it.next();
//		  
//		  if(value == null) {
//			  nueva.addLast(null);
//			  if(it.hasNext()) {
//				  value = it.next();
//				  if(value == null)
//					  if(it.hasNext()) { 
//						  value = it.next();}
//						  
//				  else {
//					  nueva.addLast(value);
//				  }}}
//		  else {	
//			  nueva.addLast(value);
//			  if(it.hasNext()) {
//				  value = it.next();
//				  E elem = nueva.last().element();
//				  if(!value.equals(elem))
//					  nueva.addLast(value);
//			  }}}
//	  
//	  return nueva;
//	    
//  }
  public static <E> PositionList<E> compactar(Iterable<E> lista) {
	    if (lista == null) throw new IllegalArgumentException();
	    PositionList<E> nueva = new NodePositionList<>();
	    Iterator<E> it = lista.iterator();
	    E lastValue = null;

	    while (it.hasNext()) {
	        E value = it.next();

	        if (value != null && (lastValue == null || !value.equals(lastValue))) {
	            nueva.addLast(value);
	        } else if (lastValue == null) {
	            nueva.addLast(value);
	        }

	        lastValue = value;
	    }

	    return nueva;
	}







  




  
  public static Map<String,Integer> maxTemperatures(TempData[] tempData) {
    return null;
  }
  
}


