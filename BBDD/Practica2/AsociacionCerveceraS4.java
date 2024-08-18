package asociacioncervecera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AsociacionCerveceraS4 {
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
			this.conn = DriverManager.getConnection(this.url, user, pass);
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
	 * Actualiza la foto de un {@code socio}
	 * 
	 * @hidden
	 * @param email    Sirve para poder identificar al socio que se debe actualizar
	 * @param filename Ruta especifica de la nueva foto del socio
	 * @return El metodo devolvera {@code true} si la foto ha sido actualizada
	 *         correctamente.<P>
	 *         En caso de haber un error devuelve {@code false}.
	 * @exception SQLException
	 */
	public boolean updateFoto(String email, String filename) {
		try {
			File fs = new File(filename);
			// Realizamos la instruccion del SQL
			PreparedStatement ps = conn.prepareStatement("UPDATE socio SET foto = ? WHERE email = ? ;");
			// Buscamos la ruta de la foto
			ps.setBinaryStream(1, new FileInputStream(fs), fs.length());
			ps.setString(2, email);
			ps.executeUpdate();
			ps.close();
		} // Errores
		catch (SQLException ex) {
			System.out.println("Error al actualizar la foto");
			ex.printStackTrace();
			return false;
		} catch (FileNotFoundException ex) {
			System.out.println("Error al encontrar la foto");
			ex.printStackTrace();
			return false;
		}
		System.out.println("Foto actualizada con exito");
		return true;
	}

	/**
	 * Extrae multiples elementos de las tablas {@code bar y vende} que cumpla los
	 * distintos requisitos:<P>
	 * 1) Se busca una cerveza que tenga el mismo patron de nombre que el parametro
	 * recibido {@code cerveza}<P>
	 * 2) La cerveza tiene que estar a la venta, y ademas tiene que ser el precio
	 * minimo<P>
	 * 
	 * @hidden
	 * @param cerveza Patron del nombre de la cerveza que se busca.
	 * @return El método retornará un {@code ArrayList} de la clase {@code Vende},
	 *         que tendrá tantos elementos como
	 *         cervezas cuyos nombres cumplan con el patrón.<P>
	 *         Si no se encuentran cervezas que cumplan el patron de devolvera un
	 *         {@code ArrayList} vacio.<P>
	 *         En caso de haber otro error devuelve {@code null}.
	 * @exception SQLException
	 */
	public ArrayList<Vende> cheapest(String cerveza) {
		ArrayList<Vende> res = new ArrayList<>();
		try {
			// Realizamos la instruccion del SQL
			PreparedStatement ps = conn.prepareStatement("SELECT b.nombre, b.direccion, c.nombre, v.precio "+//
			"FROM bar b ,vende v ,cerveza c WHERE b.id_bar = v.id_bar AND v.id_cerveza = c.id_cerveza AND "+//
			"(v.precio , v.id_cerveza) IN (SELECT MIN(precio) , v.id_cerveza FROM vende v, cerveza c WHERE "+//
			"v.id_cerveza = c.id_cerveza AND  c.nombre LIKE ? AND v.fecha_fin IS NULL GROUP BY v.id_cerveza);");
			ps.setString(1, cerveza);
			ResultSet rs = ps.executeQuery();
			// Leemos uno a uno los elementos de extraidos
			while (rs.next()) {
				// Creamos un objeto nuevo de la clase Vende, le damos valores y lo añadimos a
				// la Array list de resultado
				res.add(new Vende(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			ps.close();
			System.out.println("Elementos extraidos: " + res.size());
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
		return res;
	}

}

