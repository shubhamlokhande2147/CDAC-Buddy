package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDemo {
	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
			
			Connection conn=DriverManager.getConnection(url,"root","Shubham@2147");
			if (conn!=null) {
				System.out.println("Connection Done");
			}
			
		} catch (SQLException e) {
			System.out.println("Error Occured " + e.getMessage());
			e.printStackTrace();
		}
	}

}
