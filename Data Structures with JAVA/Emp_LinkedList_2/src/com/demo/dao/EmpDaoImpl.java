package com.demo.dao;


import com.demo.beans.Employee;
import com.demo.beans.MySingliLinkedList;
import com.demo.beans.MySingliLinkedList.Node;

public class EmpDaoImpl implements EmpDao{

	static MySingliLinkedList list;
	static {
		list = new MySingliLinkedList();
		list.addAtEnd(new Employee(2, "Shubham", 1111.12));
		list.addAtEnd(new Employee(1, "harsh", 220.2));
	}
	@Override
	public void save(Employee e) {

 		 list.addAtEnd(e);
	}
	@Override
	public void dispdata() {
          list.displaydata();		
	}

	@Override
	public boolean deleteEMP(int id3) {
		// TODO Auto-generated method stub
		Employee e = searchbyid(id3);
		if (e != null) {
			list.deleteByValue(e);
			return true;
		} else {
			return false;
		}
	}


	@Override
	public Employee searchbyid(int id) {

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



}
