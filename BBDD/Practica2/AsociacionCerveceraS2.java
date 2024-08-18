package asociacioncervecera;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class AsociacionCerveceraS2 {
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
	 * Extrae los valores del archivo CSV obtenido, y los añade a la base de datos.<P>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>
	 * 1) id_socio<P>
	 * 2) id_cerveza<P>
	 * 3) id_bar
	 * @hidden
	 * @param fileName Direccion relativa del archivo CSV que se va a leer
	 * @return Devuelve el numero de filas que han sido afectadas.
	 * @exception FileNotFoundException
	 * @exception IOException
	 */
	public int insertGustaFromCSV(String fileName) {
		int res = 0;
		BufferedReader lector = null;
		try {
			// Preparamos la instruccion
			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO gusta(id_socio, id_cerveza, id_bar) VALUES (?,?,?);");
			// Abrimos el archivo CSV para lectura
			lector = new BufferedReader(new FileReader(fileName));
			// Saltamos la primera linea (titulos)
			String datos = lector.readLine();
			datos = lector.readLine();
			while (datos != null) {
				// Extraemos los valores de la nueva linea del archivo CSV
				String[] valores = datos.split(";");
				// Verificamos que la linea del archivo CSV tiene la cantidad correcta de elementos
				if (valores.length != 3) {
					System.err.println("Error: formato de linea invalido en CSV");
					continue;
				}
				try {
					// Introducimos los valores del CSV en la instruccion de SQL
					ps.setInt(1, Integer.parseInt(valores[0]));// id_socio
					ps.setInt(2, Integer.parseInt(valores[1]));// id_cerveza
					ps.setInt(3, Integer.parseInt(valores[2]));// id_bar
					res += ps.executeUpdate();
				} // Errores
				catch (SQLException ex) {
					System.err.println("Error al intentar introducir datos en la tabla gusta");
				} catch (NumberFormatException ex) {
					System.err.println("Formato de datos erroneo (int,int,int)");
				}
				// Leemos la proxima linea de CSV
				datos = lector.readLine();
			}
			ps.close();
			lector.close();
		} // Errores
		catch (SQLException ex) {
			System.err.println("Error al generar PreparedStatement.");
			return 0;
		} catch (FileNotFoundException ex) {
			System.err.println("Archivo CSV no encontrado.");
			ex.printStackTrace();
			return 0;
		} catch (IOException ex) {
			System.err.println("Error en la lectura del archivo CSV.");
			ex.printStackTrace();
			return 0;
		}
		System.out.println("Elementos añadidos a la tabla gusta: " + res);
		return res;
	}

	/**
	 * Extrae los valores del archivo CSV obtenido, y los añade a la base de datos.<P>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>
	 * 1) id_bar<P>
	 * 2) id_cerveza<P>
	 * 3) precio<P>
	 * 4) fecha_inicio<P>
	 * 5) fecha_fin
	 * @hidden
	 * @param fileName Direccion relativa del archivo CSV que se va a leer
	 * @return Devuelve el numero de filas que han sido afectadas.
	 * @exception FileNotFoundException
	 * @exception IOException
	 * @exception SQLException
	 */
	public int insertVendeFromCSV(String fileName) {
		// Contador de acciones realizadas
		int res = 0;
		BufferedReader lector = null;
		try {
			conn.setAutoCommit(false);
			lector = new BufferedReader(new FileReader(fileName));
			// Saltamos la primera linea (titulos)
			String datos = lector.readLine();
			datos = lector.readLine();
			// Preparamos la instruccion
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO vende(id_bar, id_cerveza, precio, fecha_inicio, fecha_fin) values (?,?,?,?,?);");
			while (datos != null) {
				// Extraemos los valores de la nueva linea del archivo CSV
				String[] valores = datos.split(";");
				// Verificamos que la linea del archivo CSV tiene la cantidad correcta de elementos
				if (valores.length != 5 && valores.length != 4) {
					res=0;
					try {conn.rollback();} catch(SQLException e){} 
					System.err.println("Error: formato de linea invalido en CSV");
					break;
				}
				// Introducimos los valores del CSV en la instruccion de SQL
				ps.setInt(1, Integer.parseInt(valores[0])); // id_bar
				ps.setInt(2, Integer.parseInt(valores[1])); // id_cerveza
				if(valores[2].equals("") || valores[2] == null ){ // precio
					ps.setNull(3, Types.INTEGER);
				} else{
					ps.setFloat(3, Float.parseFloat(valores[2]));
				}
				ps.setDate(4, java.sql.Date.valueOf(valores[3])); // fecha_inicio
				if( valores.length == 4){ // fecha_fin
					ps.setNull(5, Types.DATE);
				} else{
					ps.setDate(5, java.sql.Date.valueOf(valores[4]));
				}
				res += ps.executeUpdate();
				// Leemos la proxima linea de CSV
				datos = lector.readLine();
			}
			lector.close();
			ps.close();
			conn.commit();
		 // Errores
		} catch (IllegalArgumentException ex) {
			res=0;
			try {conn.rollback();} catch(SQLException e){} 
			System.err.println("Formato de datos erroneo (int,int,float,date,date)");
			ex.printStackTrace();
		}
		catch (FileNotFoundException ex) {
			res=0;
			System.err.println("Archivo CSV no encontrado");
			ex.printStackTrace();
		} catch (IOException ex) {
			res=0;
			System.err.println("Error en la lectura del archivo CSV");
			ex.printStackTrace();
		} catch (SQLException ex) {
			res=0;
			try {conn.rollback();} catch(SQLException e){} 
			System.err.println("Error al intentar introducir datos en la tabla vende");
			ex.printStackTrace();	
		} finally{
			try{
			conn.setAutoCommit(true);
			}
			catch (SQLException ex) {
				System.err.println("Error al cambiar el valor de autocommit");
				ex.printStackTrace();
			}	
		}
		System.out.println("Elementos añadidos a la tabla vende: " + res);
		return res;
	}

}