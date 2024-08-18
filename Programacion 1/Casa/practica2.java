package casa;

public class practica2 {
	static int pos0(int[]arr) {
		int resultado=0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				resultado=i;
				
			}
			i++;
		}
		return resultado;
	}
	static boolean estaN(int [] arr, int n) {
		boolean resultado=false;
		int i=0;
		while(i<arr.length && !resultado) {
			if(arr[i]==n) {
				resultado=true;
			}
			i++;
		}
		return resultado;
	}
	static boolean todosPares(int []arr) {
		boolean resultado= false;
		int x=0;
		int i=0;
		while(i<arr.length && !resultado) {
			if(arr[i]%2==0) {
				x++;
			}
			i++;
			if(x==arr.length)
				resultado=true;
		}
		return resultado;
	}
	
	
	public static void main(String [] args) {
		int []array= {1,2,3,4,7,6,0,4,3};
		int []array1= {2,4,6,8};
		System.out.println(pos0(array));
		System.out.println(estaN(array,9));
		System.out.println(todosPares(array1));
		
	}

}
