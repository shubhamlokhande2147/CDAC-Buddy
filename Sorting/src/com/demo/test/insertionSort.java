package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
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
		InsertionSort(arr);
		System.out.println("After sorted array is ");
		System.out.println(Arrays.toString(arr));

	}

	private static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			for (; j >= 0 && arr[j] > key; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void swap(int a, int b, int arr[]) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
