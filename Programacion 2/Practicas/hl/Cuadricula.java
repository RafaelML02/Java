package hl;

public class Cuadricula implements ICuadricula {
	public static final int DIM = 11;
	private Casilla [][] casillas;
	
	public Cuadricula() {
		casillas = new Casilla [DIM][DIM];
		for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                casillas[i][j] = new Casilla();
            }
            }
	}

	@Override
	public Casilla casilla(int i, int j) throws IndexOutOfBoundsException{
		if((i>=DIM || i<0) || (j>= DIM || j<0)) throw new IndexOutOfBoundsException();
		return casillas[i][j];
	}
}
