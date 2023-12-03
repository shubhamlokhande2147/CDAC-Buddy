package com.demo.test;

import com.demo.beans.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		
		MyQueue ob = new MyQueue(5);
		
		System.out.println(ob.isEmpty());
		System.out.println(ob.isFull());
		
		ob.enqueue(12);
		ob.enqueue(23);
		ob.print();
		
		ob.dequeue();
		ob.print();
		//System.out.println(ob);
	}
	
}
