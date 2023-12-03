package com.demo.beans;

import java.util.Arrays;

public class MyQueue {

	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public MyQueue(int n)
	{
		size = n;
		arr = new int[n];
		front=0;
		rear=-1;
	}
	
	public boolean isEmpty()
	{
		if(front > rear)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(rear == size-1)
		{
			return true;
		}
		else
			return false;
			
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("queue is full");
		}
		else
		{
		rear++;
		arr[rear]=data;
		}
		//System.out.println(Arrays.toString(arr));
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
		 System.out.println("queue is empty");
		 return -1;
		}
		else
		{
		   int n = arr[front]; 
		   front++;
		   return n;
		}
	}
	
	
	public void print()
	{
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("| ");
			for (int i = front; i <= rear; i++) {
				System.out.print(arr[i] + " | ");
			}
			System.out.println(" ");
	}
	
	
	}
	
}
