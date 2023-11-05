package com.demo.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//List<Integer> l1=new ArrayList<>(5);
		ArrayList<Integer> l1=new ArrayList<>(5);

		
		l1.add(10);
		l1.add(12);
		l1.add(50);
		l1.add(89);
		l1.add(20);
		
		System.out.println("Size : "+l1.size());
		System.out.println("index 0 : "+l1.get(0));
		System.out.println("Display arrarlist : "+l1);
		
		System.out.println("Display arrarlist using iterator : ");
	    Iterator<Integer> lt = l1.listIterator();
	    while(lt.hasNext())
	    {
	    	System.out.println(lt.next());
	    }
	    
	    l1.add(10);
		l1.add(12);
		l1.add(50);
		l1.add(20);
		l1.add(14);
		System.out.println("Display arrarlist : "+l1);
		System.out.println("Size : "+l1.size());
		
		l1.remove(0);
		System.out.println("Display arrarlist : "+l1);
		System.out.println("Size : "+l1.size());
		
		System.out.println(l1.contains(10));

		System.out.println("Display arrarlist using foreach loop : ");
		for(Integer e : l1)
		{
			System.out.println(e);
		}
		
		System.out.println(l1.isEmpty());
		System.out.println(l1.lastIndexOf(l1));
		
		
		ArrayList<Integer> l2 = new ArrayList<>();
		l2=(ArrayList<Integer>) l1.clone();
		System.out.println("Second Arraylist : "+ l2);
		l2.clear();
		System.out.println("Second Arraylist : "+ l2);
		
		System.out.println("enter the no : ");
		int num=sc.nextInt();
		l1.add(num);
		System.out.println("num is added : " + l1);

		System.out.println("equals method : " + l1.equals(l2));
		

	}

}
