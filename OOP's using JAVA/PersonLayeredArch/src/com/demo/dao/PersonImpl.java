package com.demo.dao;

import com.demo.beans.Person;

public class PersonImpl implements PersonDao{

	static Person parr[];
	static int cnt;
	static
	{
		parr=new Person[10];
		parr[0]=new Person(1,"harsh","1234567890");
		cnt=1;
	}
	@Override
	public void save(Person p)
	{
		parr[cnt]=p;
		cnt++;
	}
	@Override
	public Person[] findall() {
		// TODO Auto-generated method stub
		return parr;
	}
	@Override
	public Person findId(int id1) {
		// TODO Auto-generated method stub
		for(int i=0;i<parr.length;i++)
		{
			if(parr[i] != null) 
			{
				if(parr[i].getPid()==id1)
				{
					return parr[i];
				}
			}
		}
		return null;
	}

}
