package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class TestHashSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//Set<Integer> hs = new HashSet<>();
		HashSet<Integer> hs = new HashSet<>(5);
		
		System.out.println("Size : " + hs.size());
		hs.add(null);
		hs.add(10);
		hs.add(12);
		hs.add(50);
		hs.add(89);
		hs.add(20);
		hs.add(null); //only one add null value
		hs.add(null); 
		
		System.out.println(hs);
		System.out.println("Size : " + hs.size());

		System.out.println("isEmpty : " + hs.isEmpty());
		
		hs.add(50); //duplicate not allowed
		hs.add(89);
		hs.add(0);
		System.out.println(hs);
		System.out.println("Size : " + hs.size());
		 
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
		
		
		HashSet<Integer> hs1 = new HashSet<>();
        hs1 = (HashSet<Integer>) hs.clone();
        System.out.println("Second hashset : " + hs1);
        
		hs1.clear();
        System.out.println("Second hashset : " + hs1);

		System.out.println("enter num : ");
		int num = sc.nextInt();
		
		System.out.println(hs.equals(num));
		System.out.println(hs.hashCode());
		
		
		
	}
	
}
