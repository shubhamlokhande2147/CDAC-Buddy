package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn = null;

	public static Connection getMyConnection()
	{
	   if(conn == null)
	   {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
				
				Connection conn=DriverManager.getConnection(url,"root","Shubham@2147");
		
			} catch (SQLException e) {
				System.out.println("Error Occured " + e.getMessage());
				e.printStackTrace();
			}
	   }
	   
	   return conn;
	}
	
	
	public static void closeMyConnection()
	{
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	

}
