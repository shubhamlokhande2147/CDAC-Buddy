package com.demo.test;
import java.util.Scanner;


public class searchingTest {

	public static int LinearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}

		}
		return -1;
	}
	public static int BinarySearch(int arr[],int target)
	{
		int left = 0; //first
		int right = arr.length-1; //last
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
		return -1;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter at " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Searching element");
		int target = sc.nextInt();
		
		do {
		System.out.println("\n1.Linear Search\n2.Binery Search\n3.Binarysearch using Recursion");
		System.out.println("\nenter your choice to search the element : ");
        int choice = sc.nextInt();
        
        switch(choice)
        {
          case 1 :
        	      int pos = LinearSearch(arr, target);
        	      if (pos != -1) {
        				System.out.println("element found at " + pos);
        			} else {
        				System.out.println("element not found..");
        			}
        	      break;
        
          case 2 : 
        	     int pos1 = BinarySearch(arr,target);
        	     if (pos1 != -1) {
        				System.out.println("element found at " + pos1);
        			} else 
        			{
        				System.out.println("element not found..");
        			}
        	     break;
        	     
          case 3 : 
	        	  int left=0;
	      		int right = arr.length;
	      		int pos2 = BinarySearchusingRecursion(arr,target,left,right);
	      		if (pos2 != -1) {
	      			System.out.println("element found at " + pos2);
	      		} else {
	      			System.out.println("element not found..");
	      		}
        	     break;
        	     
          case 4 : 
        	       System.out.println("you are exit now..");
        	       System.exit(0);
        	       break;
        }
		
		}while(true);
        
		//Linear Search
		//int pos = LinearSearch(arr, target);
		//Binery Search
		//int pos = BinarySearch(arr,target);
		
		
		//binarysearch using recursion
//		int left=0;
//		int right = arr.length;
//		int pos = BinarySearchusingRecursion(arr,target,left,right);
//		if (pos != -1) {
//			System.out.println("element found at " + pos);
//		} else {
//			System.out.println("element not found..");
//		}

		
	}

}
