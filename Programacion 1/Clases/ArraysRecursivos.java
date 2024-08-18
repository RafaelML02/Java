package programacionI;

public class ArraysRecursivos {
	static boolean esPar(int n) {
		return(n%2==0);
	}
	
	
	static int sumaElementsR (int []col) {
		return sumElementsAux(col,0);
	}
	static int sumElementsAux(int[]col, int index) {
		if(index==col.length)
			return 0;
		else
			return col[index] + sumElementsAux(col, index+1);
	}
	
	
	static int sumEvenElementsR(int[]col) {
		return sumEvenElementsAux(col,0);
	}
	
	static int sumEvenElementsAux(int[]col, int index) {
		if(index==col.length)
			return 0;
		else if (col[index]%2==0)
			return col[index] + sumEvenElementsAux(col,index+1);
		else
			return sumEvenElementsAux(col,index+1);
	}
	
	
	static int countAsterisksR(char[]col) {
		return countAsterisksAux(col,0);		
	}
	static int countAsterisksAux(char[]col, int index) {
		if(index==col.length)
			return 0;
		else if(col[index]== '*')
			return 1+ countAsterisksAux(col,index+1);
		else
			return countAsterisksAux(col, index+1);
	}
	
	
	static boolean findChar(char[]col, char c) {
		return findCharAux(col,c,0);
	}
	static boolean findCharAux(char[]col, char c, int index) {
		if(index==col.length)
			return false;
		else if(col[index]==c)
			return true;
		else
			return findCharAux(col,c,index+1);
	}
	
	
	static boolean allAsteriskR(char[]col) {
		return allAsteriskAux(col,0);
	}
	static boolean allAsteriskAux(char[]col, int index) {
		if(index==col.length)
			return true;
		else
			return col[index]=='x' && allAsteriskAux(col,index+1);
	}
	
	
	static int numPares(int []col) {
		return numParesAux(col,0);
	}
	static int numParesAux(int[]col, int i) {
		if(i==col.length)
			return 0;
		else
			return (esPar(col[i])?1:0) + numParesAux(col,i+1);
	}
}
