package lab7.enun;

public class CirculoTest {
	
	public static void main(String []args) {
		//DE CIRCULO
		Circulo x = new Circulo(1.0,3.0,5.0);
		System.out.println(x.toString());
		x.mover(2, 3);
		System.out.println(x.toString());
		System.out.println(x.distancia(new Circulo(5.0,6.0,10)));
		System.out.println(x.radio());
		System.out.println(x.centro());
		System.out.println(x.equals(x));
		System.out.println(x.equals(new Circulo(5,4,2)));
		
		// DE CIRCULOOPS
		System.out.println(CirculoOps.intersectan(new Circulo(1,2,3), new Circulo(5,6,1)));
		System.out.println(CirculoOps.estaDentro(x,1,2,2,3));
		System.out.println(CirculoOps.intersectan(new Circulo(1,2,3), new Circulo(3,4,7)));
		System.out.println(CirculoOps.estaDentro(x,25,30,35,40));
		
		// DE CIRCULOS
		Circulos a = new Circulos();
		a.addFirst(x);
		a.addLast(new Circulo(1,2,3));
		System.out.println(a.toString());
		System.out.println(a.size());
		System.out.println();
		System.out.println();
		
		
		
	}

	

}
