package com.demo.dao;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;
//import com.demo.comparator.*;
public class EmployeeDaoImpl implements EmployeeDao {

//	static Set<Employee> hs;
//	static
//	{
//		hs=new HashSet<>();
//		hs.add(new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),5000,345));
// 		hs.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","ase",LocalDate.of(2002, 10,30),600,377));
// 		hs.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
// 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","bod",LocalDate.of(2000, 12,30),40,7000));
// 		hs.add(new Vendor(16,"Shubam","777","shu@gmail.com","hr","hrd",LocalDate.of(2000, 12,30),20,400));
// 		hs.add(new Vendor(17,"om","888","shu@gmail.com","hr","as",LocalDate.of(2000, 12,30),20,500));
//
//	
//	}
	
	static Map<Integer,Employee> hm;
	static 
	{
		hm=new HashMap<>();
		hm.put(12,new SalariedEmployee(12,"Harsh","4444","a@gmail.com","hr","associate",LocalDate.of(2002,12,30),5000,345));
		hm.put(13,new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","ase",LocalDate.of(2002, 10,30),600,377));
 		hm.put(14,new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hm.put(15,new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","bod",LocalDate.of(2000, 12,30),40,7000));
 		hm.put(16,new Vendor(16,"Shubam","777","shu@gmail.com","hr","hrd",LocalDate.of(2000, 12,30),20,400));
 		hm.put(17,new Vendor(17,"om","888","shu@gmail.com","hr","as",LocalDate.of(2000, 12,30),20,500));
	}
	
	
	
	@Override
	public void save(Employee e) {
		if(!hm.containsKey(e.getPid()))
		{
			hm.put(e.getPid(), e);
		}
	}

	@Override
	public List<Employee> showall() {
		return (List<Employee>)hm.values();
	}

	@Override
	public Employee findById(int id1)
	{
		//int pos=elist.indexOf(new SalariedEmployee(id1));
		for(Employee e : hm.get(e))
		{
			if(e.getPid()==id1)
			{
				return e;
			}
		}
		
		return null;
	}

	@Override
	public Set<Employee> sortName() {
		TreeSet<Employee> h1 = new TreeSet<>();
		for(Employee e : hs)
		{
            h1.add(e);			
		}
		
		return h1;
	}

	@Override
	public boolean remove(int id3) {
		Employee e=hm.remove(id3);
		if(e!=null)
		{
			return true;
		}
		return false;
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

	@Override
	public Set<Employee> sortSalary() {
		// TODO Auto-generated method stub

		Comparator<Employee> mysal=(o1,o2)->{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmployee)
			{
				sal1=((SalariedEmployee) o1).getSal();
			}
			else if(o1 instanceof ContractEmployee)
			{
				sal1=((ContractEmployee) o1).getCharges();
			}
			else 
			{
				sal1=((Vendor) o1).getAmount();
			}
			
			if(o2 instanceof SalariedEmployee)
			{
				sal2=((SalariedEmployee) o2).getSal();
			}
			else if(o2 instanceof ContractEmployee)
			{
				sal2=((ContractEmployee) o2).getCharges();
			}
			else
			{
				sal2=((Vendor) o2).getAmount();
			}
			return (int)(sal1-sal2);
		};
		TreeSet<Employee> temp=new TreeSet<Employee>(mysal);
		for(Employee e:hs)
		{
			temp.add(e);
		}
		return temp;
	}

	@Override
	public Set<Employee> sortDesg()
	{

		Comparator<Employee> mydesg=(o1,o2)->
		{
			return o1.getDesignation().compareTo(o2.getDesignation());
		};
        TreeSet<Employee> temp1 = new TreeSet<>(mydesg);
        for(Employee e : hs)
        {
        	temp1.add(e);
        }	
	    return temp1;
	}


	@Override
	public Employee[] getNEmp(int nn) {

		Set<Employee> h4=sortSalary();
		Employee earr[]=new Employee[nn];
		int cnt=0;
		for(Employee e:h4)
		{
			earr[cnt]=e;
			cnt++;
			if(cnt==nn)
			{
				break;
			}
			
		}
	 return earr;
	}

	@Override
	public TreeMap<Integer, Employee> getSortedByID() {
		// TODO Auto-generated method stub
		TreeMap<Integer,Employee> tm = new TreeMap<>();
		Set<Integer> h1=hm.keySet();
		for(Integer eno:h1)
		{
			tm.put(eno,hm.get(eno));
		}
		return tm;
	}
	

}
