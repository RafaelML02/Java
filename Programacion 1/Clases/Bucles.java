package programacionI;
//RAFAEL MOURE LOPEZ 200233C

public class Bucles {
	
	// FUNCION: productoEntre(Entero a, Entero b) --> Entero
	  // PRE: a<=b
	  // POS: productoEntre(a,b) devuelve el producto de enteros
	  // entre a y b
	
	static int productoEntre(int a, int b) {
		int resultado=1;
		int i=a;
		while (i<=b) {
			resultado=resultado*i;
			i++;
		}
		return resultado;
	}
			
	  // FUNCION: sumaEntre(Entero a, Entero b) --> Entero
	  // PRE: a<=b
	  // POS: sumaEntre(a,b) devuelve la suma de enteros
	  // entre x e y
	
	static int sumaEntre(int a, int b) {
		int suma=0;
		for (int i=a; i<=b; i++) {
			suma=suma +i;
		}
		return suma;
	}
	  // FUNCION: sumaHasta(Entero n) --> Entero
	  // PRE: n>=0
	  // POS: devuelve la suma de enteros positivos hasta n (inclusive)
	
	static int sumaHasta (int n) {
		int resultado=0;
		for(int i=0; i<=n; i++) {
			resultado=resultado+i;
		}
		return resultado;
	}
	  // FUNCION: sumaCubosEntre(Entero a, Entero b) --> Entero
	  // PRE: cierto
	  // POS: sumaCuadradosEntre(a,b) devuelve el suma de los 
	  // cubos de los enteros entre a y b
	
	static int sumaCubosEntre (int a, int b) {
		int suma=0;
		for(int i=a; i<=b;i++) {
			suma=(int) (suma + Math.pow(i,3));
		}
		return suma;
	}

	  static boolean esPar(int x){  //función auxiliar
	    return (x % 2) == 0;
	  } // de esPar
	  
	  // FUNCION: sumaParesEntre(Entero a, Entero b) --> Entero
	  // PRE: cierto
	  // POS: sumaParesEntre(a,b) devuelve la suma de los 
	  // números pares entre a y b
	  
	  static int sumaParesEntre(int a, int b) {
		  int suma=0;
		  int i=a;
		  while(i<=b) {
			  if(esPar(i))
				  suma=suma+i;
			  i++;
		  }
		  return suma;	  
	  }
	  
	  //FUNCION: sumaCifras(Entero n) -> Entero     
	  //PRE: n>=0
	  //POS: devuelve la suma de las cifras de n
	  static int sumaCifras(int n) {
		  int suma=0;
		  for(int i=n; i>0; i=i/10) {
			  suma=suma+i%10;
		  }
		  return suma;  
	  }
	  
	  //FUNCION: numeroCifras(Entero n) -> Entero     
	  //PRE: n>=0
	  //POS: devuelve el número de cifras de n
	  static int numeroCifras(int n) {
		  int cifras=0;
		  int i=n;
		  while(i>0){
			  if(i>0)
				 cifras++;
			  i=i/10;
		  }
		  return cifras;
	  }	  
	  
	  //FUNCION: estaEntre(Entero n, Entero a, Entero b) -> Booleano     
	  //PRE: cierto
	  //POS: devuelve cierto si n está en el intervalo [a,b]
	  static boolean estaEntre(int n, int a, int b) {
		  boolean resultado=false;
		  for(int i=a; i<=b; i++) {
			  if(n==i)
				  resultado=true;
		  }
		  return resultado;
	  }

	  //FUNCION: todasCifrasPares(Entero n) -> Booleano     
	  //PRE: cierto
	  //POS: devuelve cierto si n todas las cifras de n son pares
	  static boolean todasCifrasPares(int n) {
		  int contador=0;
		  boolean resultado=false;
		  for(int i=n;i>0; i=i/10) {
			  if(esPar(i))
				  contador++;
		  }
		  if(contador==numeroCifras(n))
			  resultado=true;
		  return resultado;		  
	  }
	  
	  /*
	   * FUNCION estaDigito (|Z buscado x |Z numero) ---> |B
	   * PRE: buscado>=0 /\ buscado <=9
	   * POST: resultado es cierto si buscado es un dígito de numero
	   * ej: estaDigito(340231, 3)= true
	   *     estaDigito(327262, 1)=false
	   */   
	  
	  static boolean estaDigito(int x, int y){
		  boolean resultado=false;
		  int i=y;
		  while(i>0) {
			  if((i%10) == x)
				  resultado=true;
			  i=i/10;
		  }
		  return resultado;
	  }


	  /*
	   * FUNCION digitosIguales (|Z numero) ---> |B
	   * PRE: true
	   * POST: resultado es cierto si todos los digitos de numero son iguales
	   * ej: digitosIguales(3)= true
	   *     digitosIguales(55555)= true
	   *     digitosIguales(327262)=false
	   */   
	  static boolean digitosIguales(int n) {
		  boolean resultado=false;
		  int p = n%10;
		  int suma=0;
		  for(int i=n; i>=0; i=i/10) {
			  if(p==i%10)
				  suma++;	  
		  }
		  if(suma==numeroCifras(n))
			  resultado=true;
		  return resultado;
	  }
	  
	  // Procedimiento auxiliar que imprime si las pruebas funcionan/fallan
	  static void imprimePrueba(boolean prueba, String nombrePrueba){
	    System.out.println((prueba?"Funciona ":"Falla ") + nombrePrueba);
	  } // de imprimerPrueba
	  
	  public static void main (String [] Args) {
		  
//	    boolean prueba1 = (productoEntre(3, 6) == 360);
//	    boolean prueba2 = (productoEntre(7, 10) == 5040);
//	    boolean prueba3 = (productoEntre(6, 3) == 1);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("productoEntre "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de sumaEntre
//	    boolean prueba1 = (sumaEntre(3, 6) == 18);
//	    boolean prueba2 = (sumaEntre(7, 10) == 34);
//	    boolean prueba3 = (sumaEntre(6, 3) == 0);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("sumaEntre "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de sumaHasta
	    boolean prueba1 = (sumaHasta(0) == 0);
	    boolean prueba2 = (sumaHasta(3) == 6);
	    boolean prueba3 = (sumaHasta(6) == 21);
	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
	    System.out.println("sumaHasta "+(todasPruebasBien?
	                                     "funciona":
	                                     "falla alguna prueba"));
	    imprimePrueba(prueba1,"prueba1");
	    imprimePrueba(prueba2,"prueba2");
	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de sumaHasta
//	    boolean prueba1 = (sumaHasta(0) == 0);
//	    boolean prueba2 = (sumaHasta(3) == 6);
//	    boolean prueba3 = (sumaHasta(6) == 21);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("sumaHasta "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de sumaParesEntre
//	    boolean prueba1 = (sumaParesEntre(3, 6) == 10);
//	    boolean prueba2 = (sumaParesEntre(7, 10) == 18);
//	    boolean prueba3 = (sumaParesEntre(6, 3) == 0);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("sumaParesEntre "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de sumaCifras
//	    boolean prueba1 = (sumaCifras(341) == 8);
//	    boolean prueba2 = (sumaCifras(72) == 9);
//	    boolean prueba3 = (sumaCifras(7102) == 10);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("sumaCifras "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de numeroCifras
//	    boolean prueba1 = (numeroCifras(341) == 3);
//	    boolean prueba2 = (numeroCifras(72) == 2);
//	    boolean prueba3 = (numeroCifras(7102) == 4);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3;
//	    System.out.println("numeroCifras "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
	    
//	    // PRUEBAS de estaEntre
//	    boolean prueba1 = !estaEntre(2, 3, 6);
//	    boolean prueba2 = estaEntre(7, 7, 10);
//	    boolean prueba3 = estaEntre(10, 7, 10);
//	    boolean prueba4 = !estaEntre(10, 10, 7);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
//	    System.out.println("estaEntre "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
//	    imprimePrueba(prueba4,"prueba4");
	    
//	    // PRUEBAS de todasCifrasPares
//	    boolean prueba1 = !todasCifrasPares(234);
//	    boolean prueba2 = todasCifrasPares(2486);
//	    boolean prueba3 = !todasCifrasPares(38);
//	    boolean prueba4 = !todasCifrasPares(243);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
//	    System.out.println("todasCifrasPares "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
//	    imprimePrueba(prueba4,"prueba4");

//	    // PRUEBAS de estaDigito
//	    boolean prueba1 = !estaDigito(2, 13837);
//	    boolean prueba2 = estaDigito(7, 7);
//	    boolean prueba3 = estaDigito(1, 71);
//	    boolean prueba4 = estaDigito(1, 217);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
//	    System.out.println("estaDigito "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
//	    imprimePrueba(prueba4,"prueba4");
	    
	  
//	    // PRUEBAS de digitosIguales
//	    boolean prueba1 = digitosIguales(3);
//	    boolean prueba2 = digitosIguales(0);
//	    boolean prueba3 = digitosIguales(55555);
//	    boolean prueba4 = !digitosIguales(327262);
//	    boolean todasPruebasBien = prueba1 && prueba2 && prueba3 && prueba4;
//	    System.out.println("digitosIguales "+(todasPruebasBien?
//	                                     "funciona":
//	                                     "falla alguna prueba"));
//	    imprimePrueba(prueba1,"prueba1");
//	    imprimePrueba(prueba2,"prueba2");
//	    imprimePrueba(prueba3,"prueba3");
//	    imprimePrueba(prueba4,"prueba4"); 
	    
	  }//de main


}
