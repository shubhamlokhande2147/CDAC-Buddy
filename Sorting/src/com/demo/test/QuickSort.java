package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

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

		QuickSort(arr, 0, arr.length - 1);
		System.out.println("After sort array is ");
		System.out.println(Arrays.toString(arr));

	}

	private static void QuickSort(int[] arr, int start, int end) {
		if (start < end) {
			int p = partion(arr, start, end);
			QuickSort(arr, start, p - 1);
			QuickSort(arr, p + 1, end);
		}

	}

	private static int partion(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		int pivot = first;
		int i = first;
		int j = last;
		while (i < j) {
			while (i < last && arr[i] <= arr[pivot]) {
				i++;
			}
			while (j > pivot && arr[j] >= arr[pivot]) {
				j--;
			}
			if (i < j) {
				swap(i, j, arr);
			}
		}
		swap(j, pivot, arr);
		return j;
	}

	private static void swap(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
