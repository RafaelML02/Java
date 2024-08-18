package clase;
import es.upm.babel.cclib.Monitor;

public class ParkingMon {
	 private Monitor mutex;
	 private Monitor.Cond esperarHueco;

	    // SEMANTICA 
	    // DOMINIO:
	    // TIPO: Parking = N 
	    private int huecos;

	    private static int CAP = 5;

	    // INVARIANTE: cierto 

	    public ParkingMon() {
		mutex = new Monitor();
		esperarHueco = mutex.newCond();

		// INICIAL: self = cap 
		this.huecos = CAP;
	    }
	    // entrar()
	    public void entrar() {
		mutex.enter();
		// código de bloqueos (CPRE)
		// CPRE: self > 0
		if(this.huecos == 0) {
		    esperarHueco.await();
		}
		// código que implementa la POST
		// POST: self = selfpre - 1 
		this.huecos = this.huecos - 1;
		// código de desbloqueos 
		mutex.leave();
	    }
	    // salir() 
	    public void sal() {
		mutex.enter();
		// CPRE: Cierto
		// POST: self = selfpre + 1
		this.huecos = this.huecos + 1;

		// IMPORTANTE!!!!! NO OLVIDAR
		esperarHueco.signal();
		mutex.leave();
		}
}
