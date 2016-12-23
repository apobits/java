/**
 * 
 */
package ortiz.perez.albin.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author Administrador
 *
 */
public class DataBase {
	
	public void useDriverManager(){
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "apo", "apo51331605");
			Statement st = conn.createStatement();
			st.executeQuery("insert into table1 values ('lol')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataBase db = new DataBase();
		db.useDriverManager();
//		try {
//			OracleDataSource ods = new OracleDataSource();
//			ods.setPortNumber(1521);
//			ods.setServerName("localhost");
//			ods.setDatabaseName("apo");
//			ods.setDriverType("thin");
//			ods.setUser("apo");
//			ods.setPassword("apo51331605");
//			ods.setServiceName("xe");
//			Connection conn = ods.getConnection();
//			Statement st = conn.createStatement();
//			st.executeQuery("insert into table1 values ('lol')");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//
//		}

	}

}
