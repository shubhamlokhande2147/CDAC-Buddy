package com.demo.test;

import java.util.List;
import java.util.*;
public class TestVector {
	
	public static void main(String[] args)
	{
		List<Integer> v = new Vector<>(20,5);	
//		Vector v = new Vector();
		Vector<Integer> v1=new Vector<>(20,5);
	  System.out.println("Size  : "+ v1.size());
	  System.out.println("Capacity : "+ v1.capacity());

	  
	  v1.add(10); 
	  v1.add(20);
	  v1.add(30);
	  v1.add(40);
	  v1.add(50);
	  System.out.println("Size  : "+ v1.size());
	  System.out.println("Capacity : "+ v1.capacity());
	  System.out.println(v1);
	 
	 // System.out.println("add value using for loop");
	  for(int i=0;i<10;i++)
	  {
		  v1.add((i*i)+100);
	  }
	  System.out.println(v1);
	 
	  System.out.println("value prints by for loop");
	 for(int i=0;i<v1.size();i++)
	 {
	    	  System.out.println("Elements : " + v1.get(i) + " at index " + i);
	 }
	 
      System.out.println("value prints by forEach loop");
	  for(Integer j:v1)
	  {
	  System.out.println(j);
	  }
	  int sum=0;
	  v1.stream().forEach(System.out::println);
	  
	  System.out.println("remove val at index 1");
	  System.out.println(v1);
	  v1.remove(1);
	  System.out.println(v1);
	 
	  
	  System.out.println("remove particular num ,accept by user : ");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter num : "); 
	  int num = sc.nextInt();
	   
	  Iterator<Integer> itr = v1.iterator();
	  while(itr.hasNext())
	  {
		  int n=itr.next();
		  if(n==num)
		  {
			  itr.remove();
		  }

	  }
	  System.out.println("num is deleted");	  
 	  System.out.println(v1);

	//number deleted by accepting each value one by one
//	   Iterator<Integer>  itr = v1.iterator();
//	       do {
//	    	   System.out.println("enter num : "); 
//	    		  int num = sc.nextInt();
//	    		  
//	 		  int n=itr.next();
//	 		  if(n==num)
//	 		  {
//	 			  itr.remove();
//	 		  }
//	 		  System.out.println("num is deleted");	  
//	 	 	  System.out.println(v1);
//
//	       }while(itr.hasNext());
	       

	
	
	
	
	
	}

}
