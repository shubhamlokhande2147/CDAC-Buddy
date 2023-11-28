package com.demo.test;

import com.demo.beans.SinglyLinkedList;

public class tableHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList[] HashTable = new SinglyLinkedList[5];
		for (int i = 0; i < HashTable.length; i++) {
			HashTable[i] = new SinglyLinkedList();
		}
		int arr[] = { 25, 12, 14, 45, 1, 3, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			int pos = arr[i] % HashTable.length;
			HashTable[pos].addAtStart(arr[i]);

		}
		for (int i = 0; i < HashTable.length; i++) {
			HashTable[i].display();
		}
		int element = 9;
		int posn = element % HashTable.length;
		System.out.println("position is " + posn);
		if (HashTable[posn].search(element)) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}

	}

}
