package com.demo.beans;

public class HashsSinglyList {
	
	class Node{
		private int data;
		private Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head;
	
     public HashsSinglyList()	
     {
       head = null;
     }

     
     public void addAtStart(int data)
     {
    	 Node newnode = new Node(data);
    	 if(head == null)
    	 {
    		 head = newnode;
    	 }
    	 else
    	 {
    		 newnode.next = head;
    		 head = newnode;
    	 }
     }
     
     public void print() {
    	 Node temp = head;
    	 while(temp != null)
    	 {
    		 System.out.print(temp.data + "," );
    		 temp = temp.next;
    
    	 }
    	 System.out.println();
     }
	
}
