package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deptab") // set table name
public class Department {

	@Id // set primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generated primary key
	private int DId;
	@Column(name = "DepartmentName", nullable = false, unique = true)
	private String dName;

	public Department() {
		super();
	}

	public Department(String dName) {
		super();
		// DId = dId;
		this.dName = dName;
	}

	public int getDId() {
		return DId;
	}

	public void setDId(int dId) {
		DId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [DId=" + DId + ", dName=" + dName + "]";
	}

}
