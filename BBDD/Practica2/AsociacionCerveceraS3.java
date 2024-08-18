package asociacioncervecera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;

public class AsociacionCerveceraS3 {
	private Connection conn = null;
	private String url = "jdbc:mysql://localhost:3306/PracticaAsociacionCervecera";

	/**
	 * @param user Usuario con el que se intenta crear la conexion con la base de
	 *             datos
	 * @param pass Contraseña del usuario con el que se intenta crear la conexion
	 * @return {@code True}si no hay errores al crear la conexion y modifica {@link #conn}.<P>
	 *         {@code False}si hay errores al crear la conexion
	 * @exception SQLException
	 * @see {@link #closeConnection()}
	 * @hidden
	 */
	public boolean openConnection(String user, String pass) {
		try {
			this.conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Se ha creado la conexion correctamente");
			return true;
		} catch (SQLException ex) {
			System.out.println("No se ha logrado conexion a la base");
			ex.printStackTrace();
			return false;
		}
	}
	
	/**
	 * @return {@code True}si no hay errores al cerrar la conexion y cierra {@link #conn}.<P>
	 *         {@code False}si hay errores al cerrar la conexion
	 * @exception SQLException
	 * @see {@link #openConnection()}
	 * @hidden
	 */
	public boolean closeConnection() {
		try {
			conn.close();
			System.out.println("Conexion cerrada");
			return true;
		} catch (SQLException ex) {
			System.out.println("Error al cerrar base");
			ex.printStackTrace();
			return false;
		}
	}
	/**
	 * Añade una nueva columna a la tabla {@code socio} llamada {@code foto} de tipo
	 * <strong>LONGBLOB</strong>
	 * 
	 * @hidden
	 * @return Devuelve {@code true} si se añade la columna correctamente y
	 *         {@code false} si hay algun error.
	 * @exception SQLException
	 */
	public boolean addFotoColumn() {
		// Creamos el string con las instrucciones que mandaremos al SQL (crear la columna foto)
		String query = "ALTER TABLE socio ADD COLUMN foto LONGBLOB;";
		try {
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Columna foto añadida.");
			st.close();
		} // Errores
		catch (SQLException ex) {
			System.err.println("Error al añadir la columna foto.");
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Extrae todos los elementos de la tabla {@code fabricantes}.
	 * 
	 * @hidden
	 * @return Devuelve una {@code ArrayList} con todos los fabricantes de la Base
	 *         de datos. En caso de haber algun error devuelve {@code null}.
	 * @exception SQLException
	 */
	public ArrayList<Fabricante> getFabricantes() {
		ArrayList<Fabricante> res = new ArrayList<>();
		try {
			// Realizamos la instruccion del SQL(Buscar todos los elementos de fabricante)
			Statement query = conn.createStatement();
			ResultSet result = query.executeQuery("SELECT * FROM fabricante;");
			// Leemos uno a uno los elementos de fabricante
			while (result.next()) {
				// Creamos un objeto nuevo de la clase Fabricante, le damos valores y lo
				// añadimos a la Array list de resultado
				int idFabricante = result.getInt("id_fabricante");
				String nombre = result.getString("nombre");
				String telefono = result.getString("telefono");
				String email = result.getString("email");
				res.add(new Fabricante(idFabricante, nombre, telefono, email));
			}
			query.close();
			// result.close();No es necesario ya que se cierra automaticamente al cerrar query
		} // Errores
		catch (SQLException ex) {
			System.err.println("Error extraer informacion de fabricante.");
			ex.printStackTrace();
			return null;
		}

		System.out.println("Se han extraido " + res.size() + " elementos de fabricante.");
		return res;
	}

	/**
	 * Extrae todos los elementos de la tabla {@code cerveza} que genere el
	 * {@code fabricante}.
	 * 
	 * @hidden
	 * @param fabricante Nombre del fabricante que del que se buscaran sus cervezas.
	 * @return Devuelve una {@code ArrayList} con todas las cervezas de la Base de
	 *         datos que genere el {@code fabricante}.<p>
	 *         Si no se encuentra el fabricante o este no tiene cervezas se devuelve
	 *         el {@code ArrayList} vacio.<p>
	 *         En caso de haber otro error devuelve {@code null}.
	 * @exception SQLException
	 */
	public ArrayList<Cerveza> getCervezasFabricante(String fabricante) {
		ArrayList<Cerveza> res = new ArrayList<>();
		try {
			// Realizamos la instruccion del SQL(Buscar todos los elementos de cerveza
			// pertenecientes al fabricante indicado)
			PreparedStatement query = conn.prepareStatement(
					"SELECT * FROM cerveza x INNER JOIN fabricante y ON x.id_fabricante = y.id_fabricante WHERE y.nombre = ?;");
			query.setString(1, fabricante);
			ResultSet result = query.executeQuery();
			// Leemos uno a uno los elementos de extraidos
			while (result.next()) {
				// Creamos un objeto nuevo de la clase Cerveza, le damos valores y lo añadimos a
				// la Array list de resultado
				int idcerveza = result.getInt("id_cerveza");
				String nombre = result.getString("nombre");
				String descripcion = result.getString("descripcion");
				int idfabricante = result.getInt("id_fabricante");
				res.add(new Cerveza(idcerveza, nombre, descripcion, idfabricante));
			}
			// result.close();No es necesario ya que se cierra automaticamente al cerrar query
			query.close();
		} // Errores
		catch (SQLException ex) {
			System.err.println("Error extraer informacion de cerveza.");
			ex.printStackTrace();
			return null;
		}
		System.out.println("Se han extraido " + res.size() + " elementos de cerveza.");
		return res;
	}

}

