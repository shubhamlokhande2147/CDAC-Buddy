package com.demo.beans;


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
//    	  Node newnode = new Node(data);
//    	  if(head == null)
//    	  {
//    		  head = newnode;
//    		  //newnode.next= head;
//    	  }
//    	  else
//    	  {
//    		  Node temp =head;
//    		  while(temp !=null)
//    		  {
//    			  temp = temp.next;
//    		  }
//    		  newnode.next = head;
//    		  head = newnode;
//    	  }
  		Node newnode = new Node(data);
  	 if (head == null) {
  				head = newnode;
  			} else {
  				newnode.next = head;
  				head = newnode;
  			}
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
      
      
      public void print()
      {
    	  Node temp=head;
    	  while(temp.next != null)
    	  {
    		  System.out.print(temp.data);
    		  temp = temp.next;
    		  System.out.print("->");

    	  }  System.out.print("null");
    	     System.out.println();

      }
      
    
}

