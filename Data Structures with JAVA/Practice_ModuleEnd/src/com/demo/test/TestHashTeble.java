package com.demo.test;

import com.demo.beans.HashsSinglyList;

public class TestHashTeble {

	public static void main(String[] args) {
		
		HashsSinglyList[] hashtable = new HashsSinglyList[5];
		
		for(int i=0; i < hashtable.length; i++)
		{
			hashtable[i] = new HashsSinglyList();
		}
		
		int arr[] = { 25, 12, 14, 45, 1, 3, 8, 9 };

		for(int i=0; i<arr.length; i++)
		{
			
			int pos = arr[i] % hashtable.length;
			hashtable[pos].addAtStart(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++)
		{
		   hashtable[i].print();
		}
		
	}
	
}
