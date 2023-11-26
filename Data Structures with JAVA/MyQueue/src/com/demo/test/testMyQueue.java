package com.demo.test;

import com.demo.beans.MyQueue;

public class testMyQueue {

	public static void main(String[] args) {

		MyQueue ob = new MyQueue(4);

		ob.dequeue();

		ob.enqueue(5);
		ob.enqueue(10);
		ob.enqueue(15);
		ob.enqueue(20);
		ob.enqueue(20);

		System.out.println("capacity : " + ob.capacity());
		System.out.println(ob);
		// ob.PrintData();

		ob.dequeue();
		ob.dequeue();
		System.out.println(ob);
		System.out.println("capacity : " + ob.capacity());
		// ob.PrintData();

		
		System.out.println("shubham");
		System.out.println("shubham");
		System.out.println("shubham");


	}

}
