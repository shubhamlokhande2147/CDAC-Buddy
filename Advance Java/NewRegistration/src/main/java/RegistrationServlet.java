

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement; 

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L; 
	  
    protected void doPost(HttpServletRequest request,  
HttpServletResponse response) 
        throws ServletException, IOException 
    { 
        try { 
  
            // Initialize the database 
            Connection con = DatabaseConnection.initializeDatabase(); 
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            
         String nm = request.getParameter("nm");
   	     String dob = request.getParameter("dob");
   	     String mail = request.getParameter("gmail");
   	     String mobile = request.getParameter("mob");
   	     String adr = request.getParameter("address");
   	     String gender = request.getParameter("gender");	     
   	     String educ[] = request.getParameterValues("edu"); 
   	     String col = request.getParameter("college");
   	     String course = request.getParameter("course");

            
            
            
            PreparedStatement st = con 
                   .prepareStatement("insert into registration values(?,?,?,?,?,?,?,?,?)"); 
  
            st.setString(1, nm);
		    st.setString(2, dob);
            st.setString(3, mail);
		    st.setString(4, mobile);
		    st.setString(5, adr);
		    st.setString(6, gender);
		    st.setString(7, null);
		    st.setString(8, col);
		    st.setString(9, course);
            // For the first parameter, 
            // get the data using request object 
            // sets the data to st pointer 
    //        st.setInt(1, Integer.valueOf(request.getParameter("id"))); 
  
            // Same for second parameter 
  //          st.setString(2, request.getParameter("string")); 
  
            // Execute the insert command using executeUpdate() 
            // to make changes in database 
           
            
            
            
            
            
            
            st.executeUpdate(); 
  
            // Close all the connections 
            st.close(); 
            con.close(); 
  
            // Get a writer pointer  
            // to display the successful result 
            PrintWriter out = response.getWriter(); 
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 

}
