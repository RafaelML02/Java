import java.util.Iterator;
import java.util.NoSuchElementException;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;


public class ReserveIterator <E> implements Iterator<E> {
	PositionList <E> l;
	Position <E> cursor;
	Position <E> loQueDeboBorrar = null;
	
	public ReserveIterator(PositionList<E> l) {
		this.l = l;
		this.cursor = l.last();
		
	}
	public boolean hasNext() {
		return cursor != null;
		
	}
	
	public E next() {
		if(cursor == null) 
			throw new NoSuchElementException();
		E e = cursor.element();
		loQueDeboBorrar = cursor;
		cursor = l.prev(cursor);
		return e;
		}
	
	public void remove() {
		if(loQueDeboBorrar == null)
			throw new IllegalStateException();
		l.remove(loQueDeboBorrar);
		loQueDeboBorrar = null;
	}
	
	
	public static void main(String []args) {
		PositionList<Integer> l = new NodePositionList<>(new Integer[] {1,2,3,4,5});
		System.out.println("l tiene elementos " +l);
//		ReserveIterator <Integer> rit = new ReserveIterator<Integer>();
//		while(rit.hasNext()) {
//			System.out.println(rit.next());
//		}
		
		
	}

}
