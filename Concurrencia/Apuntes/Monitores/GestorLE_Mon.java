import es.upm.babel.cclib.Monitor;

public class GestorLE_Mon {
	private int nLect;
    private boolean esc; 
    
    private Monitor mutex = new Monitor();
    private Monitor.Cond c_espEsc = mutex.newCond();
    private Monitor.Cond c_espLeer = mutex.newCond();
    
    public GestorLE_Mon() {
	this.nLect = 0;
	this.esc   = false;
    }
    public void iniciar_lectura() {
	mutex.enter();
	// bloqueos
	if(this.esc)
	    c_espLeer.await();
	// accion
	this.nLect++;

	// desbloqueos
	desbloqueo_generico();
	mutex.leave();
    }
    public void terminar_lectura() {
	mutex.enter();
	// CPRE es Cierto, luego no hay bloqueo
	// accion
	this.nLect--;

	//desbloqueos
	desbloqueo_generico();	
	mutex.leave();
    }
    public void iniciar_escritura() {
	mutex.enter();
	// comprobación de la CPRE
	if(this.esc || this.nLect != 0){
	    // escritoresEsperando++;
	    c_espEsc.await();
	    // escritoresEsperando--;
	}
	// código de la operación
	this.esc = true;

	// desbloqueos
	desbloqueo_generico();
	mutex.leave();
    }
    public void terminar_escritura() {
	mutex.enter();
	// CPRE es Cierto: no hay bloqueo
	// accion
	this.esc = false;

	// desbloqueos
	desbloqueo_generico();
	mutex.leave();
    }
    private void desbloqueo_generico() {
	// si se puede desbloquear a algún escritor,
	// lo hacemos; en caso contrario, desbloqueamos a
	// un lector si es posible
	if (nLect == 0 && !esc && c_espEsc.waiting() > 0) {
	    c_espEsc.signal();
	} else if (!esc) {
	    c_espLeer.signal();
	}   
    }

}
