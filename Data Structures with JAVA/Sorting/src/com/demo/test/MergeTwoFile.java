package com.demo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoFile {
	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		// sorting the both array arr1 and aar2
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
		System.out.println(Arrays.toString(arr3));
	}

	public static void main(String[] args) {

		int arr1[] = new int[10];
		int arr2[] = new int[4];
		int a = 0, b = 0;

		int n1 = arr1.length;
		int n2 = arr2.length;
		int arr3[] = new int[n1 + n2];

		// read file 1
		try {
			File myObj = new File("file1.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				int data = myReader.nextInt();
				arr1[a] = data;
				a++;
				System.out.println(data);
			}
			System.out.println(Arrays.toString(arr1));
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// read file 2
		try {
			File myObj = new File("file2.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				int data = myReader.nextInt();
				arr2[b] = data;
				b++;
				System.out.println(data);
			}
			System.out.println(Arrays.toString(arr2));

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// arr1 and arr2 both are pass to the merge function
		merge(arr1, arr2, arr3);

		// after sorting write this sorted data in file3
		try {
			FileWriter myWriter = new FileWriter("file3.txt");
			for (int i = 0; i < arr3.length; i++) {
				myWriter.write(arr3[i]);
			}
			myWriter.close();

			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		//read file 3
			try {
			File myobj = new File("file3.txt");
			Scanner myreader = new Scanner(myobj);
			  while(myreader.hasNextLine())
			  {
				  String data = myreader.next();
				  System.out.println(data);
			  }	// System.out.println("file 3 data  : " + Arrays.toString(arr3));

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	

	}
}
