package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

/**
 * Servlet implementation class UpdateEmpServlet
 */
@WebServlet("/UpdateEmp")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double sal = Double.parseDouble(request.getParameter("sal"));
		EmpService eService = new EmpServiceImpl();
		Employee e = new Employee(empid, ename, sal);
		eService.ModifyEmp(e);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayEmployee");
		rd.forward(request, response);
	}

}
