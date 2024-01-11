package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {

	List<Employee> getAllEmp();

	void save(Employee e);

	Employee FindById(int empid);

	void UpdateEmp(Employee e);

	void DeleteById(int eid);

}
