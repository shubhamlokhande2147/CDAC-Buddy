package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {
	
	List<Employee> findAll();

	void save(Employee p);

	Employee findById(int id);

	boolean removeById(int id);

	boolean updateById(int id, String pnm, String qty, double price);

	List<Employee> findSorted();

	void closeConnection();

}
