package programacionI;
/*
 * autor: RAFAEL MOURE LOPEZ
 * fecha: 28/11/2022
 * 
 */ 

//package exercise;

class PracticalExercise{
  
  
  /* FUNCTION: shift(coleccion de enteros col) -> coleccion de enteros
   * PRE: col no es null
   * POST: el resultado es una nueva coleccion donde los elementos 
   * están desplazados una posición de derecha a izquierda
   * EJEMPLOS:
   *   shift([1,2,3,4]) -> [2,3,4,1]
   *   shift([2,3,3,3,8,8]) -> [3,3,3,8,8,2]
   */ 
  
  static int[] shift(int[] col){
	  int longuitud1=col.length;
	  int[]array= new int [longuitud1];
	  for(int i=longuitud1-1 ; i>0 ; i--) {
			array[i-1]=col[i];
			if(i==1) {
				array[longuitud1-1]=col[i-1];
			}
		}
	  return array;
	}

  
  static String showCollection (int[] col){
    String text = "";
    if(col.length == 0) return text;
    for (int i = 0; i < col.length - 1; i++)
      text += col[i] + ", ";
    return "[" + text + col[col.length - 1] + "]"; 
  } // showCollection
  
  /* FUNCION: isOrdered(coleccion de enteros col) -> boolean
   * PRE: col no es null
   * POST: el resultado es true si col es está ordenadado
   * de menor a mayor de izquierda a derecha y falso en otro caso
   * EJEMPLOS:
   *    isOrdered([2,3,6,6,8]) -> true
   *    isOrdered([2,6,5,7]) -> false
   */ 
  
  static boolean isOrdered(int[]col) {
		boolean resultado=true;
		int longuitud2=col.length;
		for(int i=0; i<longuitud2-1 && resultado; i++) {
			if(col[i]>col[i+1]) {
				resultado=true;
			}
		}
		return resultado;

	}
  
  
	public static void main (String[]args) {
		int[]array1= {1,2,3,4,5,6,7,8};
		System.out.println(showCollection(shift(array1)));
		System.out.println(isOrdered(array1));

}
} // PracticalExercise