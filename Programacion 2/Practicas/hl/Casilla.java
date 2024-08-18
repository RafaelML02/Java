package hl;

public class Casilla {
	protected int color;
	
	public Casilla() {
		color = 0;
	}
	
	public void cambiarColor() {
		color = (color==0) ? 1 : 0;
	}
	
	public int color() {
		return color;
	}
}
