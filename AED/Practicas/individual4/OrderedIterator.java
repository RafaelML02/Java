package aed.individual4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.positionlist.PositionList;

public class OrderedIterator implements Iterator<Integer> {
	    PositionList<Integer> lista;
	    Position<Integer> cursor;

	    public OrderedIterator(PositionList<Integer> list) {
	        this.lista = list;
	        this.cursor = list.first(); // Inicializa el cursor al primer elemento de la lista.
	    }
	    @Override
	    public boolean hasNext() {
	        return cursor != null; // Devuelve true si hay un próximo elemento en la lista.
	    }

	    @Override
	    public Integer next() throws NoSuchElementException {
	        if (!hasNext()) {
	            throw new NoSuchElementException("No hay más elementos en la lista.");
	        }
	        Integer value = cursor.element(); // Obtiene el elemento en la posición actual.
	        // Encuentra el siguiente elemento mayor o igual al valor actual.
	        Position<Integer> siguiente = lista.next(cursor);
	        while (siguiente != null && siguiente.element() < value) {
	        	siguiente = lista.next(siguiente);
	        }
	        // Actualiza la posición actual al siguiente elemento mayor o igual.
	        cursor = siguiente;
	        return value;
	    }

	    
}

