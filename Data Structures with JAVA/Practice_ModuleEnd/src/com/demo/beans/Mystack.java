package com.demo.beans;

import java.util.Arrays;

public class Mystack {


	private int size;
	private int[] arr;
	private int top;
	
	public Mystack()
	{
		size=5;
		arr = new int[size];
		top = -1;
	}
	
	public Mystack(int n)
	{
		arr = new int[n];
		size=n;
		top = -1;
	}
	 
	public boolean isEmpty()
	{
		
		if(top==-1)
		{
			return true;
		}
		else
			return false;
		
	}
	
	public boolean isFull()
	{
		if(top == size-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public void push(int n)
	{
		if(isFull()) {
			System.out.println("stack full");
		}
		else {
		top++;
		arr[top] = n;
		//System.out.println("Data added " +  Arrays.toString(arr));
		}
	}
	
	public void pop()
	{

		if(isEmpty()) {
			System.out.println("stack empty");
			//return -1;
		}
		else
		{
		 int temp =arr[top];
		 top--;
		 //System.out.println("Data added " +  Arrays.toString(arr));
		// return temp;
		}
		}
	
	public void print()
	{
		for(int i=0; i<=top; i++)
		{
			System.out.println(arr[i]);
		}
	}
		
	
	
}

