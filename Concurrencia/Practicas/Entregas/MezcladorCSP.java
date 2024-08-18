package Entregas;
import org.jcsp.lang.*;

public class MezcladorCSP implements CSProcess, Mezclador {
	// tipo Lado = Izda | Dcha
    public static final int IZDA = 0;
    public static final int DCHA = 1;
    public static final int LADOS = 2;

    private final Any2OneChannel[] insertarcanal;
    private final Any2OneChannel extraercanal;

    public MezcladorCSP() {
    	insertarcanal = new Any2OneChannel[LADOS];
        for (int i = 0; i < LADOS; i++) {
        	insertarcanal[i] = Channel.any2one();
        }
        extraercanal = Channel.any2one();
    }

    public void insertar(int l, int d) {
    	insertarcanal[l].out().write(d);
    }

    public int extraerMenor() {
    	int res;
    	extraercanal.out().write(0);
    	res = (int) extraercanal.in().read();
        return res;
    }

    public void run() {
        boolean[] existedato = new boolean[LADOS];
        int[] datos = new int[LADOS];

        final int IZQUIERDA = 0;
        final int DERECHA = 1;
        final int AUX = 2;

        Alternative aux1 = new Alternative(new Guard[] {insertarcanal[IZDA].in(),
        		insertarcanal[DCHA].in(),extraercanal.in()});

        while (true) {
            int x = aux1.select();
            if (x == IZQUIERDA || x == DERECHA) {
                int y = (int) insertarcanal[x].in().read();
                existedato[x] = true;
                datos[x] = y;

                if (existedato[IZDA] && existedato[DCHA]) {
                    if (datos[IZDA] <= datos[DCHA]) {
                    	extraercanal.out().write(datos[IZDA]);
                    	existedato[IZDA] = false;
                    } 
                    else {
                    	extraercanal.out().write(datos[DCHA]);
                    	existedato[DCHA] = false;
                    }
                }
            } 
            else if (x == AUX) {
                int z = Math.min(datos[IZDA], datos[DCHA]);
                extraercanal.in().read(); 
                extraercanal.out().write(z);
                if (datos[IZDA] <= datos[DCHA]) {
                	existedato[IZDA] = false;
                } else {
                	existedato[DCHA] = false;
                }
            }
        }
    }
}
