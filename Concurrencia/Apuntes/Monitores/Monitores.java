import es.upm.babel.cclib.Monitor;

public class Monitores {
    private Monitor mutex;
    private Monitor.Cond aux;

    public Monitores(){
        mutex = new Monitor();
        aux = mutex.newCond();
    }
   


    
} 