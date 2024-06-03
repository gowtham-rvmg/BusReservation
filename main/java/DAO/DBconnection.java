package DAO;

import java.sql.*;

public class DBconnection {
	
	private static String Url="jdbc:mysql://localhost:3306/BusRevBackend";  //jdbc / mysql(which db used) / url(where it is running) / database name
	private static String Name= "root";
	private static String Pass="1234";
	
	public static Connection getconnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(Url, Name, Pass);
	}

}
