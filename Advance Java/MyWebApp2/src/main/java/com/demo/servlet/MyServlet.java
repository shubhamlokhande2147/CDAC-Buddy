package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{ 
	 response.setContentType("text/html"); 
	 PrintWriter out = response.getWriter(); 
	 out.println("<h1>Welcome to Server SIDE</h1>"); 
	}

}
