package com.demo.services;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.EmployeeDao;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;


public class EmployeeServiveImpl implements EmployeeServive{
	
	private EmployeeDao edao ;
	
	public EmployeeServiveImpl()
	{
		edao = new EmployeeDaoImpl();
	}
	

@Override
public List<Employee> displayAll() {
	return edao.findAll();
}

@Override
public void addnewProduct() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr pid");
	int pid=sc.nextInt();
	System.out.println("enetr Name");
	String pnm=sc.next();
	System.out.println("enetr dept");
	String qty=sc.next();
	System.out.println("enetr price");
	double price=sc.nextDouble();
	Employee p=new Employee(pid,pnm,qty,price);
	edao.save(p);
	
}

@Override
public Employee getById(int id) {
	return edao.findById(id);
}

@Override
public boolean deleteById(int id) {
	return edao.removeById(id);
}

@Override
public boolean modifyById(int id, String pnm, String qty, double price) {
	return edao.updateById(id,pnm,qty,price);
}

@Override
public List<Employee> displaySorted() {
	return edao.findSorted();
}

@Override
public void closeMyconnection() {
	edao.closeConnection();
	
}
  
	

}
