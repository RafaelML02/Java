package aed.treepriorityqueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.tree.*;


public class TreePriorityQueue<K extends Comparable<K>,V> implements PriorityQueue<K,V> {

  public BinaryTree<Entry<K,V>> t;
  private Position<Entry<K,V>> lastPos;

  public TreePriorityQueue() {
    t = new LinkedBinaryTree<>();
    lastPos = null;
  }
  
  
  Position<Entry<K,V>> nextPos(Position<Entry<K,V>> pos){
	  Position<Entry<K,V>> res = null;
	  if(t.isRoot(pos)) 
		 res = pos;
	  
	  else {
		  if(pos.equals(t.right(t.parent(pos))))
			  if(!t.isRoot(t.parent(pos)))
				  res = nextPos(t.parent(pos));
			  else {
				  res = extremoIzq(t.parent(pos));
			  }
		  else {
			  if(!t.hasRight(t.parent(pos)))
				  res = t.parent(pos);
			  else {
				  res = extremoIzq(t.right(t.parent(pos))); 
			  }
		  }  
	  }
	  return res; 
  }
  

	private Position<Entry<K,V>> extremoIzq(Position<Entry<K,V>> pos) {
		while(t.hasLeft(pos))
			pos = extremoIzq(t.left(pos));
		return pos;
	}
	
	Position<Entry<K,V>> nuevoUltimoNodo (Position<Entry<K,V>> pos){
		Position<Entry<K,V>> res = null;
		if(t.isRoot(pos))
			res = extremoDer(pos);
		else {
			if(pos.equals(t.left(t.parent(pos))))
				if(!t.isRoot(t.parent(pos)))
					res = nuevoUltimoNodo(t.parent(pos));
				else {
					res = extremoDer(t.parent(pos));
				}
			else {
				res = extremoDer(t.left(t.parent(pos)));
			}
		}
		return res;
	}
	
	
	private Position<Entry<K,V>> extremoDer(Position<Entry<K,V>> pos) {
		while(t.hasRight(pos))
			pos = extremoDer(t.right(pos));
		return pos;
	}


  public int size() {
    return t.size();
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public Entry<K,V> first() throws EmptyPriorityQueueException {
	  if(isEmpty()) 
		  throw new EmptyPriorityQueueException();
	  else {
		  return t.root().element();
	  }
  }

  
  public void enqueue(K k, V v) {  
	    Entry<K, V> nueva = new EntryImpl<>(k, v);
	    if (isEmpty()) 
	        lastPos = t.addRoot(nueva);
	    else 
	        if (t.hasLeft(nextPos(lastPos))) {
	        	Position<Entry<K, V>> x = t.insertRight(nextPos(lastPos), nueva);
	            lastPos = x;
	        } 
	        else {
	        	Position<Entry<K, V>> y = t.insertLeft(nextPos(lastPos), nueva);
	        	lastPos = y;
	        }
	        upHeap(lastPos);
	        
	    }
  
  
  public void upHeap(Position<Entry<K, V>> posicion) {
      while (t.parent(posicion) != null &&
              posicion.element().getKey().compareTo
              (t.parent(posicion).element().getKey()) < 0) {
          Entry<K, V> aux = posicion.element();
          t.set(posicion, t.parent(posicion).element());
          t.set(t.parent(posicion), aux);
          posicion = t.parent(posicion);
          }
          }

  

  public Entry<K,V> dequeue() throws EmptyPriorityQueueException {
		if(isEmpty())
			throw new EmptyPriorityQueueException();		
	
		Entry<K,V> res = t.root().element();		
		if(!t.hasLeft(t.root()) && !t.hasRight(t.root())) {
			BinaryTree<Entry<K,V>> aux = new LinkedBinaryTree<>();
			t = aux;
			lastPos = t.root();
		}		
		else {
			t.set(t.root(), lastPos.element());
		    Position<Entry<K, V>> ultimo = lastPos;
		    lastPos = nuevoUltimoNodo(lastPos);
		    t.remove(ultimo);
		    downHeap(t.root()); 
		}
		return res;
	}
  
  private void downHeap(Position<Entry<K,V>> pos) {
	    if (t.hasLeft(pos) || t.hasRight(pos)) {
	        Position<Entry<K, V>> izquierda = t.left(pos);
	        Position<Entry<K, V>> derecha = t.right(pos);

	        if (derecha == null || izquierda.element().getKey().compareTo(derecha.element().getKey()) < 0) {
	            if (izquierda.element().getKey().compareTo(pos.element().getKey()) < 0) {
	                Entry<K, V> aux = pos.element();
	                t.set(pos, t.left(pos).element());
	                t.set(t.left(pos), aux);
	                downHeap(izquierda);
	            }
	        } else {
	            if (derecha.element().getKey().compareTo(pos.element().getKey()) < 0) {
	                Entry<K, V> aux = pos.element();
	                t.set(pos, t.right(pos).element());
	                t.set(t.right(pos), aux);
	                downHeap(derecha);
	            }
	        }
	    }
	}


  public String toString() {
    return t.toString();
  }

@Override
public Iterator<Entry<K, V>> iterator() {
	return t.iterator();
	
}

}