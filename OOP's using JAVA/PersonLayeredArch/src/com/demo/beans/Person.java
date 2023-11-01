package com.demo.beans;

public class Person {
	private int pid;
	private String name;
	private String mobile;
	
	public Person() {
		super();
	}

	public Person(int pid, String name, String mobile) {
		super();
		this.pid = pid;
		this.name = name;
		this.mobile = mobile;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
	
	
}
