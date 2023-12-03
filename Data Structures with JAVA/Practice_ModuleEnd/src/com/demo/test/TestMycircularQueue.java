package com.demo.test;

import com.demo.beans.MycircularQueue;

public class TestMycircularQueue {

	public static void main(String[] args) {
		
		MycircularQueue ob = new MycircularQueue(5);
		System.out.println(ob.isEmpty()); 
		System.out.println(ob.isFull()); 
		
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		ob.enqueue(5);
		ob.enqueue(6);
		ob.print();
		
		ob.dequeue();
		ob.dequeue();

		System.out.println("----------------------------");
		ob.print();


		
	}
	
}
