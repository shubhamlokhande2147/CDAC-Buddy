package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  
	  String unm = request.getParameter("uname");
	  String passwd = request.getParameter("pass");
	  
	  if(unm.equals("admin") && passwd.equals("admin"))
	  {
//		    RequestDispatcher rd=request.getRequestDispatcher("Formdata.html");
//			rd.forward(request, response);  
		  
		  out.println("Login Successfully...!");
	  }
	  else
	  {
		    out.println("Wrong credentials , pls re-eneter");
			RequestDispatcher rd=request.getRequestDispatcher("LoginPage.html");
			rd.include(request, response);
			out.print("testing");
	  }

  }

}
