package com.demo.beans;

import com.demo.beans.SinglyLinkedList.Node;

public class CircularSinglyLinkedList {

	
	class Node
	{
		private int data;
		private Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
		
	}
	
	private Node head;
	public CircularSinglyLinkedList()
	{
		head = null;
	}
	
	
//	public void addByPos(int pos,int data)
//	{
//		Node newnode = new Node(data);
//		
//		
//		if(head==null)
//		{
//			head= newnode;
//			newnode.next = head;
//		}
//		else {
//			if(pos==1)
//			{
//				Node temp = head;
//				//head = newnode;
//				while(temp.next != head)
//				{
//					temp = temp.next;
//				}
//				newnode.next = head;
//				head = newnode;
//				temp.next =head;
//			}
//		else {
//		Node temp=head;
//		
//		for(int i = 1; temp.next != head && i != pos - 1; i++)
//		{
//			temp=temp.next;
//		}
//		  newnode.next = temp.next;
//		  temp.next = newnode;
//		}
//		}	
//	}


	public void addfirst(int data)
	{
		Node newnode= new Node(data);

		if(head == null)
		{
			head = newnode;
			newnode.next = head;
			
		}
		Node temp=head;
		while(temp.next !=head)
		{
			temp = temp.next;
		}
		newnode.next = head;
		head = newnode;
		temp.next = newnode;
	}
	
	public void addLast(int data)
	{
		Node newnode= new Node(data);
         
		if(head == null)
		{
			addfirst(data);
		}
		else
		{
			Node temp = head;
			while(temp.next != head)
			{
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = head;
		}
		
	}
	
	public void addAtPos(int pos,int data)
	{
		Node newnode= new Node(data);

		if(head == null)
		{
			if(pos==1)
			{
				newnode.next = head;
				head = newnode;
				
			}
		}
		Node temp = head;
		for(int i=1; temp.next != head && i<pos-1; i++)
		{
			temp = temp.next;
		}
		
		newnode.next = temp.next;
		temp.next = newnode;
		

	}
	
	public void deleteAtLast()
	{
	   Node temp=head;
	   
	   while(temp.next.next  != head)
	   {
		   temp = temp.next ;
	   }
	     temp.next = head;
	}
	
	///////////////
	
	public void deleteAtFirst()
	{
		Node temp = head;
	while(temp.next !=head)
	{
		temp = temp.next;
	}
		temp.next = head.next;
		head= head.next;
	}
	/////////////
	
	public void deleteByPos(int pos)
	{
		if(pos == 1) {
			deleteAtFirst();
		}
		Node temp = head;
		
		for(int i=1; temp.next != head && i<pos-1; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	
	public void print()
	{
		  Node temp=head;
    	  while(temp.next  != head)
    	  {
    		  System.out.print(temp.data);
    		  temp = temp.next;
    		  System.out.print("->");

    	  } 		System.out.println(temp.data + "->head");
    	     System.out.println();
	}
	
	
}
