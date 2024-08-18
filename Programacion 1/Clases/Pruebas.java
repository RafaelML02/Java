package programacionI;

public class Pruebas {
//	  static int numeroCifras(int n) {
//		  int cifras=0;
//		  int i=n;
//		  while(i>0){
//			  if(i>0)
//				 cifras++;
//			  i=i/10;
//		  }
//		  return cifras;
//	  }	
//	  static boolean digitosIguales(int n) {
//		  boolean resultado=false;
//		  int p = n%10;
//		  int suma=0;
//		  for(int i=n; i>=0; i=i/10) {
//			  if(p==i%10)
//				  suma++;
//				  
//		  }
//		  if(suma==numeroCifras(n))
//			  resultado=true;
//		  return resultado;
//	  }

	  public static int min(int[] col) {
		  int resultado=0;
		  int i=0;
		  int primero=col[i];
		  while(i<col.length-1) {
			  if(primero>col[i]) {
				  resultado=primero;
			  }
			  primero++;
		  }
		  return resultado;
	  }
	public static void main(String [] args) {
		int []array= {2,3,4};
//		System.out.println(digitosIguales(5555));
		System.out.println(min(array));
	}

}
