package com.demo.beans;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1,Interface2 {



	@Override
	public void f21() {
		// TODO Auto-generated method stub
		Interface1.super.f21();
		Interface2.super.f21();
		System.out.println("Extra In display of f21");
	}

	@Override
	public int f12() {
		// TODO Auto-generated method stub
		System.out.println("In display of f12");
		return 0;
	}

	@Override
	public void f22() {
		// TODO Auto-generated method stub
		System.out.println("In Display of f22");
	}

	@Override
	public void f11() {
		// TODO Auto-generated method stub
		System.out.println("In Display of f11");
		
	}
	
}
