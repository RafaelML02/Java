package casa;

public class Practica4 {
	static int sumaElementos(int[]arr) {
		int resultado=0;
		for(int i=0; i<arr.length;i++) {
			resultado=resultado+arr[i];
			
		}
		return resultado;
	}
	
	static int sumaElementosPosicionPar(int []arr) {
		int resultado=0;
		int longuitud=arr.length;
		for(int i=0; i<longuitud;i=i+2) {
			resultado=resultado + arr[i];
			
		}
		return resultado;
	}
	static int productoElementos(int []arr) {
		int resultado=1;
		for(int i=0; i<arr.length;i++){
			resultado=resultado*arr[i];
		}
		return resultado;
	}
	static double media(int[]arr) {
		double resultado=0;
		double resultado2=0;
		int longuitud=arr.length;
		for(int i=0; i<arr.length;i++) {
			resultado=resultado+arr[i];
		}
		resultado2= resultado/longuitud;
		return resultado2;
		
	}
	static int max(int []arr) {
		int resultado=0;
		int mayor=arr[0];
		int i=1;
		while(i<arr.length) {
			if(mayor<arr[i]) {
				mayor=arr[i];
			}
			i++;	
		}
		resultado=mayor;
		return resultado;
	}
	
	
	
	
	
	
	
	public static void main(String []args) {
		int []array= {1,2,3,4,5,6,7,8};
		int[]array1= {2,76,3,8,3,89,3,6,2,56,0};
		System.out.println(array.length); 
		System.out.println(sumaElementos(array));
		System.out.println(sumaElementosPosicionPar(array));
		System.out.println(productoElementos(array));
		System.out.println(media(array));
		System.out.println(max(array));
		System.out.println(max(array1));
		
		
		
	}

}
