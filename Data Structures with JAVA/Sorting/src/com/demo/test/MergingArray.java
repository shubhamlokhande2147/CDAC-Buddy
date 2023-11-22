package com.demo.test;

import java.util.Arrays;

public class MergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { -1, 0, 1, 8, 9, 15, 20, 100, 500 };
		int arr2[] = { 7, 10, 17, 25 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		int arr3[] = new int[n1 + n2];
		merge(arr1, arr2, arr3);
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		System.out.println("Array 3: " + Arrays.toString(arr3));
	}

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
	}

}
