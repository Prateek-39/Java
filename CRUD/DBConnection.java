package CRUD;

import java.sql.*;

public class DBConnection {

	public static Connection dataConnection() {
		final String url = "jdbc:mysql://localhost:3306/digitalwallet";
        final String uname = "root";
        final String pass = "******";
        
        Connection conn = null;
        
        try {
			conn = DriverManager.getConnection(url,uname,pass);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return conn;

	}

}
