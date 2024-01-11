package com.demo.model;

import javax.persistence.Embedded;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name="UserTab11")
public class MyUser {
      @Id
	  private int uid;
	  private String uname;
	 
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name="addrid")
	  private Address adr;
	
	  public MyUser() {
		super();
	}

	public MyUser(int uid, String uname, Address adr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.adr = adr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + "]";
	} 
	  
}
