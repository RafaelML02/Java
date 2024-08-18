package aed.skiplist;

import java.util.Random;
import java.util.Iterator;
import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.InvalidKeyException;
import es.upm.aedlib.map.Map;

import es.upm.aedlib.positionlist.*;


public class SkipListMap<K extends Comparable<K>,V> implements Map<K,V> {

	  private K min;  // Un valor menor que cada valor que podria tener una clave
	  private K max;  // Un valor mayor que cada valor que podria tener una clave
	  private PositionList<PositionList<Node<K,V>>> skipList;
	  private Random rnd;

	  public SkipListMap(K min, K max) {
	    this.min = min;
	    this.max = max;
	    this.skipList = new NodePositionList<>();
	    this.rnd = new Random();
	    addEmptyList();
	  }
	  

	  public int size() {
	    return 0;
	  }

	  
	  public boolean isEmpty() {
	    return true;
	  }
	  

	  public boolean containsKey(Object objKey) throws InvalidKeyException {
	    // No hace falta modificar este metodo
	    throw new UnsupportedOperationException();
	  }  	  
//	  

	  public V put(K key, V value) throws InvalidKeyException {
		    if (key == null) {
		        throw new InvalidKeyException();
		    }

		    PositionList<Position<Node<K, V>>> camino = search(key);
		    Position<Position<Node<K, V>>> posicion = camino.last();

		    Position<PositionList<Node<K, V>>> cursor;
		    PositionList<Node<K, V>> list;

		    V valAntiguo = null;
		    Node<K, V> nueva;
		    int numElems = 0;

		    if (posicion != null && posicion.element().element().getKey().equals(key)) {
		        // ya existía, devuelvo el valor que tenía previamente asociado
		        valAntiguo = posicion.element().element().getValue();

		        // si el valor que quiero asociar es distinto del que ya tenía
		        if (!value.equals(posicion.element().element().getValue())) {
		            cursor = skipList.last();
		            list = cursor.element();

		            while (posicion != null && posicion.element().element().getKey().equals(key)) {
		                // me quedo con el nodo
		                nueva = posicion.element().element();
		                // modifico su valor, manteniendo tanto la clave antigua como su below
		                nueva = new Node<K, V>(nueva.getKey(), value, nueva.getBelow());

		                // modifico el nodo que hay en esa posición por el nuevo con el valor actualizado
		                list.set(posicion.element(), nueva);

		                // subo a la lista inmediatamente superior (si no estábamos ya en la primera de todas)
		                cursor = skipList.prev(cursor);
		                if (cursor != null) {
		                    list = cursor.element();
		                }

		                // retrocedo a la anterior posición del camino obtenido por el método search
		                posicion = camino.prev(posicion);
		            }
		        }
		    }

		    // si la clave no fue encontrada
		    else {
		        Position<Node<K, V>> ipos = null;
		        boolean terminar = false;
		        cursor = skipList.last();
		        list = cursor.element();
				numElems ++; // incremento en 1 el número de elementos del mapa

		        while (!terminar) {
		            // creo la nueva entrada con below = ipos
		            nueva = new Node<K, V>(key, value, ipos);

		            // si posicion es distinto de null
		            if (posicion != null) {
		                // insertamos la entrada después de posicion.element()
		                list.addAfter(posicion.element(), nueva);

		                // asignamos a ipos next(posicion.element())
		                ipos = list.next(posicion.element());

		                // retrocedo a la lista inmediatamente superior (si puedo)
		                cursor = skipList.prev(cursor);
		                if (cursor != null) {
		                    list = cursor.element();
		                }
		            } else {
		                // inserto la nueva lista con los extremos (min y max)
		                skipList.addFirst(addEmptyList());

		                // insertamos la nueva entrada
		                list = skipList.first().element();
		                // list.addAfter(list.first(), nueva); // después del primero
		                list.addBefore(list.last(), nueva); // antes del último

		                // ipos = la nueva entrada que acabamos de meter
		                // ipos = list.next(list.first()); // el segundo
		                ipos = list.prev(list.last()); // el penúltimo
		            }

		            // tiramos la moneda y si sale cara termino, si sale cruz y posicion != null -> retrocedo al anterior
		            if (rnd.nextBoolean()) {
		                terminar = true;
		            } else if (posicion != null) {
		                posicion = camino.prev(posicion);
		            }
		        }
		    }

		    return valAntiguo;
		}

	  
	  
//	  public V put(K key, V value) throws InvalidKeyException {
//		    if (key == null) {
//		        throw new InvalidKeyException();
//		    }
//		    PositionList<Position<Node<K, V>>> camino = search(key);
//		    Position<Position<Node<K, V>>> posicion = camino.last();
//		    V valAntiguo = null;
//
//		    if (posicion != null && posicion.element().element().getKey().equals(key)) {
//		        valAntiguo = posicion.element().element().getValue();
//		        if (!value.equals(posicion.element().element().getValue())) {
//		            Position<PositionList<Node<K, V>>> cursor = skipList.last();
//		            PositionList<Node<K, V>> list = cursor.element();
//
//		            while (posicion != null && posicion.element().element().getKey().equals(key)) {
//		                Node<K, V> nodoAntiguo = posicion.element().element();
//		                Node<K, V> nuevoNodo = new Node<>(nodoAntiguo.getKey(), value, nodoAntiguo.getBelow());
//		                list.set(posicion.element(), nuevoNodo);
//		                cursor = skipList.prev(cursor);
//		                if (cursor != null) {
//		                    list = cursor.element();
//		                }
//		                posicion = camino.prev(posicion);
//		            }
//		        }
//		    } else {
//		        // ... Resto de tu lógica para el caso cuando la posición no existe en la skip list.
//		    }
//
//		    return valAntiguo;
//		}




	  
	  
	  
	  
	  
	  
	  
	  

	  public V get(K key) throws InvalidKeyException {
		  V nuevo = null;
		  Position<Node<K, V>> valor = skipList.last().element().first();
		    while (valor != null && nuevo == null) {
		    	if (valor.element().getKey().equals(key)) {
		    		nuevo = valor.element().getValue();
		    	}
		    	valor = skipList.first().element().next(valor);
		    }
		  return nuevo;
	  }

	  public V remove(K key) throws InvalidKeyException {
		  V nuevo = null;
		  Position<Node<K, V>> valor = skipList.last().element().first();
		    while (valor != null && nuevo == null) {
		    	if (valor.element().getKey().equals(key)) {
		    		nuevo = valor.element().getValue();
		    		//ver como eliminar la clave 
		    		skipList.last().element().remove(valor);
		    	}
		    	valor = skipList.first().element().next(valor);
		    }
		  return nuevo;
	  }
	 
	                                                    
	  public Iterable<K> keys() {
		  // No hace falta modificar este metodo
		  return null;
		  }
	  public Iterable<Entry<K,V>> entries() {
		  // No hace falta modificar este metodo
		  return null;
		  }
	  public Iterator<Entry<K,V>> iterator() {
		  // No hace falta modificar este metodo
		  return null;
		  }
	  
	  
	  

	  public String toString() {
	    return skipList.toString();
	  }

	  // Recomendamos terminar y usar este metodo privado
	  private PositionList<Node<K, V>> addEmptyList() {
		    PositionList<Node<K, V>> nueva = new NodePositionList<>();
		    Node<K, V> res1 = new Node<>(min, null, null);
		    Node<K, V> res2 = new Node<>(max, null, null);
		    nueva.addLast(res1);
		    nueva.addLast(res2);
		    skipList.addFirst(nueva);
		    return nueva;
	  }
	  
	  // Recomendamos terminar y usar este metodo privado
	  private PositionList<Position<Node<K,V>>> search(K key) {
		  PositionList<Position<Node<K,V>>> nueva = new NodePositionList<>();
		  Position<PositionList<Node<K,V>>> list = skipList.first();
		  Position<Node<K,V>> pos = list.element().first(); 
		  boolean encontrado = false;
		  while (encontrado) {
			  int res = key.compareTo(list.element().next(pos).element().getKey());
			  
			  
			  //key es menor
			  if(res > 0) {
				  nueva.addLast(pos);
				  pos = pos.element().getBelow();
			  }
			  //key es mayor
			  else{
				  pos = list.element().next(pos);
			  }// del else 
			  
			  
			  //comprobar si exixte siguiente lista
			  if(pos.element().getBelow().equals(null)) {
				  encontrado = true;
			  }// del if
		  }// del while
			  
		  
		  return nueva;
	  }
}