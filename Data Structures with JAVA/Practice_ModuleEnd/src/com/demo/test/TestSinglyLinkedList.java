package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		
		SinglyLinkedList ob = new SinglyLinkedList();
		System.out.println(ob.isEmpty()); 

		
		ob.addAtFirst(1);
		ob.print();

		ob.addAtFirst(2);
		ob.print();

		ob.addAtFirst(3);
		ob.print();

		ob.addAtFirst(4);
		ob.addAtFirst(5);
		ob.print();

		ob.atAtLast(6);
		ob.atAtLast(7);
		ob.atAtLast(8);
		ob.atAtLast(9);
		ob.print();

		

		ob.atByPos(2, 10);
		ob.print();
		ob.atByPos(4, 11);
		ob.print();
		ob.atByPos(11, 11);
		ob.print();

		
		ob.deleteByPos(11);
		ob.print();
		ob.deleteByPos(2);
		ob.print();

		
		ob.deletestart();
		ob.print();
		ob.deletestart();
		ob.print();
		
		ob.deleteAtEnd();
		ob.print();
		ob.deleteAtEnd();
		ob.print();
	}
}
