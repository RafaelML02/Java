package programacionI;


public class Matrices {

	/* FUNCTION: sumElements(matrix of integer m) -> integer
	   * PRE: m is not null
	   * POST: the result is the addition of all elements in m. 
	   * EXAMPLE:
	   *   sumElements([[1,2],[3,4]]) -> 10
	   *   sumElements([[2,2],[1,1]]) -> 6
	   */ 
	  
	  
	  static int sumElements(int[][] matrix){
	    int result = 0;
	    // traverse rows
	    for(int i = 0; i < matrix.length; i++){
	      // traverse columns
	      for(int j = 0; j < matrix[0].length; j++){
	        result = result + matrix[i][j];
	      }
	    }
	    return result;
	  }
	  
	  /* FUNCTION: findN(matrix of integer m, int n) -> boolean
	   * PRE: m is not null
	   * POST: the result is true if n is in m and false otherwise
	   * 
	   * EXAMPLE:
	   *   findN([[1,2],[3,4]],3) -> true
	   *   findN([[1,2],[3,4]],5) -> false
	   */
	  
	  static boolean findN(int[][] matrix, int n) {
		  boolean resultado=false;
		  for(int i=0;i<matrix.length;i++) {
			  for(int j=0;j<matrix[0].length;j++) {
				  if(n==matrix[i][j])
					  resultado=true;  
			  }
		  }
		  return resultado;
	  }
	  
	  
	  /* FUNCTION: equals(matrices of integer m1, m2) -> boolean
	   * PRE: m1 and m2 are not null
	   * POST: the result is true if m1 and m2 have the same elements
	   * and in the same positions and false otherwise.
	   * 
	   * EXAMPLES:
	   *   equals([[1,2],[3,4]],[[1,1],[2,2]]) -> false
	   *   equals([[1,2],[3,4]],[[1,2],[3,4]]) -> true
	   */ 
	  static boolean equals(int[][] m1, int[][]m2) {
		  boolean resultado=true;
		  if(m1.length==m2.length)
			  for(int i=0;i<m1.length;i++) {
				  for(int j=0;j<m1[0].length;j++) {
					  resultado=resultado && (m1[i][j] == m2[i][j]);
			  }	  
			  }

		  return resultado;
	  }
	  
	  
	  
	  /* FUNCTION: sumMatrices(matrices of integer m1, m2) -> matrix of integers
	   * PRE: m1 and m2 are not null. m1 and m2 have the same dimension
	   * POST: the result is a matrix such that each element is the
	   * addition of the corresponding elements in m1 ad m2
	   * 
	   * EXAMPLE:
	   *   sumMatrices([[1,2],[3,4]],[[1,1],[2,2]]) -> [[2,3],[5,6]]
	   */ 
	  static int [][] sumMatrices(int[][] m1, int[][]m2) {
		  int [][]resultado=new int [m1.length][m2.length];
		  for(int i=0;i<m1.length;i++) {
			  for(int j=0;j<m1[0].length;j++) {
				  resultado[i][j]=m1[i][j] + m2[i][j]; 
			  }
			  }
		  return resultado;
	  }
	  
	  
	  
	  /* FUNCTION: showMatrix(matrix of integer m) -> text
	   * PRE: m is not null
	   * POST: the result is a text containing the elements of a matrix. The
	   * elements of each row are separated by a blank space and each row 
	   * is in one line.
	   * EXAMPLE:
	   *   showMatrix([[1,2],[3,4]]) -> 1 2
	   *                                3 4
	   */ 
	  
	  
	  
	  /* FUNCTION: identity(int size) -> matrix of integer
	   * PRE: size >= 0
	   * POST: the result is the identity matrix of size n, that is, 
	   * an n × n square matrix with ones on the main diagonal and zeros elsewhere.
	   * EXAMPLE:
	   *   identity(1) -> 1
	   *   identity(3) -> 1 0 0 
	   *                  0 1 0
	   *                  0 0 1
	   * 
	   */ 
	  
	  
	  public static void main(String[] args){
		  int[][]array= {{1,2},{3,4}};
		  int[][]array1= {{2,2},{1,1}};
		  int[][]array2={{1,2},{3,4}};
		  
		  System.out.println(sumElements(array));
		  System.out.println(sumElements(array1));
		  System.out.println(findN(array,3));
		  System.out.println(findN(array,5));
		  System.out.println(equals(array,array1));
		  System.out.println(equals(array,array2));
		  System.out.println(sumMatrices(array,array1));
	    
	  }

}
