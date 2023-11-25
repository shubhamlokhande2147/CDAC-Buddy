package com.demo.tests;

import com.demo.beans.SinglyLinkedList;

public class testSingliLList {

	public static void main(String[] args) {

		SinglyLinkedList ob = new SinglyLinkedList();

		ob.addAtEnd(12);
		ob.addAtEnd(20);
		ob.displaydata();

		ob.addByPosition(122, 1);
		ob.displaydata();

		ob.addByPosition(130, 2);
		ob.displaydata();

		ob.addByPosition(140, 3);
		ob.displaydata();

		ob.addByPosition(150, 1);
		ob.displaydata();

		ob.deleteByPosition(2);
		ob.displaydata();

		ob.deleteByValue(150);
		ob.displaydata();

		ob.addAtEnd(2);
		ob.displaydata();
	}

}
