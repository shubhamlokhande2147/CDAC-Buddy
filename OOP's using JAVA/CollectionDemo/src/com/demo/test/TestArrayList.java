package com.demo.test;

import java.util.List;
import java.util.*;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		
		//add val in arraylist using while loop
		System.out.println("size of arraylist before adding");
		System.out.println(l1.size());
		
		System.out.println("enter elements in arraylist");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		while(choice!=0)
		{
			System.out.println("Enter Element: ");
			int ele=sc.nextInt();
			l1.add(ele);
			choice--;
		}
		
		System.out.println(l1);
		System.out.println("size after add val : " + l1.size());
		
		//remove all val
		l1.clear();
		System.out.println("ramove all val " + l1);

		
	}

}
