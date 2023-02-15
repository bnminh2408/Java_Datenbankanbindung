package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Diese Klasse verbindet das Programm mit ein Datenbank oder trennen das
 * Programm von ein Datenbank.
 * 
 * @author NBui
 * @version 01
 */
public class MysqlDatabase {

	private static String url = "jdbc:mysql://localhost:3306/shareshopgmbhdatenbank";
	private static String username = "root"; // User of the database
	private static String password = "";// User password

	/**
	 * Verbindung mit Datenbank erstellen.
	 */
	public static Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
			//System.out.println("Successfully connected to database.");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return connection;
	}

	/**
	 * Verbindung mit Datenbank trennen.
	 */
	public static void disconnect(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
				//System.out.println("Disconnected to database.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
