package com.demo.sort_search;

import java.util.Scanner;

public class Bubble_Sort {
	
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
           
           
           //bubble sort
           
           for(int i=0; i < arr.length ; i++)
           {
        	   for(int j = i+1; j < arr.length; j++)
        	   {
        		   if(arr[j] < arr[i])
        		   {
        			   int temp = arr[i];
        			   arr[i] = arr[j];
        			   arr[j] = temp;
        		   }
        	   }
           }
           
          	System.out.print("\nAfter Array : ");
            for(int i=0; i < arr.length ; i++)
            {
        		System.out.print(arr[i] + " ");
            }
		
	}

}
