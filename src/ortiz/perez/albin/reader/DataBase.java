/**
 * 
 */
package ortiz.perez.albin.reader;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author Administrador
 *
 */
public class DataBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			OracleDataSource ods = new OracleDataSource();
			ods.setPortNumber(1521);
			ods.setServerName("localhost");
			ods.setDatabaseName("apo");
			ods.setDriverType("thin");
			ods.setUser("apo");
			ods.setPassword("apo51331605");
			ods.setServiceName("xe");
			Connection conn = ods.getConnection();
			Statement st = conn.createStatement();
			st.executeQuery("insert into table1 values ('lol')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
