package com.demo.service;

import com.demo.beans.Employee;

public interface EmpService {

	void addEmp();

	void display();

	boolean deletebyId(int id3);

	Employee searchById(int id);

}
