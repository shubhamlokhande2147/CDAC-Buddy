package com.demo.dao;

import com.demo.beans.Employee;

public interface EmpDao {

	void save(Employee e);

	boolean deleteEMP(int id3);

	Employee searchID(int id);

	void display();

}
