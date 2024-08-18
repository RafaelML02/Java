package programacionI;


//Rafael Moure Lopez
//200233C

// Escribe a continuación la Postcondición de la función enigma.
// Es decir, explica en castellano lo que devuelve la función 
// enigma para cada argumento que reciba

// SOLUCIÓN: la función enigma recibe como argumento un número
// entero y devuelve cierto si todas sus cifras son múltiplos
// de 3 y falso y alguna de sus cifras no es múltiplo de 3.
// Se entiende mucho mejor el código si se renombran sus
// identificadores con nombres significativos.

public class Enigma {


	
	//  static boolean caos (int blanco, int negro)  {
//	    return (blanco%negro==0);
	//  } // de caos
	  
	  static boolean esMultiplo (int m, int x)  {
	    return (m%x==0);
	  } // de esMultiplo 
	  
	//  static boolean enigma (int queso) {
//	    boolean patata=true;
//	    for (int perro=queso; (perro>0) && patata; perro=perro/10){
//	      if (!caos(perro%10,3))
//	        patata=false;
//	    } // de for
//	    return patata;
	//  } // de enigma
	  
	  
//	  la funcion devuelve true si la solucion de perro%10, es multiplo de 3 ya que la funcion caos 
//	  lo que hace es ver si un numero es multiplo de otro. En eset caso hay que ver si es multiplo de tres.
//	  En caos de que sea multiplo de tres el resultado da verdadero y en caso contrario da falso.
	  


	  
	  static boolean todasCifrasMultiploDe3 (int x) {
	    boolean resultado=true;      // el resultado será true 
	    for (int num=x; (num>0) && resultado; num=num/10){
	      if (!esMultiplo(num%10,3)) // si la última cifra no es múltiplo de tres
	        resultado=false;         // el resultado será false   
	    } // de for
	    return resultado;
	  } // de todasCifrasMultiploDe3 
	  
	//  public static void main(String[] args) {  
//	    System.out.println("enigma(6)= " + enigma(6));
//	    System.out.println("enigma(46)= " + enigma(46));
//	    System.out.println("enigma(936)= " + enigma(936));
//	    System.out.println("enigma(34367)= " + enigma(34367));
//	    System.out.println("enigma(39963639)= " + enigma(39963639));
	//  } // de main  
	  
	  public static void main(String[] args) {  
	    System.out.println("todasCifrasMultiploDe3(6)= " + todasCifrasMultiploDe3(6));
	    System.out.println("todasCifrasMultiploDe3(46)= " + todasCifrasMultiploDe3(46));
	    System.out.println("todasCifrasMultiploDe3(936)= " + todasCifrasMultiploDe3(936));
	    System.out.println("todasCifrasMultiploDe3(34367)= " + todasCifrasMultiploDe3(34367));
	    System.out.println("todasCifrasMultiploDe3(39963639)= " + todasCifrasMultiploDe3(39963639));
	  } // de main

}
