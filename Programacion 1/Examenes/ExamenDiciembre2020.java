package examenes;

public class ExamenDiciembre2020 {
	  static String showCollection (int[] col){
		    String text = "";
		    if(col.length == 0) return text;
		    for (int i = 0; i < col.length - 1; i++)
		      text += col[i] + ", ";
		    return "[" + text + col[col.length - 1] + "]"; 
		  } // showCollection
	  
	  
	static int[] paresMenoresQue(int n) {
		int[]resultado=new int [n/2];
		int x=0;
		for(int i=1; i<=n && x<resultado.length; i++) {
			if(i%2==0) {
				resultado[x]=i;
				x++;
			}	
		}

		return resultado;
	}
	
	static boolean iguales(int[]col) {
		int longuitud=col.length;
		boolean resultado=true;
		int i=0;
		while(i<longuitud-1 && resultado) {
			resultado=resultado && (col[i]==col[i+1]);
			i++;
		}
		return resultado;
	}
	
//Tercer ejercicio esta en capturas de pantalla del iphone
//Examen hecho en 48 min
	public static void main(String []args) {
		int[]array= {1,2,3,4,5};
		int[]array1= {4,4,4,4,4,4};
		int[]array2= {1,1,1,3,1,1};
		System.out.println(showCollection(paresMenoresQue(8)));
		System.out.println(showCollection(paresMenoresQue(16)));
		System.out.println(iguales(array));
		System.out.println(iguales(array1));
		System.out.println(iguales(array2));
	}

}
