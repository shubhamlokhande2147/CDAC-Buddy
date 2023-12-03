package com.demo.sort_search;

import java.util.Arrays;
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

	private static void mergesort(int[] arr, int start, int end) {
        
		if(start < end)
		{
			int mid = (start + end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			
			merge(arr,start,end,mid);
			
		}
		
	}

	private static void merge(int[] arr, int start, int end, int mid) {
//          
//		int i,j,k;
//		int n1 = mid - start +1;
//		int n2 = end - mid;
//		
//		int[] leftarr = new int[n1];
//		int[] rightarr = new int[n2];
//		
//		for(i=0; i<n1; i++)
//		{
//			leftarr[i] = arr[start + i];
//		}
//		
//		for(j=0; i<n2; i++)
//		{
//			rightarr[i] = arr[mid + 1 +j];
//			
//			i=0;j=0;k=start;
//			
//			while(i<n1 && j<n2)
//			{
//				if(leftarr[i] < rightarr[j])
//				{
//					arr[k] = leftarr[i];
//					i++;
//					k++;
//				}
//				else
//				{
//					arr[k] = rightarr[j];
//					k++;
//					j++;
//				}
//			}
//			
//			while(i<n1)
//			{
//				arr[k] = leftarr[i];
//				i++;
//				k++;
//			}
//			while(j<n2)
//			{
//				arr[k] = leftarr[i];
//				i++;
//				k++;	
//			}		
//
//			System.out.println(Arrays.toString(arr));
//		}System.out.println(mid);
//	}
	
		int i, j, k;
		// length of left subarray
		int n1 = (mid - start + 1);
		// length of right subarray
		int n2 = end - mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		// copying into left subarray
		for (i = 0; i < n1; i++) {
			left[i] = arr[start + i];
		}
		// copying into right subarray
		for (j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}
		i = 0;
		j = 0;
		k = start;
		while (i < n1 && j < n2) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		System.out.println("start :" + start + " end : " + end + " mid :" + mid);
		System.out.println(Arrays.toString(arr));
	}

}
