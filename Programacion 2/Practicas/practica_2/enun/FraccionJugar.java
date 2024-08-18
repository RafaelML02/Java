package practica_2.enun;


public class FraccionJugar {
	private static void prueba1() {
	Fraccion res = Fraccion.suma(new Fraccion(2,6), new Fraccion(1,3));
	System.out.println(res.toString());
		
		
	}
	private static void prueba2() {

		Fraccion res3 = Fraccion.producto(Fraccion.suma(new Fraccion(2,6),new Fraccion(1,3)), 
				Fraccion.resta(new Fraccion(3,4),new Fraccion(1,6)));
		Fraccion res = Fraccion.division(res3,new Fraccion(8,9));
		System.out.println(res.toString());
		
		
	}
	private static void prueba3() {
		Fraccion res1 = Fraccion.resta(Fraccion.producto(Fraccion.suma(Fraccion.resta(new Fraccion(3,5), new Fraccion(1,4)), new Fraccion(1,10)),
				new Fraccion(3,2)),new Fraccion(1,5));
		
		
		
		Fraccion res2 = Fraccion.suma(Fraccion.division(Fraccion.resta(Fraccion.suma(new Fraccion(2,6), new Fraccion(1,3)),new Fraccion(6,4))
				,new Fraccion(2,3)),new Fraccion(1,6));
				
				
		Fraccion res = Fraccion.division(res1, res2);
		System.out.println(res.toString());
	}

	
	public static Fraccion max2(Fraccion f1, Fraccion f2) {
		double a = (double) f1.numerador()/f1.denominador();
		double b = (double) f2.numerador()/f2.denominador();
		return a>=b ? f1 : f2;
	}
	
	public static Fraccion sumaSerie(int n) {
		Fraccion res = new Fraccion(1,1);
		for(int i = 2; i<=n; i++) {
			res = Fraccion.suma(res, new Fraccion(1,i));
		}
		return res;
	}
	
	
	
	public static void main(String []args) {
		Fraccion x = new Fraccion(1,2);
		Fraccion y = new Fraccion(3,25);
		Fraccion z = new Fraccion(4345,35125);

		System.out.println(x.numerador());
		System.out.println(x.denominador());
		
		System.out.println(z.sim().toString());
		System.out.println(x.toString());

		
		Fraccion res1 = Fraccion.suma(x, y);
		System.out.println(res1.toString());
		Fraccion res2 = Fraccion.resta(x, y);
		System.out.println(res2.toString());
		Fraccion res3 = Fraccion.producto(x, y);
		System.out.println(res3.toString());
		Fraccion res4 = Fraccion.division(x, y);
		System.out.println(res4.toString());
		
		
		//Pruebas pedidas especificas
		prueba1();
		prueba2();
		prueba3();


		//Pruebas de las dos funciones
		System.out.println("El resultado de la funcion max2 da : "
		+ max2(new Fraccion(1,2), new Fraccion(3,5)).toString());
		
		System.out.println("El resultado de la funcion sumaSerie da : " 
		+ sumaSerie(5).toString());


	
	}// del main
	}// del programa
