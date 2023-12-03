package com.demo.test;

import com.demo.beans.CircularSinglyLinkedList;

public class TestCircularSinglyLinkedList {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList ob = new CircularSinglyLinkedList();

		ob.addLast(5);
		ob.print();
	
		ob.addfirst(10);
		ob.print();
		

		ob.addfirst(20);
		ob.print();
	   
		ob.addLast(30);
		ob.print();
	
		
		ob.addAtPos(2, 12);
		ob.print();
		
		ob.addAtPos(2, 120);
		ob.print();
		
		ob.addAtPos(4, 120);
		ob.print();
		
		ob.addAtPos(6, 14);
		ob.print();
		
		ob.addAtPos(9, 140);
		ob.print();
		
		ob.addfirst(30);
		ob.print();
		
		ob.deleteByPos(5);
		ob.print();
		
		
		ob.deleteAtFirst();
		ob.print();
		ob.deleteAtFirst();
		ob.print();
		
		ob.deleteAtLast();
		ob.print();
		
		
		ob.deleteByPos(3);
		ob.print();

		ob.deleteByPos(1);
		ob.print();	
		
		ob.deleteByPos(1);
		ob.print();
		


	}
	
}
