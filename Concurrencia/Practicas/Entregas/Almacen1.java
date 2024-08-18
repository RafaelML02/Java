package Entregas;
import es.upm.babel.cclib.Semaphore;

public class Almacen1 {// TODO: importar la clase de los semáforos.
	// w

	// Almacen concurrente para un dato
	    // Producto a almacenar
	    private int almacenado;
	    
	    // TODO: declaración e inicialización de los semáforos
	    // necesarios
	    //
	    //
	    public static Semaphore almacenar = new Semaphore(1);
	    public static Semaphore extraer = new Semaphore(0);
	    

	    public Almacen1() {
	    	 almacenado = 0;
	    } 
	    
	    public void almacenar(int producto) {
	    	// TODO: protocolo de acceso a la sección crítica y código de
			// sincronización para poder almacenar.
			//
	    	almacenar.await();;
	    	// Sección crítica
	    	almacenado = producto;

		// TODO: protocolo de salida de la sección crítica y código de
		// sincronización para poder extraer.
		//
	    	extraer.signal(); 
	    	almacenar.signal();
	    }

	    public int extraer() {
		int result = 0;

		// TODO: protocolo de acceso a la sección crítica y código de
		// sincronización para poder extraer.
		// 
		extraer.await();
		almacenar.await();
		// Sección crítica
		result = almacenado;

		// TODO: protocolo de salida de la sección crítica y código de
		// sincronización para poder almacenar.
		// 
		almacenado = 0; 
		almacenar.signal();
		
		return result;
	    }
	}

