package practica_4.enun;

public class TableroPruebas {
	public static void main(String []args) {
		Tablero x = new Tablero(8);
		
		//booleanos
		System.out.println(Tablero.esPar(2));
		System.out.println(Tablero.esPar(0));
		System.out.println(Tablero.esPar(3));
		
		//Strings
		System.out.println(new Tablero(3).toString());
		System.out.println(x.toString());
		System.out.println(new Tablero(12).toString());
		
		//Enteros
		System.out.println(x.dimension());
		System.out.println(new Tablero(12).dimension());
		
		//Booleanos
		System.out.println(x.esPosicionTablero(1,2));
		System.out.println(x.esPosicionTablero(4, 9));
		System.out.println(x.esCuadroBlanco(1, 2));
		System.out.println(x.esCuadroBlanco(1, 3));
		System.out.println(x.esCuadroAmenazado(1, 2, 1, 3));
		System.out.println(x.esCuadroAmenazado(1, 2, 2, 8));
	
		//Char
		System.out.println(x.cuadro(1, 2));
		System.out.println(x.cuadro(1, 3));
	
	
	
	
	}



	
}
