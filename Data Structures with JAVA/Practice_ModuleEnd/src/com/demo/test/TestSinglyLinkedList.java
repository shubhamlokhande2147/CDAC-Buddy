package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedList ob = new SinglyLinkedList();
		System.out.println(ob.isEmpty()); 

		ob.addAtFirst(10);
		//ob.print();
		ob.addAtFirst(20);
		ob.print();
		
		
		ob.atAtLast(30);
		ob.print();
		
		ob.atAtLast(30);
		ob.print();
		ob.atAtLast(30);
		ob.print();


	}
}
