package com.demo.sort_search;

import java.util.Scanner;

public class Selection_Sort {

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
           
       	System.out.print("\nBefore Array : ");
           for(int i=0; i < arr.length ; i++)
           {
       		System.out.print(arr[i] + " ");
           }
           
           
           // selection sort
           
           for(int i=0; i < arr.length-1; i++)
           {
    		   int min = i;

        	   for(int j= i +1 ; j < arr.length; j++)
        	   {
        		   
        		   if(arr[j] < arr[min])
        		   {
        			   min = j;
        		   }
        	   }
        	   
        	   //put smallest no. to i^th location
        	   int temp = arr[i];
			   arr[i] = arr[min];
			   arr[min] = temp;
        	   
           }
           
          	System.out.print("\nAfter Array : ");
            for(int i=0; i < arr.length ; i++)
            {
        		System.out.print(arr[i] + " ");
            }
		
	}
	
}
