/**
 *
 */
package ortiz.perez.albin.reader;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

/**
 * @author Administrador
 *
 */
public class DataBase {

    public void useDriverManager() {
	try {
	    Connection conn = DriverManager
			    .getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "apo", "apo51331605");
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
    public static void main(String[] args) throws SQLException {

	//	getWarehouseMaterial();
	//	System.exit(0);
	OracleDataSource ods = new OracleDataSource();
	ods.setPortNumber(1521);
	ods.setServerName("localhost");
	ods.setDatabaseName("apo");
	ods.setDriverType("thin");
	ods.setUser("RM_CR009");
	ods.setPassword("RM_CR009");
	ods.setServiceName("xe");
	try (Connection conn = ods.getConnection(); Statement st = conn.createStatement();) {
	    for (int i = 2525801; i < 7525800; i++) {
		st.executeQuery("Insert into RM_CR009.RM_WAREHOUSE_MATERIAL (id,SERIAL,AVAILABLE,MATERIAL_STATUS,"
				+ "OWNER_TYPE,SUPERVISOR_OWNER,PROVIDER_OWNER,TECHNICIAN_OWNER,STATUS,VERSION,"
				+ "EXTERNAL_REF_ID,CALL_ID,TASK,MATERIAL_RETURN_STATUS,COLLECT_STATUS,"
				+ "USE_METER_START,USE_METER_FINISH,PROVISIONING_ACTION,PROVISIONING_COMMENT,"
				+ "PROVISIONING_STATUS,IDENTIFIER_1,IDENTIFIER_2,IDENTIFIER_3,IDENTIFIER_4,"
				+ "IDENTIFIER_5,IDENTIFIER_6,IDENTIFIER_7,IDENTIFIER_8,IDENTIFIER_9,LEVEL_1,LEVEL_2,"
				+ "LEVEL_3,LEVEL_4,LEVEL_5,LEVEL_6,LEVEL_7,LEVEL_8,LEVEL_9,LEVEL_10,OPERATING_UNIT,TRANSACTION_TYPE,SHIPMENT_ID,TRANSACTION_DATE,RETURN_DATE,TRANSACTION_REFERENCE,MATERIAL_TYPE_ID,TRANSFER_ORGANIZATION,OWNING_ORGANIZATION,TRANSFER_SUBINVENTORY,LOT,IDENTIFIER_10,IDENTIFIER_11,IDENTIFIER_12,IDENTIFIER_13,IDENTIFIER_14,IDENTIFIER_15,PROCESSED_EBS) values ("+i+",null,500,'ACCEPTED','TECHNICIAN',224,226,667,'ACTIVE',1,'666-cod001-1586018400375e241d559-9bc9-47d9-ac1d-155357fff86a',null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,'1','1','-1',to_date('05-AUG-20','DD-MON-RR'),null,null,-1,'1','1',null,null,null,null,null,null,null,null,0)");
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	//
	//	DataBase db = new DataBase();
	//	db.useDriverManager();
	//	System.exit(0);
    }

}
