package asociacioncervecera;

public class Fabricante {
	
	private int idFabricante;
	private String nombre;
	private String telefono;
	private String email;
	
	public Fabricante(int idFabricante, String nombre, String telefono, String email) {
		this.idFabricante = idFabricante;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	public int getIdFabricante() {
		return idFabricante;
	}
	
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "{idFabricante:" + idFabricante + ", nombre:\"" + nombre + "\", telefono:\"" + telefono + "\", email:\"" + email + "\"}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fabricante other = (Fabricante) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idFabricante != other.idFabricante)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
}
