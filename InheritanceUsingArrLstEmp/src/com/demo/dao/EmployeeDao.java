package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> sortAllName = null;
	boolean modifySal = false;

	void save(Employee e);

	List<Employee> showall();

	Employee findById(int id1);

	List<Employee> sortName();

	boolean remove(int id3);

	boolean modifySal(int id5, double sal);

}
