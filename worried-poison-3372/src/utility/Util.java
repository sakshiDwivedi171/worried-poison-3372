package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

	public static Connection provideConnection() {
		
		Connection conn = null;		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url= "jdbc:mysql://localhost:3306/worried_poison_3372";
		
		try {
			conn = DriverManager.getConnection(url, "root", "Gauri31@");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
