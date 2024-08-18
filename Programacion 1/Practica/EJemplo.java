package Practica;

public class EJemplo { 
	  static String showCollection (boolean[] col){
		    String text = "";
		    if(col.length == 0) return text;
		    for (int i = 0; i < col.length - 1; i++)
		      text += col[i] + ", ";
		    return "[" + text + col[col.length - 1] + "]"; 
		  }
    static boolean[] correctChars(char[] solution, char[] guess) {
    	boolean solucion[]= new boolean[solution.length];
    	int i=0; 
    	while(i<solution.length) {
    		if(solution[i]==guess[i]) {
    			solucion[i]=true;
    		}
    		i++;
    	}
        return solucion;
    }
    static boolean wordExists(char[] input, char[][] dictionary) {
    	boolean resultado=true;
    	int j=0;
    	for(int i=0; i<dictionary.length;i++) {
    		if(input.length == dictionary[i].length)
    			while(j<dictionary[i].length && resultado){
    				resultado=resultado && (input[j]==dictionary[i][j]);		
    				j++;
    		}
    	}
        return resultado;
    }
    
    public static void main (String []args) {
    	char[][] dictionary={{'h', 'e', 'l', 'l', 'o'},{'w', 'o', 'r', 'l', 'd'},{'t', 'h', 'i', 's'},{'i', 's'}};
    	char[]word1={};
    	char[]word2= {'w', 'o', 'r', 'l', 'd'};
    	System.out.println(wordExists(word1,dictionary)); 
    	System.out.println(wordExists(word2,dictionary));
    	
//    	System.out.println(validChar('*'));
//    	System.out.println(validChar('a'));
    	
}
}
