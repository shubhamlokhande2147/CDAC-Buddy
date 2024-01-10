package com.demo.model;

public class MyUser {

	private int Id;
	private String Name;

	public MyUser() {
		super();
	}

	public MyUser(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "MyUser [Id=" + Id + ", Name=" + Name + "]";
	}

}
