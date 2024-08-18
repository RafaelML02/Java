package Practica;

public class Ejemplo2 {
	static String showCollection (char[] col){
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

    static boolean[] misplacedChars(char[] solution, char[] guess,boolean[] correct) {
        boolean[]resultado=new boolean[guess.length];
        int i=0;
        int j=0;
        while(i<guess.length && j<solution.length){
        	if (guess[i]==solution[j+1] || guess[i]==solution[j+2]|| guess[i]==solution[j+3]|| guess[i]==solution[j+4]) {
        		resultado[i]=true;
        	}
        	i++;
        }
        return resultado;
    }
		
    static int[] result(boolean[] correct, boolean[] misplaced) {
    	int[]resultado= new int[correct.length];
    	for(int i=0; i<correct.length;i++) {
    		if(correct[i]==true && misplaced[i]==false)
    			resultado[i]=2;
    		else if(correct[i]==false && misplaced[i]==true)
    			resultado[i]=1;
    		else
    			resultado[i]=0;
    	}
    	return resultado;
    }
    
    static char[] feedback(char[] guess, int[] result) {
    	char[]resultado=new char[guess.length]; 
    	for(int i=0; i<guess.length; i++){
    		if(result[i]==0)
    			resultado[i] = '_';
    		else if(result[i]==1)
    			resultado[i]=Character.toLowerCase(guess[i]);
    		else
    			resultado[i]=guess[i];
    	}
    	return resultado;
    }

	public static void main(String[] args) {
		int[] result={2, 0, 1, 0, 1};
    	char[]guess= {'R', 'O', 'U', 'T', 'E'};
		System.out.println(showCollection(feedback(guess, result)));

		

		}

}
