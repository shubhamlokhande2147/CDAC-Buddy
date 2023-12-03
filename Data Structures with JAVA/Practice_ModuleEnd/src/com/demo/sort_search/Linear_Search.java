package com.demo.sort_search;

import java.util.Scanner;

public class Linear_Search {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array size : ");
        int n = sc.nextInt();
        

        int[] arr = new int[n];
        
        
        for(int i=0; i < arr.length ; i++)
        {
    		System.out.println("enter array size : ");
            arr[i] = sc.nextInt();
        }
        
    	System.out.print("Array : ");
        for(int i=0; i < arr.length ; i++)
        {
    		System.out.print(arr[i] + " ");
        }
        

		System.out.println("\n\nenter search element : ");
        int search = sc.nextInt();
        
        
        
        //linear search
        for(int i=0; i< arr.length ; i++)
        {
        	if(arr[i] == search)
        	{
        		System.out.println("\nno found at position : " + i);
        		break;
        	}
        	else
        	{
        		System.out.println("no not found");
        		break;
        	}
        	
        	
        }
        
		
		
		
	}

}
