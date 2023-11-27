package com.demo.service;

import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{

	private EmpDaoImpl edao;
	public EmpServiceImpl()
	{
		edao = new EmpDaoImpl(); 
	}
	
	
}
