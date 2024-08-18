package hlm;
import java.util.Random;

import hl.Casilla;

public class CasillaTresColores extends Casilla {
	 static final Random r = new Random(31416);
	 
	    public CasillaTresColores() {
	        int aleatorio = r.nextInt(100);

	        if (aleatorio < 20) {
	            color = 1; 
	        } else if (aleatorio < 40) {
	            color = 2; 
	        } else {
	            color = 0;
	        }
	    }

	   public void cambiarColor() {
		   color = (color + 1) % 3;
	        }
}

