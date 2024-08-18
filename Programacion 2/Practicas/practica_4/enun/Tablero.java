package practica_4.enun;

public class Tablero {
	private char [][] cuadros;
	private int n;
	
	Tablero(int n){
		this.n = n;	
		this.cuadros = new char[n][n];
		inicializarTablero();
	}
	
	public static boolean esPar(int x) {
		return x%2 == 0;
	}
	
	public void marcarReina(int x, int y) {
		cuadros[x][y] = 'R';
	}
	
	public int[] encontrarReina(Tablero tablero) {
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cuadros[i][j] == 'R') {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
	}
	
	
// Ver porqeu me da index out of bones este metodo
	public void inicializarTablero() {
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (esPar(i)) {
	                if (esPar(j)) {
	                    cuadros[i][j] = 'B';
	                } else {
	                    cuadros[i][j] = 'N';
	                }
	            } else {
	                if (esPar(j)) {
	                    cuadros[i][j] = 'N';
	                } else {
	                    cuadros[i][j] = 'B';
	                }}}}}
	
	
	public String toString() {
		String tablero = "";
		for(int i = 0; i<n ; i++) {
			for(int j = 0; j<n; j++) {
				tablero += cuadros[i][j];
			}
			}
		return tablero;
	}
	
	public int dimension() {
		return n*n;
	}
	
	public boolean esPosicionTablero(int x, int y) {
		return x>=0 && y>=0 && x<n && y<n;
	}
	
	public boolean esCuadroBlanco(int x, int y) {
		return cuadros[x][y] == 'B';
	}
	
	public boolean esCuadroAmenazado(int x, int y, int xReina, int yReina) {
		if(esPosicionTablero(x,y))
			return x == xReina || y == yReina || Math.abs(x - xReina) == Math.abs(y - yReina);
		else {
			return false;
		}
		
		}

	
	public void marcarAmenazadas(int xReina, int yReina) {
		for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (esCuadroAmenazado(i, j, xReina, yReina) && (i != xReina || j != yReina)) 
	                cuadros[i][j] = '*';
	}}}
    
	
	public char cuadro(int x, int y) {
		return cuadros[x][y];
	}
	
	

	
}
