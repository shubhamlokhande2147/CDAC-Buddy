//
//package com.demo.servlet;
//
//import com.demo.*;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// * Servlet implementation class RegistrationServlet
// */
//public class RegistrationServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
// 
//    public RegistrationServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//
////	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////	
////		 response.setContentType("text/html");
////	     PrintWriter out=response.getWriter();
////	     
////	     String nm = request.getParameter("nm");
////	     String dob = request.getParameter("dob");
////	     String mail = request.getParameter("gmail");
////	     String mobile = request.getParameter("mob");
////	     String adr = request.getParameter("address");
////	     String gender = request.getParameter("gender");	     
////	     String educ[] = request.getParameterValues("edu"); 
////	     String col = request.getParameter("college");
////	     String course = request.getParameter("course");
////
////	     out.println("Name : " + nm +"<br>");
////	     out.println("DOB : " + dob +"<br>");
////	     out.println("Email : " + mail +"<br>");
////	     out.println("Mobile : " + mobile +"<br>");
////	     out.println("Address : " + adr +"<br>");
////	     out.println("Gender : " + gender +"<br>");
////	     out.println("Education : " );
////	     for(int i=0;i< educ.length ;i++)
////	     {
////		     out.println(educ[i]+ "<br>");
////	     }
////	     out.println("College : " + col +"<br>");
////	     out.println("Course : " + course +"<br>");
////	    
////
////	     
////	     Connection conn = null;
////	     if(conn==null) {
////				try {
////					DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
////					String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
////					
////					 conn=DriverManager.getConnection(url,"root","Shubham@2147");
////				
////				} catch (SQLException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			}
////	     
////	      PreparedStatement insertdata;
////	      try {
////			insertdata = conn.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)");
////		    insertdata.setString(1, nm);
////		    insertdata.setString(2, dob);
////            insertdata.setString(3, mail);
////		    insertdata.setString(4, mobile);
////		    insertdata.setString(5, adr);
////		    insertdata.setString(6, gender);
////		    insertdata.setString(7, null);
////		    insertdata.setString(8, col);
////		    insertdata.setString(9, course);
////
////	      } catch (SQLException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////
////	     
////	    }
////		
//    
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    	
//		 response.setContentType("text/html");
//	     PrintWriter out=response.getWriter();
//	     
//	     String nm = request.getParameter("nm");
//	     String dob = request.getParameter("dob");
//	     String mail = request.getParameter("gmail");
//	     String mobile = request.getParameter("mob");
//	     String adr = request.getParameter("address");
//	     String gender = request.getParameter("gender");	     
//	     String educ[] = request.getParameterValues("edu"); 
//	     String col = request.getParameter("college");
//	     String course = request.getParameter("course");
//
//	     out.println("Name : " + nm +"<br>");
//	     out.println("DOB : " + dob +"<br>");
//	     out.println("Email : " + mail +"<br>");
//	     out.println("Mobile : " + mobile +"<br>");
//	     out.println("Address : " + adr +"<br>");
//	     out.println("Gender : " + gender +"<br>");
//	     out.println("Education : " );
//	     for(int i=0;i< educ.length ;i++)
//	     {
//		     out.println(educ[i]+ "<br>");
//	     }
//	     out.println("College : " + col +"<br>");
//	     out.println("Course : " + course +"<br>");
////	    
////	     
////	     Connection conn = null;
////	       try {
////	            // connects to the database
////	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
////	            String url="jdbc:mysql://localhost:3306/advance_java?useSSL=false";
////	            conn = DriverManager.getConnection("url","root","Shubham@2147");
////	 
////	            // constructs SQL statement
////	            String sql = "insert into registration values(?,?,?,?,?,?,?,?,?)";
////	            PreparedStatement statement = conn.prepareStatement(sql);
////
////	            statement.setString(1, nm);
////	            statement.setString(2, dob);
////			    statement.setString(3, mail);
////			    statement.setString(4, mobile);
////			    statement.setString(5, adr);
////			    statement.setString(6, gender);
////			    statement.setString(7, null);
////			    statement.setString(8, col);
////			    statement.setString(9, course);
////			    statement.executeUpdate();
////	             
//    	
//    	try { 
//    		  
//            Connection con = DBUtil.initializeDatabase(); 
//  
//     
//            PreparedStatement st = con 
//                   .prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)"); 
//  
//        
//            st.setString(1, nm);
//		    st.setString(2, dob);
//            st.setString(3, mail);
//		    st.setString(4, mobile);
//		    st.setString(5, adr);
//		    st.setString(6, gender);
//		    st.setString(7, null);
//		    st.setString(8, col);
//		    st.setString(9, course);
//          
//       
//  
//            st.close(); 
//            con.close(); 
//  
//            PrintWriter out1 = response.getWriter(); 
//            out1.println("<html><body><b>Successfully Inserted"
//                        + "</b></body></html>"); 
//        } 
//        catch (Exception e) { 
//            e.printStackTrace(); 
//        } 
//
//
//	        
//	    }
//		
//    }
//	
//
//	
//
