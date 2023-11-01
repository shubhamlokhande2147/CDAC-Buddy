package com.demo.interfaces;

public interface Interface1 {
	int i=400;
	void f11();
	default void f21()
	{
		System.out.println("In Display of f21 from i1");
	}
	public static void f31()
	{
		System.out.println("In Display of f31");
	}
	
}
