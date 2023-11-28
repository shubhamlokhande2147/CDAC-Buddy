package com.demo.beans;


public class MySingliLinkedList {
  
	  public class Node  //create Node class 
	  {
		  public Employee data;
		  public Node next;
		  
		  public Node(Employee data) //create para constructor of Node
		  {
			  this.data = data;
		  }
	  }
	  
	  
	  private Node head;
	  
      public MySingliLinkedList() //create default constructor of MySingliLinkedList
      {
    	  head = null;
      }
      
      
      public void addAtEnd(Employee data)
      { 
    	  Node newnode = new Node(data);
    	   
    	   if(head == null)
    	   {
    		   head = newnode;
    	   }
    	   else
    	   {
    		   Node curr = head;
    		     while(curr.next != null)
    		     {
    		    	 curr = curr.next;
    		     }
    		       curr.next = newnode;
    	   }
      }
      
  	// delete the node by value
  	public boolean deleteByValue(Employee val) {
  		if (head == null) {
  			System.out.println("list is empty");
  		} else {
  			// delete from the begining
  			if (head.data == val) {
  				Node temp = head;
  				head = head.next;
  				// it will make the temp ready for garbage collection
  				temp.next = null;
  				return true;
  			} else {
  				Node prev = head;
  				Node current = prev.next;
  				while (current != null && current.data != val) {
  					prev = prev.next;
  					current = current.next;

  				}
  				if (current != null) {
  					prev.next = current.next;
  					current.next = null;
  					current = null;
  					return true;
  				} else {
  					System.out.println(val + " not found");
  					return false;
  				}
  			}
  		}
  		return false;
  	}

  	public Node Head() {
  		return head;
  	}

      
      public void displaydata() {
  		Node curr = head;
  		while (curr.next != null) {
  			System.out.println(curr.data);
  			curr = curr.next;
  		}
  		System.out.println(curr.data);

  	}
	  
}
