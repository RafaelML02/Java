package programacionI;

public class Recursion {
	//FUNCION: factorial(Entero x) --> Entero
	  //PRE: x>=0
	  //POS: factorial(x) devuelve el factorial de x
	  static int factorial(int x) {
	    if (x<2)
	      return 1;
	    else
	      return x * factorial(x-1);
	  }//de factorial


	  // FUNCION: productoEntre(Entero x, Entero y) --> Entero
	  // PRE: x<=y
	  // POS: productoEntre(x,y) devuelve el producto de enteros
	  // entre x e y
		static int productoEntre (int x, int y) {
			if(x<=y && y<2)
				return 1;
			else
				return y * productoEntre(x,y-1);
			
		}

	  // FUNCION: factorial1(Entero x) --> Entero
	  // PRE: x>=0
	  // POS: factorial1(x) devuelve el factorial de x
	  // Implementarlo como una llamada a productoEntre
		static int factorial11(int n) {
			if(n<2)
				return 1;
			else
				return productoEntre(1,n);
		}

	  // FUNCION: sumaEntre(Entero x, Entero y) --> Entero
	  // PRE: x<=y
	  // POS: sumaEntre(x,y) devuelve el suma de enteros
	  // entre x e y
		static int sumaEntre(int x, int y) {
			if(x>=y || y<2)
				return 1;
			else
				return y + sumaEntre(x,y-1);
		}
		
	  // FUNCION: sumaEntre1(Entero x, Entero y) --> Entero
	  // PRE: cierto
	  // POS: sumaEntre1(x,y) devuelve el suma de enteros
	  // entre x e y
		static int sumaEntre1(int x, int y) {
			if(x<y)
				return y + sumaEntre1(x,y-1);
			else if (x>y)
				return x + sumaEntre1(x-1,y);
			else
				return y;
		}
	 
	  // FUNCION: sumaCuadradosEntre(Entero x, Entero y) --> Entero
	  // PRE: cierto
	  // POS: sumaCuadradosEntre(x,y) devuelve el suma de los 
	  // cuadrados de los enteros entre x e y
		static int sumaCuadradosEntre(int x, int y) {
			if(y<2)
				return 1;
			else
				return (int)(Math.pow(y,2)) + (sumaCuadradosEntre(x,y-1));
		}

	  // FUNCION: productoCubosEntre(Entero x, Entero y) --> Entero
	  // PRE: cierto
	  // POS: productoCubosEntre(x,y) devuelve el producto de los 
	  // cubos de los enteros entre x e y
		static int productoCubosEntre(int x, int y) {
			if(y<2)
				return 1;
			else
				return (int)(Math.pow(y,3)) * (productoCubosEntre(x,y-1));
		}

	  
	  static boolean esPar(int x){  //función auxiliar
	    return (x % 2) == 0;
	  } // de esPar
	  

	  // FUNCION: sumaCuadradosParesEntre(Entero x, Entero y) --> Entero
	  // PRE: cierto
	  // POS: sumaCuadradosParesEntre(x,y) devuelve el suma de los 
	  // cuadrados de los enteros pares entre x e y
		static int sumaCuadradosParesEntre(int x, int y) {
			if(esPar(y))
				return (int)(Math.pow(y,2)) + sumaCuadradosParesEntre(x,y-2);
			else
				return sumaCuadradosParesEntre(x,y-1);
		}
	 
	  // FUNCION: sumaCuadradosParesEntre1(Entero x, Entero y) --> Entero
	  // PRE: cierto
	  // POS: sumaCuadradosParesEntre(x,y) devuelve el suma de los 
	  // cuadrados de los enteros pares entre x e y
	  
	  //FUNCION: numeroCifras(|Z numero) -> /Z     
	  //PRE: numero >=0
	  //POS: devuelve el número de cifras de numero

	  //FUNCION: numeroCifras1(|Z numero) -> /Z     
	  //PRE: cierto
	  //POS: devuelve el número de cifras de numero

	  //FUNCION: sumaCifras(|Z numero) -> /Z     
	  //PRE: numero >= 0
	  //POS: devuelve la suma de las cifras de numero
	 
	  //FUNCION: sumaCifrasPares(|Z numero) -> /Z     
	  //PRE: numero >= 0
	  //POS: devuelve la suma de las cifras pares de numero

	  //FUNCION: sumaCifrasParesPosImpar(Entero numero) --> Entero
	  // PRE: numero >= 0
	  // POS: devuelve la suma de las cifras pares de numero 
	  // que ocupen una posicion impar empezando por que la
	  // ultima cifra de numero ocupa la posicion pos
	  // ej:          1328794
	  // posiciones   7654321
	  // sumaCifrasParesPosImpar(1328794)= 4+2=6
	//  static int sumaCifrasParesPosImpar(int numero){
//	      return sumaCifrasParesPosImparAux(numero,1);
	//  }// de sumaCifrasParesPosImpar

	  //FUNCION: sumaCifrasParesPosImparAux(Entero numero,
	  //                                 Entero pos) --> Entero
	  //PRE: numero >= 0, pos>0
	  //POS: devuelve la suma de las cifras pares de numero 
	  // que ocupen una posicion impar empezando por que la
	  // ultima cifra de numero ocupa la posicion pos
	  // ej:          1328794
	  // posiciones   7654321
	  // sumaCifrasParesPosImparAux(1328794,1)= 4+2=6
	  // sumaCifrasParesPosImparAux(132879,2)= 2
	  // sumaCifrasParesPosImparAux(13,6)= 0
	   
	  //FUNCION: numeroElementos(Entero x, Entero y) -> Entero     
	  //PRE: numero >= 0
	  //POS: devuelve el número de elementos del intervalo [x,y]

	  
	  // Supongamos que existe una función booleana que nos
	  // dice si un número es mágico o no.... la implementación
	  // nos da igual, podemos implementarla como queramos
	  static boolean esMagico(int x){
	    return esPar(x) && (x > 5);
	  } 

	  //FUNCION: numeroElementosMagicos(Entero x, Entero y) -> Entero     
	  //PRE: cierto
	  //POS: devuelve el número de elementos que cumplen 
	  // esMagico de los del intervalo [x,y]
	  
	  //FUNCION: todosMagicos(Entero x, Entero y) -> Booleano     
	  //PRE: cierto
	  //POS: devuelve cierto si todos los números del intervalo
	  // [x,y] son mágicos
	  
	  //FUNCION: hayMagico(Entero x, Entero y) -> Booleano     
	  //PRE: cierto
	  //POS: devuelve cierto si hay al menos un número en el
	  //intervalo [x,y] que sea mágico
	  
	  public static void main (String [] Args) {
			System.out.println(productoEntre(2,5));
			System.out.println(factorial11(4));
			System.out.println(sumaEntre(1,5));
			System.out.println(sumaEntre1(8,6));
			System.out.println(sumaCuadradosEntre(1,4));
			System.out.println(productoCubosEntre(1,4));
	    // Implementa las pruebas que necesites para asegurarte
	    // de que las funciones implementadas son correctas
	    
	  }//de main



}
