package com.demo.servises;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServices {

	void addNewEmp(int ch);

	List<Employee> displayAll();

	Employee displayByID(int id1);

	List<Employee> sortByName();

	boolean deletebyID(int id3);

	boolean modifySalById(int id5, double sal);

}
