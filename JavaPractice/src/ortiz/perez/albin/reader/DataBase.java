/**
 * 
 */
package ortiz.perez.albin.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrador
 *
 */
public class DataBase {

	public void useDriverManager() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "apo",
					"apo51331605");
			Statement st = conn.createStatement();
			st.executeQuery("insert into table1 values ('lol')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getWarehouseMaterial() {
		Connection connection = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "RESOURCES_MANAGER",
					"RESOURCES_MANAGER");
			ResultSet rs = connection.createStatement()
					.executeQuery("select * from RM_WAREHOUSE_MATERIAL order by id asc");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String code = rs.getString("code");
				String description = rs.getString("description");
				String type = rs.getString("type");
				String measure = rs.getString("measure");
				String status = rs.getString("status");
				String materialTypeCategory = rs.getString("material_type_category");
				System.out.println(id);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		getWarehouseMaterial();
		System.exit(0);

//		try {
//		OracleDataSource ods = new OracleDataSource();
//		ods.setPortNumber(1521);
//		ods.setServerName("localhost");
//		ods.setDatabaseName("apo");
//		ods.setDriverType("thin");
//		ods.setUser("apo");
//		ods.setPassword("apo51331605");
//		ods.setServiceName("xe");
//		Connection conn = ods.getConnection();
//		Statement st = conn.createStatement();
//		st.executeQuery("insert into table1 values ('lol')");
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} finally {
//
//	}

		DataBase db = new DataBase();
		db.useDriverManager();
		System.exit(0);
	}

}
