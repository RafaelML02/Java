package Entregas;
import es.upm.babel.cclib.Semaphore;
//TODO: importar la clase de los semáforos.
//

//Almacén FIFO concurrente para N datos

class AlmacenN {
 private int capacidad = 0;
 private int[] almacenado = null;
 private int nDatos = 0;
 private int aExtraer = 0;
 private int aInsertar = 0;

 // TODO: declaración de los semáforos necesarios
 // 
 // 
 // 
 public static Semaphore almacenar = new Semaphore(1);
 public static Semaphore extraer = new Semaphore(1);
 public static Semaphore contador = new Semaphore(1);

 public AlmacenN(int n) {
	capacidad = n;
	almacenado = new int[capacidad];
	nDatos = 0;
	aExtraer = 0;
	aInsertar = 0;

	// TODO: inicialización de los semáforos
	//       si no se ha hecho más arriba
	// 
	// 
	
 }
 

 public void almacenar(int producto) {
	// TODO: protocolo de acceso a la sección crítica y código de
	// sincronización para poder almacenar.
	// 
	// 
	 almacenar.await();
	 contador.await();
	 while (nDatos == capacidad) {
		 contador.signal();
         almacenar.signal();
         almacenar.await();
         contador.await();
	 }

	// Sección crítica //////////////
	almacenado[aInsertar] = producto;
	nDatos++;
	aInsertar++;
	aInsertar %= capacidad;
	// //////////////////////////////

	// TODO: protocolo de salida de la sección crítica y código de
	// sincronización para poder extraer.
	// 
	// 
	contador.signal();
	almacenar.signal();
 }

 public int extraer() {
	int result = 0;

	// TODO: protocolo de acceso a la sección crítica y código de
	// sincronización para poder extraer.
	// 
	// 
	 extraer.await(); 
	 contador.await();
     while (nDatos == 0) {
         extraer.signal();
         contador.signal();
         contador.await();
         extraer.await();
     }

	// Sección crítica ///////////
	result = almacenado[aExtraer];
	nDatos--;
	aExtraer++;
	aExtraer %= capacidad;
	// ///////////////////////////

	// TODO: protocolo de salida de la sección crítica y código de
	// sincronización para poder almacenar.
	// 
	// 
	contador.signal();
	extraer.signal();

	return result;
 }
}
