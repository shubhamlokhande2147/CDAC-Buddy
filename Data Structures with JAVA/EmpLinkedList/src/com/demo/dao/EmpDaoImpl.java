package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.beans.LinkedList;
import com.demo.beans.LinkedList.Node;

public class EmpDaoImpl implements EmpDao {
	static LinkedList list;
	static {
		list = new LinkedList();
		list.addAtEnd(new Employee(1, "harsh", 22.22));
		list.addAtEnd(new Employee(2, "Shubham", 11.11));
	}

	@Override
	public void save(Employee e) {
		// TODO Auto-generated method stub
		list.addAtEnd(e);
	}

	@Override
	public boolean deleteEMP(int id) {
		// TODO Auto-generated method stub
		Employee e = searchID(id);
		if (e != null) {
			list.deleteByValue(e);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Employee searchID(int id) {
		// TODO Auto-generated method stub
		Node temp = list.Head();

		while (temp != null && temp.data.getEmpid() != id) {
			temp = temp.next;
		}
		if (temp != null) {
			Employee e = temp.data;
			return e;
		}
		return null;
	}

	@Override
	public void display() {
		list.displaydata();
	}

}
