package com.demo.test;

import com.demo.beans.MyCircularQueue;

public class testMyCircularQueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue ob = new MyCircularQueue(5);
		ob.dequeue();

		ob.enqueue(5);
		ob.enqueue(10);
		ob.enqueue(15);
		ob.enqueue(20);
		ob.enqueue(10);
		ob.enqueue(10);
		System.out.println("capacity : " + ob.capacity());
		// System.out.println(ob);
		ob.PrintData();

		// ob.enqueue(200);

		ob.dequeue();
		ob.dequeue();
//		// System.out.println(ob);
		System.out.println("capacity : " + ob.capacity());
		ob.PrintData();
//		
//		
		ob.enqueue(220);
		System.out.println("capacity : " + ob.capacity());
		ob.PrintData();

	}

}
