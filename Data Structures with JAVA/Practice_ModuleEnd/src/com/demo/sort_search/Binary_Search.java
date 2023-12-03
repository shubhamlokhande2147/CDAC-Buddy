package com.demo.test;

import java.util.Scanner;

public class Binary_Search {

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
           
           
           //binary search

               BinarySearch(arr,search);  
               
               int first = 0;
               int last = arr.length-1;
               int status = BinarySearchusingRecursion(arr,search,first,last);       

               if(status != -1)
   		        {
   	     		   System.out.println("\nnumber  found " + status);
   		        }
   		        else
   		        {
    	     	   System.out.println("\nno not found");
   		        }
   		
   	}


	
	public static int BinarySearchusingRecursion(int[] arr,int target,int left,int right)
	{
		int mid = (left+right)/2;
		
		if(left > right)
			return -1;
		else
		{
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
			  return BinarySearchusingRecursion(arr,target,mid + 1,right);
			}
			else
			{
			  return BinarySearchusingRecursion(arr,target,left,mid - 1);	
			}
		}
			
	}

	private static void BinarySearch(int[] arr, int search) {
        
        
        int first = 0;
        int last = arr.length-1;
        
       
     	   
     	   
            while(first <= last) 
            {
         	   int mid = (first + last) / 2;

         	   
     	   if(arr[mid] == search)
     	   {
     		   System.out.println("\nno found at position : " + mid);
     		   break;
     	   }
     	   else if(arr[mid] < search)
     	   {
               first = mid + 1;
     	   }
     	   else
     	   {
     		   last = mid - 1;
     	   }
            }
         		
	}
	
	
	
	

	
}
