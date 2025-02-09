package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddressTab11")
public class Address {
	@Id
	private int addrid;
	private String street;
	private String city;

	
	public Address() {
		super();
	}


	public Address(int addrid, String street, String city) {
		super();
		this.addrid = addrid;
		this.street = street;
		this.city = city;
	}


	public int getAddrid() {
		return addrid;
	}


	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", street=" + street + ", city=" + city + "]";
	}
	
	
	

}
