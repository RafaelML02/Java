package lab8.enun.figuras;

import java.awt.Color;

import stdlib.StdDraw;
import tads.ArrayList; 
import tads.IList;

public class Poligono extends Figura {
	IList<IPunto> vertices;
	
	public Poligono(IPunto[] puntos, Color color){
		super(puntos[0],color);
		if(puntos.length<3) 
			throw new IllegalArgumentException();		
		this.vertices = new ArrayList<>();
		for (IPunto punto : puntos) {
	        this.vertices.add(punto);
	    }
		
	}
	
	public Poligono(IPunto[] puntos){
		super(puntos[0], colorAlea()); 
		if(puntos.length<3) 
			throw new IllegalArgumentException();	
		this.vertices = new ArrayList<>();
		for (IPunto punto : puntos) {
	        this.vertices.add(punto);
	    }
	}
	
	public String toString() {
		return "El poligono tiene como vertices " + vertices.toString();
		
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Poligono))
			return false;
		else{
			Poligono p = (Poligono)o;
			return vertices.equals(p.vertices);
			}
	}
	
	public void mover(double dx, double dy) {
		for (int i=0; i<vertices.size(); i++) {
            vertices.get(i).mover(dx, dy);
            }
		}
	
	public double perimetro() {
		double res = 0;
		for(int i=0; i<vertices.size()-1; i++) {
			res += vertices.get(i).distancia(vertices.get(i+1));
		}
		res += vertices.get(vertices.size()-1).distancia(vertices.get(0));
		return res;
	}
	
	public void pintar() {
		StdDraw.setPenColor(colorAlea());
		double[]x = new double[vertices.size()];
		double [] y = new double [vertices.size()];
		for(int i = 0; i<vertices.size(); i++) {
			x[i] = vertices.get(i).x();
			y[i] = vertices.get(i).y();
		}
		if(rellena())
			StdDraw.filledPolygon(x,y);
		else {
			StdDraw.polygon(x, y);
		}
	}
	
}
