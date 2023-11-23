package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

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
		int start = 0;
		int end = arr.length - 1;
		MergeSort(arr, start, end);
		System.out.println("After sort array is ");
		System.out.println(Arrays.toString(arr));
	}

	private static void MergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			MergeSort(arr, start, mid); // left tree -- using recursion we divide into smaller subarray
			MergeSort(arr, mid + 1, end); // right tree
			Merge(arr, start, end, mid); // it will merge all subarray;
		}

	}

	private static void Merge(int[] arr, int start, int end, int mid) {
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
