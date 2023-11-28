package com.demo.dao;

import com.demo.beans.Employee;

public interface EmpDao {

	void save(Employee e);

	void dispdata();

	boolean deleteEMP(int id3);

	Employee searchbyid(int id);

	


}
