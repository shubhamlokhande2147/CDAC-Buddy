package com.demo.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class RegisServlet
 */
public class RegisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegisServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	

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
	     
	     
	     

	    	try { 
	    		  
	            Connection con = DBUtil.initializeDatabase();
	            PreparedStatement st = con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)"); 
	  
	        
	            st.setString(1, nm);
			    st.setString(2, dob);
	            st.setString(3, mail);
			    st.setString(4, mobile);
			    st.setString(5, adr);
			    st.setString(6, gender);
			    st.setString(7, null);
			    st.setString(8, col);
			    st.setString(9, course);
			    
//			    st.setString(1, String.valueOf(request.getParameter(nm)));
//			    st.setString(2, String.valueOf(request.getParameter(dob)));
//			    st.setString(3, String.valueOf(request.getParameter(mail)));
//			    st.setString(4, String.valueOf(request.getParameter(mobile)));
//			    st.setString(5, String.valueOf(request.getParameter(adr)));
//			    st.setString(6, String.valueOf(request.getParameter(gender)));
//			    st.setString(7, String.valueOf(request.getParameter(null)));
//			    st.setString(8, String.valueOf(request.getParameter(col)));
//			    st.setString(9, String.valueOf(request.getParameter(course)));
			    
	       
	  
//	            st.close(); 
//	            con.close(); 
			   st.executeUpdate(); //update values
			    
//	            PrintWriter out1 = response.getWriter(); 
//	            out1.println("<html><body><b>Successfully Inserted"
//	                        + "</b></body></html>"); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        }
	
	
	
	}

}
