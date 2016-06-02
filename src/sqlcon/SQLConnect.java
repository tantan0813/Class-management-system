package sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnect {
	public Connection conn;
	public SQLConnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void connectdatabase(){
		try {
			String url = "jdbc:mysql://localhost:3306/mytest?characterEncoding=utf8";
			String user = "root";
			String password = "";
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.getMessage();
		}
	}
	
	public void closedatabase(){
		try {
			conn.close();
		} catch (SQLException e) {
			e.getMessage();
		}
	}
}
