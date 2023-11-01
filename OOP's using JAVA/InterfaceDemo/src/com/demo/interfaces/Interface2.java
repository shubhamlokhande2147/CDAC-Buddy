package com.demo.interfaces;

public interface Interface2 {
	int f12();
	void f22();
	void f11();
	
	 default void f21() {
	    	System.out.println("in function f21 from i2");
	    }

}
