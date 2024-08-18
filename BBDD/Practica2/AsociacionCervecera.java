package asociacioncervecera;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 * @version 3.1
 * @hidden
 * @since 17/05/24
 */
public class AsociacionCervecera {
	final static String NULL_SENTINEL_VARCHAR = "NULL";
	final static int NULL_SENTINEL_INT = Integer.MIN_VALUE;
	final static java.sql.Date NULL_SENTINEL_DATE = java.sql.Date.valueOf("1900-01-01");

	private Connection conn = null;
	private String user;
	private String pass;

	private String url = "jdbc:mysql://localhost:3306/PracticaAsociacionCervecera";


	/**
	 * @param user Usuario con el que se intenta crear la conexion con la base de datos
	 * @param pass Contraseña del usuario con el que se intenta crear la conexion
	 * @return {@code True} si no hay errores al crear la conexion y modifica 
	 * {@link #conn}, {@link #pass}, {@link #user},
	 * {@code False} si hay errores al crear la conexion
	 * @exception SQLException
	 * @see {@link #closeConnection()}
	 * @hidden
	 */
	public boolean openConnection(String user, String pass) {
		try {
			this.user = user;
			this.pass = pass;
			this.conn = DriverManager.getConnection(this.url,this.user,this.pass);
			System.out.println("Se ha creado la conexion correctamente");
			return true;
		} catch (SQLException ex) {
			System.out.println("No se ha logrado conexion a la base");
			ex.printStackTrace();
			return false;
		}
	}
	
	/**
	 * @return {@code True}si no hay errores al cerrar la conexion y cierra {@link #conn},
	 * {@code False} si hay errores al cerrar la conexion
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
	 * Genera la tabla gusta<p>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>1) id_socio<P>2) id_cerveza<P>3) id_bar
	 */
	public boolean createTableGusta(){
		if (tableExists("gusta")) {
			System.out.println("Ya existe la tabla gusta");
				return false;
			}
			String creacion = "CREATE TABLE gusta (\nid_socio INT,\nid_cerveza INT,\nid_bar INT,\n";
			String keys = "PRIMARY KEY(id_socio,id_cerveza,id_bar),\n" + //
						  "FOREIGN KEY(id_socio) REFERENCES socio(id_socio) ON DELETE CASCADE ON UPDATE CASCADE,\n"+//
						  "FOREIGN KEY(id_cerveza) REFERENCES cerveza(id_cerveza) ON DELETE CASCADE ON UPDATE CASCADE,\n" + //
						  "FOREIGN KEY(id_bar) REFERENCES bar(id_bar) ON DELETE CASCADE ON UPDATE CASCADE\n);";
			StringBuilder query = new StringBuilder(creacion);
			query.append(keys);
			try{
				Statement st = conn.createStatement();
				int result = st.executeUpdate(query.toString());
				System.out.println("Tabla gusta Creada.\nFilas afectadas:"+result);
				return true;
			} catch (SQLException ex) {
				System.out.println("Error al crear la tabla gusta");
				ex.printStackTrace();
				return false;
			}

		
	}

	/**
	 * Genera la tabla vende<p>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>1) id_bar<P>2) id_cerveza<P>3) precio<P>4) fecha_inicio<P>5) fecha_fin
	 */
	public boolean createTableVende(){
		if (tableExists("vende")) {
			System.out.println("Ya existe la tabla vende");
				return false;
			}
			String creacion = "CREATE TABLE vende (\nid_bar INT,\nid_cerveza INT,\nprecio DECIMAL(3,2) NOT NULL,\nfecha_inicio DATE NOT NULL,\nfecha_fin DATE,";
			String keys = "PRIMARY KEY(fecha_inicio, id_bar, id_cerveza),\n" + //
						  "FOREIGN KEY(id_bar) REFERENCES bar(id_bar) ON DELETE CASCADE ON UPDATE CASCADE,\n" + //
						  "FOREIGN KEY(id_cerveza) REFERENCES cerveza(id_cerveza) ON DELETE CASCADE ON UPDATE CASCADE\n );";
			StringBuilder query = new StringBuilder(creacion);
			query.append(keys);
			try{
				Statement st = conn.createStatement();
				int result = st.executeUpdate(query.toString());
				System.out.println("Tabla vende creada.\nFilas afectadas:"+result);
				return true;
			} catch (SQLException ex) {
				System.out.println("Error al crear la tabla vende");
				ex.printStackTrace();
				return false;
			}
	}
	
	/**
	 * Extrae los valores del archivo CSV obtenido, y los añade a la base de datos.<p>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>1) id_socio<P>2) id_cerveza<P>3) id_bar
	 * @hidden
	 * @param fileName Direccion relativa del archivo CSV que se va a leer
	 * @return  Devuelve el numero de filas que han sido afectadas.
	 * @exception FileNotFoundException
	 * @exception IOException
	 * @see #createTableGusta()
	 */
	public int insertGustaFromCSV(String fileName) {
		int res = 0;
		BufferedReader lector = null;
		try{
			PreparedStatement ps = conn.prepareStatement("INSERT INTO gusta(id_socio, id_cerveza, id_bar) VALUES (?,?,?);");
			lector = new BufferedReader(new FileReader(fileName));
			String datos = lector.readLine();
			datos = lector.readLine();
			while (datos!=null){
				String[] valores = datos.split(";");
				if (valores.length != 3) {
					System.err.println("Error: formato de linea invalido en CSV");
					continue;
				}
				try{				
					
					ps.setInt(1, Integer.parseInt(valores[0]));//id_socio
					ps.setInt(2, Integer.parseInt(valores[1]));//id_cerveza
					ps.setInt(3, Integer.parseInt(valores[2]));//id_bar
					res += ps.executeUpdate();
				}	
				catch(SQLException ex){
					System.err.println("Error al intentar introducir datos en la tabla gusta");
				}
				catch(NumberFormatException ex){
					System.err.println("Formato de datos erroneo (int,int,int)");
				}
				datos = lector.readLine();
			}
			ps.close();
			lector.close();
		}
		catch(SQLException ex){
			System.err.println("Error al generar PreparedStatement.");
			return 0;
		}
		catch(FileNotFoundException ex){
			System.err.println("Archivo CSV no encontrado.");
			ex.printStackTrace();
			return 0;
		}
		catch(IOException ex){
			System.err.println("Error en la lectura del archivo CSV.");
			ex.printStackTrace();
			return 0;
		}

		System.out.println("Elementos añadidos a la tabla gusta: " + res);
		return res;
	}
	
	/**
	 * Extrae los valores del archivo CSV obtenido, y los añade a la base de datos. <p>
	 * <strong>Note:</strong> Orden de la tabla Gusta:<P>1) id_bar<P>2) id_cerveza<P>3) precio<P>4) fecha_inicio<P>5) fecha_fin
	 * @hidden
	 * @param fileName Direccion relativa del archivo CSV que se va a leer
	 * @return Devuelve el numero de filas que han sido afectadas.
	 * @exception FileNotFoundException
	 * @exception IOException
	 * @exception SQLException
	 * @see #createTableVende()
	 */
	public int insertVendeFromCSV(String fileName) {
		int res = 0;
		BufferedReader lector = null;
		try{
			conn.setAutoCommit(false);
			lector = new BufferedReader(new FileReader(fileName));
			String datos = lector.readLine();
			datos = lector.readLine();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO vende(id_bar, id_cerveza, precio, fecha_inicio, fecha_fin) values (?,?,?,?,?);");
			while (datos!=null){
				String[] valores = datos.split(";");
				if (valores.length != 5 && valores.length !=4) {
					System.err.println("Error: formato de linea invalido en CSV");
					continue;
				}
				//TODO: error si intento crear un vende nuevo cambiando precios.csv original para idbar e id cerveza
				try{
					ps.setInt(1, Integer.parseInt(valores[0]));								//id_bar
					ps.setInt(2, Integer.parseInt(valores[1]));								//id_cerveza
					ps.setFloat(3, Float.parseFloat(valores[2]));							//precio
					ps.setDate(4, java.sql.Date.valueOf(valores[3]));						//fecha_inicio
					ps.setDate(5, valores.length==4?null:java.sql.Date.valueOf(valores[4]));	//fecha_fin
					res+=ps.executeUpdate();
				}		
				catch(SQLException ex){
					conn.rollback();
					System.err.println("Error al intentar introducir datos en la tabla vende");
				}
				catch(IllegalArgumentException ex){
					conn.rollback();
					System.err.println("Formato de datos erroneo (int,int,float,date,date)");
				}
				datos = lector.readLine();
			}
			lector.close();
			ps.close();
			conn.commit();
			conn.setAutoCommit(true);
		}
		catch(FileNotFoundException ex){
			System.err.println("Archivo CSV no encontrado");
			ex.printStackTrace();
			return 0;
		}
		catch(IOException ex){
			System.err.println("Error en la lectura del archivo CSV");
			ex.printStackTrace();
			return 0;
		}
		catch(SQLException ex){
			System.err.println("Error al cambiar el valor de autocommit");
			ex.printStackTrace();
			return 0;
		}
		System.out.println("Elementos añadidos a la tabla vende: "+ res);
		return res;
	}

	/**
	 * Añade una nueva columna a la tabla {@code socio} llamada {@code foto} de tipo <strong>LONGBLOB</strong> 
	 * @hidden
	 * @return Devuelve {@code true} si se añade la columna correctamente y {@code false} si hay algun error.
	 * @exception SQLException
	 */
	public boolean addFotoColumn() {
		if (!tableExists("socio")) {
			System.err.println("No existe la tabla socio.");
			return false;
		}
		String query = "ALTER TABLE socio ADD COLUMN foto LONGBLOB;";
		try{
			Statement st = conn.createStatement();
			int result = st.executeUpdate(query);
			System.out.println("Columna foto añadida.\nFilas afectadas:"+result);
			st.close();
		}
		catch(SQLException ex){
			System.err.println("Error al añadir la columna foto.");
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Extrae todos los elementos de la tabla {@code fabricantes}.
	 * @hidden
	 * @return Devuelve una {@code ArrayList} con todos los fabricantes de la Base de datos. En caso de haber algun error devuelve {@code null}.
	 * @exception SQLException
	 */
	public ArrayList<Fabricante> getFabricantes() {
		if (!tableExists("fabricante")) {
			System.err.println("No existe la tabla fabricante.");
			return null;
		}
		ArrayList<Fabricante> res = new ArrayList<>();
		try{
			Statement query = conn.createStatement();
			ResultSet result = query.executeQuery("SELECT * FROM fabricante;");
			while (result.next()) {
				int idFabricante = result.getInt("id_fabricante");
				String nombre = result.getString("nombre");
				String telefono = result.getString("telefono");
				String email = result.getString("email");
				res.add(new Fabricante(idFabricante, nombre, telefono, email));
			}
			query.close();
			//result.close();No es necesario ya que se cierra automaticamente al cerrar query   
		}
		catch(SQLException ex){
			System.err.println("Error extraer informacion de fabricante.");
			ex.printStackTrace();
			return null;
		}

		System.out.println("Se han extraido " + res.size() + " elementos de fabricante.");
		return res;
	}
	
	/**
	 * Extrae todos los elementos de la tabla {@code cerveza} que genere el {@code fabricante}.
	 * @hidden
	 * @param fabricante Nombre del fabricante que del que se buscaran sus cervezas.
	 * @return Devuelve una {@code ArrayList} con todas las cervezas de la Base de datos que genere el {@code fabricante}.<p> 
	 * Si no se encuentra el fabricante o este no tiene cervezas se devuelve el {@code ArrayList} vacio.<p>
	 * En caso de haber otro error devuelve {@code null}.
	 * @exception SQLException
	 */
	public ArrayList<Cerveza> getCervezasFabricante(String fabricante) {
		if (!tableExists("cerveza") || !tableExists("fabricante")) {
			System.err.println("No existe la tabla cerveza o fabricante.");
			return null;
		}
		ArrayList<Cerveza> res = new ArrayList<>();
		try{
			PreparedStatement query = conn.prepareStatement("SELECT * FROM cerveza x INNER JOIN fabricante y ON x.id_fabricante = y.id_fabricante WHERE y.nombre = ?;");
			query.setString(1, fabricante);
			ResultSet result = query.executeQuery();
			while (result.next()) {
				int idcerveza = result.getInt("id_cerveza");
				String nombre = result.getString("nombre");
				String descripcion = result.getString("descripcion");
				int idfabricante = result.getInt("id_fabricante");
				Cerveza aux = new Cerveza(idcerveza, nombre, descripcion, idfabricante);
				res.add(aux);
			}
			//result.close();No es necesario ya que se cierra automaticamente al cerrar query
			query.close();
		}
		catch(SQLException ex){
			System.err.println("Error extraer informacion de cerveza.");
			ex.printStackTrace();
			return null;
		}
		System.out.println("Se han extraido " + res.size() + " elementos de cerveza.");
		return res;
	}

	//Auxiliares
	/**
	 * @hidden
	 * @param tableName Nombre de la tabla que se busca
	 * @return {@code True} si la tabla existe en la base de datos, {@code False} si la tabla no existe.
	 */
	public boolean tableExists(String tableName) {
		if (conn == null) {
			System.err.println("Error: no conectado");
			return false;
		}

		try {
			DatabaseMetaData metadata = conn.getMetaData();
			ResultSet rs = metadata.getTables(null, null, tableName, null);
			boolean existe = rs.next();
			rs.close();
			return existe;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
}
