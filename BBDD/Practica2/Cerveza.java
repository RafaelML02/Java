package asociacioncervecera;

public class Cerveza {
	
	int idCerveza;
	String nombre;
	String descripcion;
	int idFabricante;
	
	public Cerveza(int idCerveza, String nombre, String descripcion, int idFabricante) {
		this.idCerveza = idCerveza;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.idFabricante = idFabricante;
	}
	
	public int getIdCerveza() {
		return idCerveza;
	}
	
	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getIdFabricante() {
		return idFabricante;
	}
	
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}

	@Override
	public String toString() {
		return "{idCerveza:" + idCerveza + ", nombre:\"" + nombre + "\", descripcion:\"" + descripcion + "\", idFabricante:" + idFabricante + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerveza other = (Cerveza) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idCerveza != other.idCerveza)
			return false;
		if (idFabricante != other.idFabricante)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}

