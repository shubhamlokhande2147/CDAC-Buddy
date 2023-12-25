package com.demo.servlet;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBUtil {
//	static Connection conn=null;
//	
//	public static Connection getMyConnection() {
//		if(conn==null) {
//			try {
//				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//				String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
//				
//				 conn=DriverManager.getConnection(url,"root","Shubham@2147");
//			
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return conn;
//	}
//	
//	public static void closeMyConnection() {
//		if(conn!=null)
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
//	
//
//}


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DBUtil { 
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql:// localhost:3306/"; 
        // Database name to access 
        String dbName = "advance_java"; 
        String dbUsername = "root"; 
        String dbPassword = "Shubham@2147"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        return con; 
    } 
} 
