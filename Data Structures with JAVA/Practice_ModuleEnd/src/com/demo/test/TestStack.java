package com.demo.test;

import com.demo.beans.Mystack;

public class TestStack {
 
	public static void main(String[] args) {
		
		Mystack ob = new Mystack(5);
		System.out.println(ob.isEmpty());
		System.out.println(ob.isFull());

		ob.print();
		ob.push(12);
		ob.push(2);
		ob.push(212);
		ob.push(132);
		ob.push(32);

		ob.print();

		ob.pop();
		ob.pop();
		ob.pop();
		
		ob.print();
		System.out.println(ob.isEmpty());
		System.out.println(ob.isFull());


	}
	
}