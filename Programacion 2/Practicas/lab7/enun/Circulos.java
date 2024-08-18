package lab7.enun;


public class Circulos {
	
	public class Node<E>{
		E element;
		Node<E> next;
		
		Node(E e, Node<E> a){
			element = e ;
			next = a;
		}
	}
	
	
	Node<Circulo> inicio;
	
	public Circulos(){
		inicio = null;
	}
	
	public String toString() {
		String res = "";
		Node<Circulo> aux = inicio;
		int n = 1;
		while(aux!= null) {
			res += "El circulo numero " + n + "tiene de coordenadas " 
		+  aux.element.x + ", " + aux.element.y + "y de radio " +
					aux.element.radio + ".";
			n++;
			aux = aux.next;
		}
		return res;
	}
	
	public void addFirst(Circulo c) {
		Node<Circulo> res = new Node<>(c,inicio);
		inicio = res;
	}
	
	public void addLast(Circulo c) {
		Node<Circulo> res = new Node<>(c,inicio);
		if(inicio == null) inicio = res;
		else {
			Node<Circulo> aux = inicio; 
			while(aux.next != null) {
				aux = aux.next;				
			}
			aux.next = res;
		}
	}
	
	int size() {
		Node<Circulo> aux = inicio;
		int res = 0;
		while(aux != null) {
			res ++;
			aux = aux.next;
		}
		return res;
	}
	
	Circulo get(int pos) {
		Circulo res = null;
		Node<Circulo> aux = inicio;
		int i = 0;
		while(aux != null) { 
			if(i != pos) {
				aux = aux.next;
				i++;
			}
			else {
				res = aux.element;
			}
		}
		return res;
	}

}
