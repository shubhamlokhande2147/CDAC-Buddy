package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{

	private EmpDao edao;
	
	public EmpServiceImpl()
	{
		edao = new EmpDaoImpl(); 
	}

	@Override
	public void addEmp() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		System.out.println("Enter name");
		String ename = sc.next();
		System.out.println("Enter Salary");
		Double dd = sc.nextDouble();
		Employee e = new Employee(eid, ename, dd);
          edao.save(e);		
	}

	@Override
	public void display() {
         edao.dispdata();		
	}

	@Override
	public boolean deletebyId(int id3) {
		return edao.deleteEMP(id3);
	}

	@Override
	public Employee searchById(int id) {
		return edao.searchbyid(id);
	}


	
	
}
