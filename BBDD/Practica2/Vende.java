package asociacioncervecera;

public class Vende {
	
	String nombreCerveza;
	String nombreBar;
	String direccionBar;
	float precio;
	
	public Vende(String nombreCerveza, String nombreBar, String direccionBar, float precio) {
		this.nombreCerveza = nombreCerveza;
		this.nombreBar = nombreBar;
		this.direccionBar = direccionBar;
		this.precio = precio;
	}
	
	public String getNombreCerveza() {
		return nombreCerveza;
	}
	
	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}
	
	public String getNombreBar() {
		return nombreBar;
	}
	
	public void setNombreBar(String nombreBar) {
		this.nombreBar = nombreBar;
	}
	
	public String getDireccionBar() {
		return direccionBar;
	}
	
	public void setDireccionBar(String direccionBar) {
		this.direccionBar = direccionBar;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "{cerveza:\"" + nombreCerveza + "\", bar:\"" + nombreBar + "\"}";
	}

}
