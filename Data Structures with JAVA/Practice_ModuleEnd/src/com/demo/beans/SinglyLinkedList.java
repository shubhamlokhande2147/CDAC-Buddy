package com.demo.beans;

import com.demo.beans.SinglyLinkedList.Node;

public class SinglyLinkedList {

	class Node
	{
		private int data;
		private Node next;
		
	    Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public SinglyLinkedList() 
	{
		head = null;
	}
	
	
      public boolean isEmpty()
      {
    	  if(head==null)
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      }
      
      public void addAtFirst(int data)
      {
  		Node newnode = new Node(data);
  	
  		newnode.next = head;
  				head = newnode;
  		} 
    	
      
      public void atAtLast(int data)
      {  		
    	  Node newnode = new Node(data);
          if(head ==null)
          {
        	  head = newnode;
          }
          else
          {  Node curr = head;
          
               while(curr.next !=null)
               {
            	   curr = curr.next;
               }
               
               curr.next = newnode;
          }
      }
      
      public void atByPos(int pos,int data)
      {
 
    	  Node newnode = new Node(data);
  		if (head == null && pos != 1) {
  			System.out.println("list is empty");
  		}
  		if (pos == 1) {
  			if (head == null) {
  				head = newnode;
  			} else {
  				newnode.next = head;
  				head = newnode;
  			}
  		} else {
  			Node prev = head;
  			for (int i = 1; i <pos - 1; i++) {
  				prev = prev.next;
  			}
  				newnode.next = prev.next;
  				prev.next = newnode;
  	
  		}
    	  }
    	  
      public void deleteByPos(int pos)
      {
    	  Node temp = head;
    	  for(int i=1; i< pos-1; i++)
    	  {
    		  temp = temp.next;
    	  }
    	  temp.next = temp.next.next; 
      }
    	  

      public void deletestart()
      {
    	  head = head.next;
      }
      
      public void deleteAtEnd()
      {
    	  Node temp = head;
    	  while(temp.next.next != null)
    	  {
    		  temp = temp.next;
    	  }
    	  temp.next = null;
      }
      
      
      public void print()
      {
    	  Node temp=head;
    	  while(temp != null)
    	  {
    		  System.out.print(temp.data);
    		  temp = temp.next;
    		  System.out.print("->");

    	  }  System.out.print("null");
    	     System.out.println();

      }
      
    
}


