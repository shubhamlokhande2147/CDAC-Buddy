package com.demo.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;

public class EmployeeDaoImpl implements EmployeeDao {

	static List<Employee> elist;
	static
	{
		elist=new ArrayList<>();
		elist.add(new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		elist.add(new Vendor(16,"Shubam","777","shu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),20,500));
 		elist.add(new Vendor(17,"om","888","shu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),20,500));

	
	}
	
	@Override
	public void save(Employee e) {
		elist.add(e);
	}

	@Override
	public List<Employee> showall() {
		return elist;
	}

	@Override
	public Employee findById(int id1)
	{
		int pos=elist.indexOf(new SalariedEmployee(id1));
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> sortName() {
		List<Employee> elst = new ArrayList<>();
		for(Employee e : elist)
		{
            elst.add(e);			
		}
		 elst.sort(null);
		return elst;
	}

	@Override
	public boolean remove(int id3) {
		// TODO Auto-generated method stub
		
		return elist.remove(new SalariedEmployee(id3));
	}

	@Override
	public boolean modifySal(int id5, double sal) {
		// TODO Auto-generated method stub
		Employee e=findById(id5);
		if(e!=null)
		{
			if(e instanceof SalariedEmployee)
			{
				((SalariedEmployee) e).setSal(sal);
			}
			else if(e instanceof ContractEmployee)
			{
				((ContractEmployee) e).setCharges(sal);
			}
			else if(e instanceof Vendor)
			{
				((Vendor) e).setAmount(sal);
				
			}
			return true;
		}
		return false;
	}

}
