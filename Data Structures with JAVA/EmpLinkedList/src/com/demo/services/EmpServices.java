package com.demo.services;

import com.demo.beans.Employee;

public interface EmpServices {

	void addEmp();

	boolean deletebyId(int id3);

	Employee searchById(int id);

	void DisplayAll();

}
