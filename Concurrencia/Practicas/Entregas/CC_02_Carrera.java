package Entregas;

import java.util.Iterator;
import java.util.PriorityQueue;

//TODO: importa aquí las clases que necesites

public class CC_02_Carrera {

private static final int NDATOS = 1000;
private static int numero;


// TODO: declara e inicializa aquí la variable con la cola
// compartida

private static PriorityQueue<Integer> cola = new PriorityQueue<>();


private static class Productor extends Thread {
 private int inicial;
 
 public Productor(int inicial) {
   this.inicial = inicial;
 }
 
 public void run() {
	 for (int i = 0; i < NDATOS; i++) {
	        cola.add(inicial);
	        inicial += 2;
	      }
 } // del for
} // del productor

private static class Consumidor extends Thread {
 public void run() {
   // TODO: extraer e imprimir uno a uno todos los datos de la
   // cola, pensar en qué pasa si la cola está vacía
	 numero = cola.size();
	 Iterator<Integer> it = cola.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
 }
}

public static void main(String[] args)
 throws InterruptedException {
 
 Thread par = new Productor(0);
 Thread impar = new Productor(1);
 Thread c = new Consumidor();
 
 par.start();
 impar.start();
 c.start();
 
 par.join();
 impar.join();
 c.join();
 
 // TODO: si todos los procesos terminan imprimir el número de
 // elementos en la cola
 System.out.println(numero);
}
}
