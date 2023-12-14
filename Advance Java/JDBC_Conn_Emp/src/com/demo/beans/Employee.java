package com.demo.beans;

public class Employee {

	private int eid;
	private String ename;
	private String dept;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String dept, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
