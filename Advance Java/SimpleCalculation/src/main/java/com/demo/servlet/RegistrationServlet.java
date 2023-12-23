
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
	
	

