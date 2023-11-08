package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Friend {

	private int fid;
	private String fname;
	private String lastname;
	private String[] hobbies;
	private String mobile;
	private String email;
	private LocalDate l;
	private String address;

	public Friend() {
		super();
	}

	public Friend(int fid, String fname, String lastname, String[] hobbies, String mobile, String email, LocalDate l,
			String address) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.mobile = mobile;
		this.email = email;
		this.l = l;
		this.address = address;
	}

	public Friend(int fid) {
		this.fid = fid;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getL() {
		return l;
	}

	public void setL(LocalDate l) {
		this.l = l;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", fname=" + fname + ", lastname=" + lastname + ", hobbies="
				+ Arrays.toString(hobbies) + ", mobile=" + mobile + ", email=" + email + ", l=" + l + ", address="
				+ address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fid);
	}

	@Override
	public boolean equals(Object obj) {

		Friend other = (Friend) obj;
		return this.fid == other.fid;
	}

}
