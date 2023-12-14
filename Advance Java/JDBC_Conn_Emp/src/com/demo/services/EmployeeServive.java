package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServive {

	List<Employee> displayAll();

	void addnewProduct();

	Employee getById(int id);

	boolean deleteById(int id);

	boolean modifyById(int id, String pnm, String qty, double price);

	List<Employee> displaySorted();

	void closeMyconnection();

	
}
