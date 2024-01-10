package com.demo.model;

public class Employee {
	private int eid;
	private String ename;
	private double sal;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double d) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = d;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", toString()=" + super.toString() + "]";
	}
}
