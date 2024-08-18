package examenes;

public class Examen2018Diciembre {
	static boolean esLetraMayuscula(char caracter) {
		return 'A' <= caracter && caracter <= 'Z';
	}
	static boolean esDigito(char caracter) {
		return '0' <= caracter && caracter <= '9';
	}
	static int aDigito(char caracter) {
		return caracter -'0';
	}
	
	static boolean tieneFormatoNIF(char[]arr) {
		boolean resultado=true;
		if(arr.length==9 && esLetraMayuscula(arr[arr.length-1]))
				for(int i=0; i<7 && resultado; i++){
					resultado=resultado && esDigito(arr[i]);
					}
		else
			resultado=false;
	return resultado;
	}
	
	static int aNum(char []arr) {
		int suma=0;
		for(int i=0; i<arr.length-1; i++) {
			suma=suma + (int)(aDigito(arr[i]) * Math.pow(10,arr.length-2-i));
		}
		return suma;
	}
	
	
	public static void main(String []args) {
		char[]array= {'0','0','0','0','0','0','8','5','Z'};
//		char[]array1= {'0','3','4','4','5','¡','8','5','Z'};
//		char[]array2= {'0','3','4','4','5','0'};
//		System.out.println(tieneFormatoNIF(array));
//		System.out.println(tieneFormatoNIF(array1));
//		System.out.println(tieneFormatoNIF(array2));
		System.out.println(aNum(array));

	}

}
