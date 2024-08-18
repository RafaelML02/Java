package enun;

public class Localidad {
	private String nombre;
	private int mujeres,hombres;
	
	public Localidad(String nombre, int mujeres, int hombres) {
		this.nombre = nombre;
		this.mujeres = mujeres;
		this.hombres = hombres;
	}
	
	public String toString() {
		return "La localidad se llama " + nombre + ", el numero de mujeres es " + mujeres + 
				" y el numero de hombres es " + hombres ;
	}
	
	public int poblacion() {
		return mujeres + hombres;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Localidad aux = (Localidad) o;
	    return mujeres == aux.mujeres && hombres == aux.hombres && nombre.equals(aux.nombre);
	}

	
	public static Localidad fusion(Localidad loc1, Localidad loc2) {
		int a = loc1.mujeres != 0 ? loc1.mujeres : loc2.mujeres;
	    int b = loc1.hombres != 0 ? loc1.hombres : loc2.hombres;
	    return new Localidad(loc1.nombre, a, b);
	}



}
