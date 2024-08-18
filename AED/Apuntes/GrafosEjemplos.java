import java.util.Iterator;

import es.upm.aedlib.Position;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.UndirectedGraph;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;

public class GrafosEjemplos {
	public static <Integer> void invertir(PositionList<Integer>list) {
		if(list == null)
			throw new IllegalArgumentException();
			if(list.size() > 1) {
			invertirRec(list,list.first(),list.last(),0, list.size()/2);
			}
			}
	
			private static <E> void invertirRec(PositionList<E> list, Position<E> f,
			Position<E> l, int cont, int size) {
			if(cont < size) {
			E elem = f.element();
			list.set(f,l.element());
			list.set(l,elem);
			invertirRec(list, list.next(f), list.prev(l), cont+1, size);
			}
			}

		
	
		
		
		
		
		public static void main(String []args) {
			PositionList<Integer> x= new NodePositionList<>();
			x.addLast(1);
			x.addLast(2);
			x.addLast(3);
			x.addLast(4);
			x.addLast(5);
			x.addLast(6);

			System.out.println(x);
			
			invertir(x);
			System.out.println(x);
			
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


