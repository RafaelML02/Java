package examenes;

public class examendiciembre2021 {
	  static String showCollection (int[] col){
		    String text = "";
		    if(col.length == 0) return text;
		    for (int i = 0; i < col.length - 1; i++)
		      text += col[i] + ", ";
		    return "[" + text + col[col.length - 1] + "]"; 
		  }
	static boolean esVocal(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
	}
	static boolean todasVocal(char[]col) {
		boolean resultado=true;
		for(int i=0; i<col.length && resultado; i++) {
			resultado=resultado && esVocal(col[i]);
		}
		return resultado;
	}	
	static int[] elementosPosImpar(int[]col){
		int []resultado=new int [col.length/2];
		int x=0;
		for(int i=1;i<col.length; i=i+2) {
			resultado[x]=col[i];
			x++;
		}
		return resultado;
	}
	static boolean hayTresVocales(char[]col) {
		boolean resultado=false;
		int x=0;
		for(int i=0; i<col.length; i++) {
			if(esVocal(col[i]))
				x++;
			
		}
		if(x>=3)
			resultado=true;
		return resultado;
	}
	
	static int hayTresVocales1(char []col) {
		return hayTresVocalesAux(col,0);
	}
	static int hayTresVocalesAux(char[]col, int index) {
		if(index==col.length)
			return 0; 
		else
			return col[index] + hayTresVocalesAux(col, index+1);
	}
	
	
	public static void main(String[]args ) {
//		int[]col= {2,6,5,4,5};
//		int[]col1= {2,6,5};
//		System.out.println(todasVocal(col));
//		System.out.println(todasVocal(col1));
//		System.out.println(showCollection(elementosPosImpar(col)));
//		System.out.println(showCollection(elementosPosImpar(col1)));
		
	}

}
