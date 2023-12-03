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
	
	
	public void addByPos(int pos,int data)
	{
		Node newnode = new Node(data);
		
		
		if(head==null)
		{
			head= newnode;
			newnode.next = head;
		}
		else {
			if(pos==1)
			{
				Node temp = head;
				//head = newnode;
				while(temp.next != head)
				{
					temp = temp.next;
				}
				newnode.next = head;
				head = newnode;
				temp.next =head;
			}
		else {
		Node temp=head;
		
		for(int i = 1; temp.next != head && i != pos - 1; i++)
		{
			temp=temp.next;
		}
		  newnode.next = temp.next;
		  temp.next = newnode;
		}
		}	
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
