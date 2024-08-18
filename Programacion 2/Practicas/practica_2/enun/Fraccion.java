package practica_2.enun;

public class Fraccion {

	private int numerador;
    private int denominador;

	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
        this.denominador = denominador;
	}
	
	public int numerador() { return numerador;}
	public int denominador() { return denominador;}
	
	public boolean equals(Object o) {
		return this.equals(o);
		} 
	
	 private static int mcd(int a, int b) {
	        while (b != 0) {
	            int res = b;
	            b = a % b;
	            a = res;
	        }
	        return Math.abs(a);
	    }
	 
	 public Fraccion sim() {
		int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
        return new Fraccion(numerador,denominador);
	}
	
	public static Fraccion suma(Fraccion x, Fraccion y) {
		int nuevoDenominador = x.denominador() * y.denominador();
        int nuevoNumerador = x.numerador() * y.denominador() +
               y.numerador() * x.denominador();
        Fraccion res = new Fraccion(nuevoNumerador, nuevoDenominador);
        return res.sim();
    }
	
	public static Fraccion resta(Fraccion x, Fraccion y) {	
		int nuevoDenominador = x.denominador() * y.denominador();
        int nuevoNumerador = x.numerador() * y.denominador() -
               y.numerador() * x.denominador();
        Fraccion res = new Fraccion(nuevoNumerador, nuevoDenominador);
        return res.sim();
	}
	
	public static Fraccion producto(Fraccion x, Fraccion y) {
		int nuevonum = x.numerador() * y.numerador();
		int nuevoden = x.denominador() * y.denominador();
		Fraccion res = new Fraccion(nuevonum, nuevoden);
		return res.sim();
	}
	
	public static Fraccion division(Fraccion x, Fraccion y) {
		int nuevonum = x.numerador() * y.denominador();
		int nuevoden = x.denominador() * y.numerador();
		Fraccion res = new Fraccion(nuevonum, nuevoden);
		return res.sim();
	}
	
	
	public String toString() {
		return numerador + "/" + denominador;
		
		
	}

}
