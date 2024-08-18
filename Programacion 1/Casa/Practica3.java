
package casa;

public class Practica3 {
	  static String showCollection (int[] col){
		    String text = "";
		    if(col.length == 0) return text;
		    for (int i = 0; i < col.length - 1; i++)
		      text += col[i] + ", ";
		    return "[" + text + col[col.length - 1] + "]"; 
		  } // showCollection
	
	static int[] shift(int[]arr) {
		int[]array= new int [arr.length];
		int i=0;
		while(i<arr.length-1) {
			if(i==arr.length-1)
				arr[i]=array[0];
			else
				arr[i]=array[i+1];
			i++;
		}
		return array;
//		  int longuitud1=arr.length;
//		  int[]array= new int [longuitud1];
//		  for(int i=longuitud1-1 ; i>0 ; i--) {
//				array[i-1]=arr[i];
//				if(i==1) {
//					array[longuitud1-1]=arr[i-1];
//				}
//			}
//		  return array;
	}
	
	
	static boolean isOrdered(int[]array) {
		boolean resultado=false;
		int i=0;
		int x=0;
		while(i<array.length-1 && !resultado) {
			if(array[i]==array[i+1]) {
				x++;
			}
			i++;
		}
		if(x==array.length-1)
			resultado=true;
		return resultado;
	}
	
	
	public static void main (String[]args) {
		int[]array1= {1,2,3,4,5};
		int[]array2= {2,3,3,3,8,8};
		int[]array3= {2,3,6,6,8};
		int[]array4= {2,6,5,7};
		System.out.println(showCollection(shift(array1)));
		System.out.println(showCollection(shift(array2)));
		System.out.println(isOrdered(array3));
		System.out.println(isOrdered(array4));

}
}
