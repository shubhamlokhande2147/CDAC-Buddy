package com.demo.test;

import com.demo.beans.CircularSinglyLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList ob = new CircularSinglyLinkedList();
		ob.addByPos(1, 10);
		ob.print();
		
		ob.addByPos(2, 20);
		ob.print();
		ob.addByPos(3, 30);
		ob.print();
		
	}
	
}
