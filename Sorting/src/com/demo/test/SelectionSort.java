package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array element");
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element at " + (i + 1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Before sort array is ");
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("After sorted array is ");
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int a, int b, int arr[]) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static void SelectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(i, min, arr);
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
		}
	}

}
