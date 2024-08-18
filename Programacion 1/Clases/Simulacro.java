package programacionI;

public class Simulacro {
  
  
  /*
   * FUNCION: min(coleccion de enteros col) -> entero
   * PRE: col no es null, col.length > 0 
   * POST: el resultado es el número mas pequeno de col
   * EJEMPLOS:
   *   min([4,5,8]) -> 4
   *   min([4,5,1]) -> 1
   */ 
  
  public static int min(int[] col) {
	  int resultado=0;
	  int primero=col[0];
	  int i=1;
	  while(i<col.length) {
		  if(primero>col[i]) {
			  resultado=col[i];
		  }
		  i++;
	  }
	  return resultado;
  }
  
   /*
   * FUNCION isPalindromo(coleccion de caracteres word)-> Boolean
   * PRE: word no es null y los caracteres de word son 
   * todos letras minusculas
   * POST: El resultado es true si word es un palindromo, es decir, 
   * se lee igual de derecha a izquierda que de izquierda a derecha
   * y false e.o.c.
   * EJEMPLOS: 
   *   isPalindromo(['r','a','d','a','r']) -> true
   *   isPalindromo(['r','a','d','a','r','e','s']) -> false
   *   isPalindromo(['s','e','v','a','n','s','u','s','n','a','v','e','s']) -> true
   *   isPalindromo([]) -> true
   *   isPalindromo(['a']) -> true
   */ 
  
  
  public static boolean isPalindromo(char[] word) {
	  boolean resultado=true;
	  int i=0;
	  while(i<word.length/2 && resultado) {
		  resultado=resultado && (word[i]==word[word.length-i-1]);
		  i++;
	  }
	  return resultado;
  }
  
  public static void main(String[] args){
	  int []array= {1,2,3,4,5,6,7,0,5,4};
	  System.out.println(min(array));
  }
} 
