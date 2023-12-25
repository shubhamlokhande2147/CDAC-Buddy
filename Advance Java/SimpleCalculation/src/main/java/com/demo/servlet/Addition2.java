package com.demo.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Addition2
 */
public class Addition2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Addition2() {    super();    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		    response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			int n1 = Integer.parseInt(request.getParameter("num1"));
			int n2 = Integer.parseInt(request.getParameter("num2"));
			
			int result = n1 + n2;
			out.println("Addition : " + result);
			
			int result1 = n1 - n2;
			out.println("\nSub : " + result1);
			
			int result2 = n1 * n2;
			out.println("\nMulti : " + result2);
			
			int result3 = n1 / n2;
			out.println("\nDiv : " + result3);

			
			
	}

}
