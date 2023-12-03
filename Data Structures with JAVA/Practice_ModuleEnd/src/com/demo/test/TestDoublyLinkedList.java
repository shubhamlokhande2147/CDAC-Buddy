package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		
		DoublyLinkedList ob = new DoublyLinkedList();
		
		ob.addAtLast(10);
		ob.print();
		ob.addAtLast(20);
		ob.print();
		ob.addAtLast(30);
		ob.print();

		
		ob.addAtFirst(5);
		ob.print();
		ob.addAtFirst(7);
		ob.print();
		ob.addAtFirst(9);
		ob.print();


	}
	
}
