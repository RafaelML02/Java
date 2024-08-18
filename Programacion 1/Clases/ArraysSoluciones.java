package programacionI;

public class ArraysSoluciones {
	  static int pos0(int [] col){
		    int longuitud = col.length;
		    int pos = -1;
		    int i=0;
		    while((i<longuitud) && (pos==-1)){
		      if(col[i]==0)
		        pos=i;
		      i++;
		    }
		     return pos;    
		  }
	  
	  static boolean estaN(int []arr, int n) {
		  boolean resultado=false;
		  int longuitud = arr.length;
		  int i=0;
		  while(i<longuitud && !resultado) {
			  if(arr[i]==n) {
				  resultado=true;
			  }
			  i++;
		  }
		  
	  return resultado;
	  }
	  
	  static boolean todosPares(int []arr) {
		  int longuitud=arr.length;
		  boolean resultado= false;
		  int x=0;
		  int i=0;
		  while(i<longuitud && !resultado) {
			  if(arr[i]%2==0) {
				  x++;				  
			  }
			  i++;
		  }
		  if(x==longuitud) {
			  resultado=true;
		  }
		  return resultado;		  
	  }
	  
	  static boolean todosIguales(int []arr) {
		  boolean resultado=true;
		  int i=0;
		  while(i<arr.length-1 && resultado) {
			  resultado=resultado && (arr[i]==arr[i+1]);
			  i++;
		  }
		  return resultado;
	  }
	  
	  public static void main(String []args) {
		  int []array= {2,4,6,8};		  
		  int []array2= {1,2,4,6,7,8,6,4,3,2,4,6,8};
		  int []array3= {1,1,1,1,2,1,1,1};
		  System.out.println(todosPares(array));
		  System.out.println(estaN(array2,3));
		  System.out.println(todosIguales(array3));
		  
	  }


}
