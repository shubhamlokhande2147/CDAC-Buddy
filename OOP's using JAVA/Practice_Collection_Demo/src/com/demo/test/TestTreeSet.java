package com.demo.test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.demo.beans.Student;

public class TestTreeSet  {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		   Scanner sc =new Scanner(System.in);
	   		
	   		//Set<Integer> hs = new TreeSet<>();
	    	   TreeSet<Integer> hs = new TreeSet<>();
	   		
	   		System.out.println("Size : " + hs.size());
	   		//hs.add(null);  //NullPointerException
	   		hs.add(10);
	   		hs.add(12);
	   		hs.add(50);
	   		hs.add(89);
	   		hs.add(20);
	   		//hs.add(null); //only one add null value
	   		//hs.add(null); 
	   		
	   		System.out.println(hs);
	   		System.out.println("Size : " + hs.size());

	   		
	   		hs.add(50); //duplicate not allowed
	   		hs.add(1);
	   		hs.add(22);
	   		System.out.println(hs);
	   		System.out.println("Size : " + hs.size());
	   		
	   		System.out.println("isEmpty : " + hs.isEmpty());
	   		 
	   		//disp using iterator
	   	    System.out.println("disp using iterator : ");    
	   		  Iterator<Integer> itr=hs.iterator();    
	   	        while(itr.hasNext())
	   	        {    
	   	           System.out.println(itr.next());    
	   	        }
	   			
	   	    //disp using forEach
	   	    System.out.println("disp using iterator : ");    
	   		for(Integer e : hs)
	   		{
	   	           System.out.println(e);    	
	   		}
	   		
	   		//check 10 is present or not
	   		System.out.println("1o is present : " + hs.contains(10));
	   		
	   		//check 100 is present or not
	   		System.out.println("1o is present : " + hs.contains(100));
	   		
	   		
	   		TreeSet<Integer> hs1 = new TreeSet<>();
	           hs1 = (TreeSet<Integer>) hs.clone();
	           System.out.println("Second hashset : " + hs1);
	           
	   		hs1.clear();
	           System.out.println("Second hashset : " + hs1);

	   		System.out.println("enter num : ");
	   		int num = sc.nextInt();
	   		
	   		System.out.println(hs.equals(num));
	   		System.out.println(hs.hashCode());
	   		
	   		
	   		
	   		//for equals and hashcode method - 
	   		
	           Student s1 = new Student(1,"shubham");	
	           Student s2 = new Student(1,"shubham");
	           Student s3 = new Student(2,"om");	


	           System.out.println("s1 hashset : " + s1 + "s1 hashcode : " + s1.hashCode());
	           System.out.println("s2 hashset : " + s2 + "s2 hashcode : " + s2.hashCode());
	           System.out.println("s3 hashset : " + s3 + "s3 hashcode : " + s3.hashCode());

	           
	   		System.out.println("checking equality : " + s1.equals(s2));
	   		System.out.println("checking equality : " + s2.equals(s3));
	   		
	   		
	   		if(s1.equals(s2))
	   		{
	   			System.out.println("both are same");
	   		}
	   		else 
	   		{
	   			System.out.println("both are not same");
	   		}
		
	   		//compareTo method
	   		System.out.println("compareTo method : " + s1.compareTo(s2));
	   		System.out.println("compareTo method : " + s2.compareTo(s3));
	   		System.out.println("compareTo method : " + s1.compareTo(s3));

	   		
	}

}
