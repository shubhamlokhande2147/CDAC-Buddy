package com.demo.services;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServicesImpl implements EmpServices {
	private EmpDao edao;

	public EmpServicesImpl() {
		edao = new EmpDaoImpl();
	}

	@Override
	public void addEmp() {
		// TODO Auto-generated method stub
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
	public boolean deletebyId(int id3) {
		// TODO Auto-generated method stub
		return edao.deleteEMP(id3);
	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return edao.searchID(id);
	}

	@Override
	public void DisplayAll() {
		edao.display();

	}

}
