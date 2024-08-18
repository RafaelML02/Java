import java.util.Iterator;
import java.util.NoSuchElementException;

import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;

public class SkipNullsIterator <E> implements Iterator<E>{
	IndexedList <E> l;
	int cursor;
		
	public SkipNullsIterator (IndexedList<E> l) {
		this.l= l;
		this.cursor = 0;
		avanzar();
	}
	
	public boolean avanzar() {
		boolean not_interesting = true ;
		while(cursor <l.size() && not_interesting) {
			E e = l.get(cursor);
			if(e == null) cursor++;
			else
				not_interesting = false;
		}
		return not_interesting;
	}
	
	public boolean hasNext() {
		if(cursor >= l.size()) return false ;
		else return true;
	}
	
	public E next() {
		if(cursor >= l.size()) throw new NoSuchElementException();
		else {
			E e = l.get(cursor);
			cursor++;
			avanzar();
			return e;
		}
	}
	
	
	public static void main(String []args) {
		
	}

}
