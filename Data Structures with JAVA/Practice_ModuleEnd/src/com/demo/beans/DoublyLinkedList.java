package com.demo.beans;

public class DoublyLinkedList {

	
	class Node
	{
		private int data;
	
		private Node prev;
		private Node next;
		
		
		public Node(int data)
		{
			super();
			this.data = data;
			prev = null;
			next = null;
		}
	}
	
	Node head;
	
	public DoublyLinkedList()
	{
		super();
		head = null;
	}
	
	public void addAtLast(int data)
	{
		 Node newnode = new Node(data);
		 
		 if(head == null)
		 {
			 head = newnode;
		 }
		 else {
			 Node temp = head;

			 while(temp.next != null)
			 {
				 temp =temp.next;
			 }
			 temp.next = newnode;
			 newnode.prev = temp;	 
		 }
	}
	
	public void addAtFirst(int data)
	{
		 Node newnode = new Node(data);
		 
		 if(head == null)
		 {
			 head = newnode;
		 }
		 else {
			 
			 newnode.next = head;
			 head = newnode; 
		 }
	}
	
	
	public void addAtPos(int pos,int data)
	{
	   Node newnode = new Node(data);
		 
		 if(head == null)
		 {  
			 if(pos == 1) 
			 {
			  head = newnode;
			 }
		 }
		 else
		 {
			 
		 }
	}
	
	public void print()
	{
		 Node temp = head;
		 
		 while(temp!= null)
		 {
			 System.out.print(temp.data);
			 temp =temp.next;
			   System.out.print("->");
	     }		   
		   System.out.print("null");
		   System.out.println("");
	
	}
	
}
