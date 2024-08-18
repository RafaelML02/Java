package aed.individual1;

public class ArrayCheckSumUtils {
  public static int[] arrayCheckSum(int[] arr, int n) {
	  int longuitud = arr.length;
	  int nuevalonguitud = longuitud +(longuitud/n);
	  if(longuitud % n != 0) {
		  nuevalonguitud ++;
	  }
	  
	  int[] nuevo = new int[nuevalonguitud];
	  int numero = 0;
	  
	  for(int i = 0; i<longuitud; i++) {

		  nuevo[numero++] = arr[i];
		  
		  if((i+1) % n == 0) {
			  int suma = 0;
			  for (int j = i-n+1; j<= i; j++) {
				  suma += arr[j];
			  }
			  nuevo[numero++] = suma;
		  }		  
		  }

	  if(longuitud % n != 0) {
		  int suma=0; 
		  for(int i = (longuitud -(longuitud%n)); i<longuitud ; i++) {
			  suma += arr[i];
		  }
		nuevo[numero] = suma;
		 
	  }
	  
	  return nuevo;
  }
}

