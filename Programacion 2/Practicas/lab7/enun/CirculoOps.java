package lab7.enun;

public class CirculoOps {
	static boolean intersectan(Circulo c1, Circulo c2) {
		return (c1.distancia(c2) <= c1.radio()+c2.radio());
	}
	
	static boolean estaDentro(Circulo c, double x1, 
			double x2, double y1, double y2) {
		boolean a = c.x >= x1 && c.x <= x2  ;
		boolean b = c.y >= y1 && c.y <= y2;
		return a && b; 
	}

}
