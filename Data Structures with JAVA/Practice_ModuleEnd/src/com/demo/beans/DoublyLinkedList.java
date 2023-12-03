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
			 Node temp = head;
			 for(int i = 1; i < pos -1; i++)
			 {
				 temp = temp.next;
			 }
			 
			 newnode.next = temp.next;
			 temp.next = newnode;
			 newnode.prev = temp;
		 }
	}
	
	public void deleteAtLast()
	{
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else {
		     Node temp = head;
		     while(temp.next.next != null)
		     {
		    	 temp = temp.next;
		     }
		     temp.next = null;
		}
	}
	
	public void deleteAtFirst()
	{
		if(head == null)
		{
			System.out.println("list is empty");
		}
		else
		{
			head = head.next;
		}	
	}
	
	public void deleteByPos(int pos)
	{

		if(head == null)
		{
			System.out.println("list is empty");
		}
		else
		{
		   Node temp = head;
		   for(int i = 1; i < pos-1 ;i++)
		   {
			   temp = temp.next;
		   }
		     //System.out.println(temp.next.next.data);
		   temp.next = temp.next.next;
		   temp.next.next.prev = temp;
		   
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
