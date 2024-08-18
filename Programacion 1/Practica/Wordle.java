package Practica;

import java.util.Scanner;
import java.util.Random;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class Wordle {

    static boolean equals(char[] word1, char[] word2) {
    	boolean resultado=true;
    	if(word1.length==word2.length)
    		for(int i=0; i<word1.length && resultado; i++) {
    			resultado=resultado && (word1[i]==word2[i]);
    	}
    	else
    		resultado=false;
    	
    	return resultado;
    }

    static boolean validChar(char c) {
    	boolean caracter=false;
    		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
    			caracter=true;
    	}
    	return caracter;
        }


    static boolean validWord(char[] input) {
    	boolean resultado=true;
    	for(int i=0; i<input.length && resultado;i++) {
    		resultado=resultado && validChar(input[i]);
    	}
        return resultado;
    }

    static char[] toUpperCase(char[]input) {
    	char[]solucion= new char[input.length];
    	int i=0;
    	while(i<input.length){
    		solucion[i]=Character.toUpperCase(input[i]);
    		i++;
    	}
    	return solucion;
    }

	static boolean wordExists(char[]input, char[][]dictionary) {
		boolean resultado=false;
		int i=0;
		while(i<dictionary.length){
			if(equals(input,dictionary[i])) {
				resultado=true;
			}
			i++;
		}
		return resultado;
		}


    static boolean containedChar(char[] word, char c) {
    	boolean resultado=false;
    	int i=0;
    	while(i<word.length) {
    		if(word[i] == c) {
    			resultado=true;
    		}
    		i++;
    }
        return resultado;
    }


    static int repetitions(char[] input, char c, int index) {
    	int suma=0;
    	int i=0;
    	while(i<input.length && i<index) {
    		if(input[i]==c) {
    			suma++;
    		}
    		i++;
    	}
        return suma;
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



    static char[] toCharArray(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }

    static String toString(char[] input) {
        String result = "";
        for (int i = 0; i < input.length; i++) {
            result = result + input[i];
        }
        return result;
    }

    static char[] getInput(char[] solution, char[][] dictionary) {
        System.out.print("Introduce your guess: ");
        Scanner sc = new Scanner(System.in);
        char[] input = toCharArray(sc.nextLine());
        if (input.length != solution.length) {
            System.out.println("The guess must contain " + solution.length + " characters.");
            return getInput(solution, dictionary);
        } else if (!validWord(input)) {
            System.out.println("The guess is not valid.");
            return getInput(solution, dictionary);
        } else if (!wordExists(toUpperCase(input), dictionary)) {
            System.out.println("The guess does not exist.");
            return getInput(solution, dictionary);
        } else {
            return input;
        }
    }

    static boolean gameLoop(char[] solution, int tries, char[][] dictionary) {
        char[] guess = toUpperCase(getInput(solution, dictionary));
        boolean[] correct = correctChars(solution, guess);
        boolean[] misplaced = misplacedChars(solution, guess, correct);
        int[] result = result(correct, misplaced);
        System.out.println("Result: " + toString(feedback(guess, result)));

        if (equals(solution, guess)) {
            return true;
        } else if (tries == 1) {
            return false;
        } else {
            return gameLoop(solution, tries - 1, dictionary);
        }
    }

    static char[] chooseWord(char[][] words) {
        Random rand = new Random();
        int index = rand.nextInt(words.length);
        return words[index];
    }

    static String[] readWords(String input) {
        System.out.print("Reading dictionary... ");
        Path path = Paths.get(input);
        try {
            String[] words = Files.readAllLines(path).toArray(new String[] {});
            System.out.println("Done.");
            return words;
        } catch (Exception e) {
            System.out.println("Error.");
            System.out.println("Using default dictionary.");
            String[] words = { "words", "hello", "example", "weeks", "three" };
            return words;
        }
    }

    public static void main(String[] args) {
        String[] words = readWords("words.txt");
        char[][] dictionary = new char[words.length][];
        for (int i = 0; i < dictionary.length; i++) {
            dictionary[i] = toUpperCase(toCharArray(words[i]));
        }
        char[] solution = chooseWord(dictionary);
        int tries = solution.length + 1;
        System.out.println("Welcome to Wordle!");
        System.out.println("The word to guess contains " + solution.length + " characters.");
        System.out.println("You have " + tries + " attempts.");

        if (gameLoop(solution, tries, dictionary)) {
            System.out.println("You win!");
        } else {
            System.out.println("You loose.");
        }
    }
}
