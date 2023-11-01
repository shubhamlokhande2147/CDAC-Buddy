package com.demo.services;
import java.util.*;
import com.demo.dao.*;
import com.demo.beans.*;
//this is class which implements interface -----

public class PersonServiceImpl implements PersonService {
	private PersonDao  pdao;

	public PersonServiceImpl() 
	{
		pdao=new PersonImpl();
		//super();
	}

	@Override
	public void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String sname=sc.next();
		System.out.println("enter phone no");
		String no=sc.next();
		Person p=new Person(id,sname,no);
		pdao.save(p);
	}

	@Override
	public Person[] displayAll() {
		return pdao.findall();
	}

	@Override
	public Person SearchById(int id1) {
		// TODO Auto-generated method stub
		return pdao.findId(id1);
	}


	
	
}
