package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {

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
		HeapSort(arr, n);
		System.out.println("After sort array is ");
		System.out.println(Arrays.toString(arr));
	}

	private static void HeapSort(int[] arr, int n) {

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		System.out.println("first heapify " + Arrays.toString(arr));

		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
			System.out.println(Arrays.toString(arr));

		}

	}

	private static void heapify(int[] arr, int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < n && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			heapify(arr, n, largest);
		}
	}

}
