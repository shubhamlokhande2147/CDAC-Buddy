package com.demo.test;

import java.util.Scanner;

public class Insertion_Sort {

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
           
           
           // Insrtion sort
           
           
           for(int i=1 ; i<arr.length; i++)
           {
        	   int j = i-1;
        	   int key = arr[i];
        	   for( ; j >= 0  && arr[j] > key; j--)
        	   {
        		   arr[j+1] = arr[j];
        	   }
        	   arr[j+1] = key;
           }
           
       	System.out.print("\nAfter Array : ");
        for(int i=0; i < arr.length ; i++)
        {
    		System.out.print(arr[i] + " ");
        }
	
           
	}
	
}


