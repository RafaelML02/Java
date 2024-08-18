package practica_4.enun;

public class ReinaJugar {
	
	public static Tablero leer() {
		int x = StdIn.readInt();
		return new Tablero(x);
	}

	public static void leerYMarcar(Tablero tablero) {
		int x = StdIn.readInt();
		int y = StdIn.readInt();
		tablero.marcarAmenazadas(x, y);
		tablero.marcarReina(x, y);
	}

	public static void pintar(Tablero tablero) {
		System.out.println(tablero.toString());
	}

	public static int cuantasAmenazadas(Tablero tablero) {
		int x = 0;
		int[] reina = tablero.encontrarReina(tablero);
	    int dimension = tablero.dimension();
	    for (int i = 0; i < dimension; i++) {
	        for (int j = 0; j < dimension; j++) {
	            if (tablero.esCuadroAmenazado(i, j,reina[0], reina[1] ))
	                x++;
	        }
	    }
	    return x;
	}

	public static int calculo(int n, int d) {
		int res = 0;
		int contador = 1;
		while(contador<=n) {	
            Tablero tablero = new Tablero(d);
            int x = (int) Math.random();  
            int y = (int) Math.random();
            tablero.marcarReina(x, y);
            tablero.marcarAmenazadas(x, y);
            res += cuantasAmenazadas(tablero);
            contador++;
        }
		return res;
	}

	public static void tabla() {
		 for (int n = 1; n <= 10; n++) {
	            for (int d = 4; d <= 12; d += 2) {
	                int res = calculo(n, d);
	                System.out.println(n + "\t" + d + "\t" + res);
	            }
	        }
	    }
		
	
}
