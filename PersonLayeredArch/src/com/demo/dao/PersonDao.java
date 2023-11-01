package com.demo.dao;

import com.demo.beans.*;

public interface PersonDao {
	public void save(Person p);

	public Person[] findall();

	public Person findId(int id1);

}
