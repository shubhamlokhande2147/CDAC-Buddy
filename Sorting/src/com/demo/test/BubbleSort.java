package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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

		// normal bubble sort
		// bubbleSort(arr);
		// System.out.println("After sorted array is ");
		// System.out.println(Arrays.toString(arr));

		// modified bubble sort
		modifiedBubbleSort(arr);
		System.out.println("After modified bubble sorted array is ");
		System.out.println(Arrays.toString(arr));

	}

	private static void modifiedBubbleSort(int[] arr) {

		int n = arr.length;
		boolean flag = false;

		for (int i = 0; i < n; i++) {
			flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1, arr);
					flag = true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if (!flag)
				break;

		}

	}

	public static void swap(int a, int b, int arr[]) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static void bubbleSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1, arr);
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
