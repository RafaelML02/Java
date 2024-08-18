package programacionI;

public class Arrays {
	static int productoColeccion(int []col) {
		int longitud=col.length;
		int res=1;
		int i=0;
		while(i<longitud) {
			res=res*col[i];
			i++;
		}
		return res;		
	}
	static int sumaColeccion(int []col) {
		int longitud=col.length;
		int res=0;
		int i=0;
		while(i<longitud) {
			res=res+col[i];
			i++;
		}
		return res;		
	}

	public static void main (String []args) {
		int[]array= {1,2,3,4};
		System.out.println(productoColeccion(array));
		System.out.println(sumaColeccion(array));
	}
}
