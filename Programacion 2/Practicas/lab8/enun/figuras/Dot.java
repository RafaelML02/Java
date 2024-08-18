package lab8.enun.figuras;

import java.awt.Color;
import stdlib.StdDraw;

public class Dot extends Figura{
	public Dot(IPunto posicion, Color color){
		super(posicion,color);
	}

	public Dot(IPunto posicion){
		super(posicion,colorAlea());
	}

	public String toString(){
		return "Este dot esta en la posicion " + posicion().toString();
	}

	public boolean equals(Object o){
		if (! (o instanceof Dot))
	      return false;
	    else
	    {
	      Dot p = (Dot)o;
	      return posicion().equals(p.posicion());
	    }
		
	}

	public double perimetro(){
		return 0;
	}

	public void pintar(){
		StdDraw.setPenColor(colorAlea());
		StdDraw.point(posicion().x(), posicion().y());
		
	}


}
