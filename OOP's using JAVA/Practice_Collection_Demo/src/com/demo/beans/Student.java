package com.demo.beans;

public class Student implements Comparable<Student>
  {
	
	  private Integer id;
	  private String name;
	  
	public Student()
	{
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		return this.id== ((Student)obj).id;

	}

	@Override
	public int compareTo(Student p)
	{
		System.out.println("In Person compareTo method"+this.id+"--->"+p.id);
	    return this.id.compareTo(p.id);
	}
	
	

	
	
}
