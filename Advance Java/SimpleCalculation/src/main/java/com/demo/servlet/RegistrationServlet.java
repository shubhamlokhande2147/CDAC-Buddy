
package com.demo.servlet;

import com.demo.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 response.setContentType("text/html");
	     PrintWriter out=response.getWriter();
	     
	     String nm = request.getParameter("nm");
	     String dob = request.getParameter("dob");
	     String mail = request.getParameter("gmail");
	     String mobile = request.getParameter("mob");
	     String adr = request.getParameter("address");
	     String gender = request.getParameter("gender");	     
	     String educ[] = request.getParameterValues("edu"); 
	     String col = request.getParameter("college");
	     String course = request.getParameter("course");

	     out.println("Name : " + nm +"<br>");
	     out.println("DOB : " + dob +"<br>");
	     out.println("Email : " + mail +"<br>");
	     out.println("Mobile : " + mobile +"<br>");
	     out.println("Address : " + adr +"<br>");
	     out.println("Gender : " + gender +"<br>");
	     out.println("Education : " );
	     for(int i=0;i< educ.length ;i++)
	     {
		     out.println(educ[i]+ "<br>");
	     }
	     out.println("College : " + col +"<br>");
	     out.println("Course : " + course +"<br>");
	    
	     
//	      Connection conn = getMyConnection();
//	      PreparedStatement insertdata;
//		  static {
//			  
//			  try {
//					insertdata = conn.prepareStatement("insert into registration values(nm,dob,mail,mobile,adr,gender,educ,col,course)");
//
//				  
//		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		  }

	     
	     Connection conn = null;
	     if(conn==null) {
				try {
					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
					String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
					
					 conn=DriverManager.getConnection(url,"root","Shubham@2147");
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	     
	      PreparedStatement insertdata;
	      try {
			insertdata = conn.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)");
		    insertdata.setString(1, nm);
		    insertdata.setString(2, dob);
            insertdata.setString(3, mail);
		    insertdata.setString(4, mobile);
		    insertdata.setString(5, adr);
		    insertdata.setString(6, gender);
		    insertdata.setString(7, null);
		    insertdata.setString(8, col);
		    insertdata.setString(9, course);

	      } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	     
	    }
		
}
	
//package net.codejava.upload;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
// 
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
// 
//@WebServlet("/uploadServlet")
//@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
//public class FileUploadDBServlet extends HttpServlet {
//     
//    // database connection settings
//    private String dbURL = "jdbc:mysql://localhost:3306/AppDB";
//    private String dbUser = "root";
//    private String dbPass = "secret";
//     
//    protected void doPost(HttpServletRequest request,
//            HttpServletResponse response) throws ServletException, IOException {
//        // gets values of text fields
//        String firstName = request.getParameter("firstName");
//        String lastName = request.getParameter("lastName");
//         
//        InputStream inputStream = null; // input stream of the upload file
//         
//        // obtains the upload file part in this multipart request
//        Part filePart = request.getPart("photo");
//        if (filePart != null) {
//            // prints out some information for debugging
//            System.out.println(filePart.getName());
//            System.out.println(filePart.getSize());
//            System.out.println(filePart.getContentType());
//             
//            // obtains input stream of the upload file
//            inputStream = filePart.getInputStream();
//        }
//         
//        Connection conn = null; // connection to the database
//        String message = null;  // message will be sent back to client
//         
//        try {
//            // connects to the database
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
// 
//            // constructs SQL statement
//            String sql = "INSERT INTO contacts (first_name, last_name, photo) values (?, ?, ?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, firstName);
//            statement.setString(2, lastName);
//             
//            if (inputStream != null) {
//                // fetches input stream of the upload file for the blob column
//                statement.setBlob(3, inputStream);
//            }
// 
//            // sends the statement to the database server
//            int row = statement.executeUpdate();
//            if (row > 0) {
//                message = "File uploaded and saved into database";
//            }
//        } catch (SQLException ex) {
//            message = "ERROR: " + ex.getMessage();
//            ex.printStackTrace();
//        } finally {
//            if (conn != null) {
//                // closes the database connection
//                try {
//                    conn.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//            // sets the message in request scope
//            request.setAttribute("Message", message);
//             
//            // forwards to the message page
//            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
//        }
//    }
//}

	

