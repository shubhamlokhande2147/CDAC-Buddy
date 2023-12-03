package com.demo.test;

import java.util.Scanner;

public class Merge_Sort {

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
           
           
           // merge sort
           
           
              mergesort(arr,0,arr.length - 1); //pass here array,first and last index
           
           
           
       	System.out.print("\nAfter Array : ");
        for(int i=0; i < arr.length ; i++)
        {
    		System.out.print(arr[i] + " ");
        }
	
           
		
	}
	
}
