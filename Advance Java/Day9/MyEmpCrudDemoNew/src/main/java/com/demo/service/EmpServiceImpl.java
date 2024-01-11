package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService {
	private EmpDao eDao;

	public EmpServiceImpl() {
		super();
		this.eDao = new EmpDaoImpl();
	}

	@Override
	public List<Employee> FindAllEmp() {
		return eDao.getAllEmp();
	}

	@Override
	public void AddnewEmp(Employee e) {
		eDao.save(e);
	}

	@Override
	public Employee getById(int empid) {
		// TODO Auto-generated method stub
		return eDao.FindById(empid);
	}

	@Override
	public void ModifyEmp(Employee e) {
		// TODO Auto-generated method stub
		eDao.UpdateEmp(e);
	}

	@Override
	public void DelById(int eid) {
		eDao.DeleteById(eid);

	}

}
