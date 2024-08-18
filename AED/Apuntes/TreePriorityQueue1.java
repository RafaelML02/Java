

	public Entry<K,V> dequeue() throws EmptyPriorityQueueException {
		if(isEmpty())
			throw new EmptyPriorityQueueException();		
	
		Entry<K,V> res = t.root().element();		
		if(size() == 1) {
			t = new LinkedBinaryTree<>();
			lastPos = null;
		}		
		else {
			intercambio(t.root(), lastPos); 
			Position<Entry<K,V>> ultimo = lastPos; 
			lastPos = ultimoNodoTrasBorrar(lastPos);
			t.remove(ultimo);
			downHeapBubbling(t.root()); 
		}
		
		return res;
	}
	

	private void downHeapBubbling(Position<Entry<K,V>> p) {
		if(!t.isExternal(p)) { // si no es un nodo hoja (tiene, al menos, un hijo)
			
			Position<Entry<K,V>> izq = t.left(p), der = t.right(p), menor;
			
			// si no tiene hijo derecho o si la clave del hijo izq < la clave del hijo derecho -> el izq es el mas pequenio
			if(der == null || izq.element().getKey().compareTo(der.element().getKey()) < 0)
				menor = izq;
			else // si no, el derecho es el mas pequenio
				menor = der;
			
			// si la clave del padre es mayor que la del nodo etiquetado como menor, entonces se produce el intercambio
			// y sigo estudiando 
			if(p.element().getKey().compareTo(menor.element().getKey()) > 0) {
				intercambio(menor,p);
				downHeapBubbling(menor);
			}
		}
	}
	}

