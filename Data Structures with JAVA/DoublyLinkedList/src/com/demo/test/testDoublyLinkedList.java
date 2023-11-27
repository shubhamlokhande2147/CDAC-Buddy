package com.demo.test;

import com.demo.beans.DoublyLinkedList;

public class testDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);
		list.addAtEnd(40);
		list.printData();

		list.addAtPoisition(15, 2);
		list.printData();

		list.addbeforeKey(25, 30);
		list.printData();

		list.addAfterKey(35, 30);
		list.printData();

		list.addAfterKey(35, 3);
		list.printData();

		list.addbeforeKey(25, 3);
		list.printData();

		list.deleteByKey(30);
		list.printData();

		list.deleteByKey(15);
		list.printData();

		list.deleteByPosition(1);
		list.printData();

		list.deleteByPosition(2);
		list.printData();
		list.deleteByPosition(10);
		list.printData();
	}

}
