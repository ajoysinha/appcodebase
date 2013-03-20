/**
 * 
 */
package co.web.appmanagement.dbutility;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * @author 229338
 *
 */
public class DBConenction {

	/*
	 * Get Connection
	 */
	public static Connection getConention(){
		
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/app");
		dataSource.setUser("root");
		dataSource.setPassword("admin");
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
