package hl;

import hl.IHormiga.Giro;

public class Hormiga implements IHormiga {
	protected int posX;
	protected int posY;
	protected Orientacion orientacion;
	private int contador;

	public Hormiga() {
		posX = 0;
		posY = 0;
		orientacion = Orientacion.IZQUIERDA;
		contador = 0;
	}
	
	@Override
	public void mover(int incX, int incY) {
		posX += incX;
		posY += incY;
	}
	
	@Override
	public Giro girar(ICuadricula cuadricula) throws IllegalStateException{
		if (posX < 0 || posX >= Cuadricula.DIM || posY < 0 || posY >= Cuadricula.DIM) {
            return Giro.MEDIA_VUELTA;
		}
		
			int color = cuadricula.casilla(posX, posY).color();
			
			if(color!=0 && color!=1) 
				throw new IllegalStateException();
			
			if(color == 0) {
				orientacion = orientacion.girarIzquierda();
				return Giro.IZQUIERDA;
			}
			else {
				orientacion = orientacion.girarDerecha();
				return Giro.DERECHA;
			} 
		}
	

	@Override
	public void cambiarColor(ICuadricula cuadricula) {
		cuadricula.casilla(posX, posY).cambiarColor();
		
	}

	@Override
	public void avanzar() { 
	    orientacion.mover(this);
	}

	@Override
	public void tick(ICuadricula cuadricula) {
	    switch (contador % 3) {
	        case 0:
	            girar(cuadricula);
	            break;
	        case 1:
	            cambiarColor(cuadricula);
	            break;
	        case 2:
	            avanzar();
	            break;
	    }
	    contador++;
	}

	@Override
	public int[] coordenadas() {
		return new int[] {posX, posY}; 
	}

	@Override
	public String rutaDeLaImagen() {
		return "./res/ant_1.png";
	}

	@Override
	public int getAnguloEnGrados() {
		return orientacion.getAnguloEnGrados();
    	
	}

}
