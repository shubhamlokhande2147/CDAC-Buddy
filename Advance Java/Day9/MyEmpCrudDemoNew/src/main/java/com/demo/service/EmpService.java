package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	List<Employee> FindAllEmp();

	void AddnewEmp(Employee e);

	Employee getById(int empid);

	void ModifyEmp(Employee e);

	void DelById(int eid);

}
