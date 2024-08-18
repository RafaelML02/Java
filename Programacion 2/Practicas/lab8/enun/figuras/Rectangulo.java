package lab8.enun.figuras;

import java.awt.Color;
import stdlib.StdDraw;

public class Rectangulo extends Figura {
	private int altura;
	private int anchura;
	
	
	public Rectangulo(Punto centro, int altura, int anchura, Color color){
		super(centro, color);
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(Punto centro, int altura, int anchura){
		super(centro, colorAlea());
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public String toString(){
		return "El rectangulo tiene de centro " + posicion().toString() + 
		"con una altura y una anchura de " + altura + ", " + anchura;		
	}
	
	public boolean equals(Object o){
		if (! (o instanceof Rectangulo))
			return false;
		else{
			Rectangulo p = (Rectangulo)o;
			return posicion().equals(p.posicion()) 
					&& anchura == p.anchura()
					&& altura == p.altura();
			}
	}
	public int anchura(){
		return anchura;
	}
	
	 public int altura(){
		return altura;
	}
	
	public double perimetro(){
		return 2*altura + 2*anchura;
	}
	
	public void pintar(){
		StdDraw.setPenColor(colorAlea());
	    if (rellena())
	    	StdDraw.filledRectangle(posicion().x(), posicion().y(), anchura / 2.0, altura / 2.0);
	    else
	    	StdDraw.rectangle(posicion().x(), posicion().y(), anchura / 2.0, altura / 2.0);
	}


}
