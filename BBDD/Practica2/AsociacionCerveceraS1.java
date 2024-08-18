package asociacioncervecera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AsociacionCerveceraS1 {
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
	 * Genera la tabla gusta<P>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>
	 * 1) id_socio<P>
	 * 2) id_cerveza<P>
	 * 3) id_bar
	 * @hidden
	 * @return {@code True}si se crea la tabla gusta.<P>
	 *         {@code False}si hay errores al crear la tabla
	 */
	public boolean createTableGusta() {
		// Creamos el string con las instrucciones que mandaremos al SQL (crear la tabla cerveza)
		String query = "CREATE TABLE gusta (id_socio INT,id_cerveza INT,id_bar INT,PRIMARY KEY(id_socio,id_cerveza,id_bar),"+ //
				"FOREIGN KEY(id_socio) REFERENCES socio(id_socio) ON DELETE CASCADE ON UPDATE CASCADE," + //
				"FOREIGN KEY(id_cerveza) REFERENCES cerveza(id_cerveza) ON DELETE CASCADE ON UPDATE CASCADE," + //
				"FOREIGN KEY(id_bar) REFERENCES bar(id_bar) ON DELETE CASCADE ON UPDATE CASCADE);";
		try {
			// Enviamos las instrucciones al servidor
			Statement st = conn.createStatement();
			st.executeUpdate(query.toString());
			System.out.println("Tabla gusta creada.");
			return true;
		} // Errores
		catch (SQLException ex) {
			System.out.println("Error al crear la tabla gusta");
			ex.printStackTrace();
			return false;
		}

	}

	/**
	 * Genera la tabla vende<P>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>
	 * 1) id_bar<P>
	 * 2) id_cerveza<P>
	 * 3) precio<P>
	 * 4) fecha_inicio<P>
	 * 5) fecha_fin
	 * @hidden
	 * @return {@code True}si se crea la tabla vende.<P>
	 *         {@code False}si hay errores al crear la tabla
	 */
	public boolean createTableVende() {
		// Creamos el string con las instrucciones que mandaremos al SQL (crear la tabla vende)
		String query = "CREATE TABLE vende (id_bar INT,id_cerveza INT,precio DECIMAL(3,2)," + //
				"fecha_inicio DATE ,fecha_fin DATE, PRIMARY KEY(fecha_inicio, id_bar, id_cerveza)," + //
				"FOREIGN KEY(id_bar) REFERENCES bar(id_bar) ON DELETE CASCADE ON UPDATE CASCADE," + //
				"FOREIGN KEY(id_cerveza) REFERENCES cerveza(id_cerveza) ON DELETE CASCADE ON UPDATE CASCADE);";
		try {
			// Enviamos las instrucciones al servidor
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			System.out.println("Tabla vende creada.");
			return true;
		} // Errores
		catch (SQLException ex) {
			System.out.println("Error al crear la tabla vende");
			ex.printStackTrace();
			return false;
		}
	}
}
