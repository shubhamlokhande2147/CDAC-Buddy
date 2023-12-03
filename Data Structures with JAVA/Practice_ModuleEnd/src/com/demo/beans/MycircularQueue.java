package com.demo.beans;

public class MycircularQueue {

	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	
	public MycircularQueue(int n)
	{
		size=n;
		arr = new int[n];
		front = -1;
		rear = -1;
	}
	public boolean isEmpty()
	{
		if(front ==-1)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean isFull()
	{
		if(front ==0 && rear == size-1)
		{
			return true;
        }
		else if((rear+1)%size==front)
		{
			return true;
		}
		else {	
		return false;
		}
	}
	
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("queue full");
		}
		else {
		if(front == -1)
		{
			front=0;
		}
		rear=(rear+1)%size;
		arr[rear] = data;
	
		}
	}
	
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue empty");
			return -1;
		}
		else {
			int n = arr[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else {
			front = (front+1)%size;
			}
			
			
			return n;
			
		}
	}
	
	public void print() {
	if (isEmpty()) {
		System.out.println("Queue is Empty");
	} else {
		System.out.print("| ");
		int i;
		for (i = front; i != rear; i = (i + 1) % size) {
			System.out.print(arr[i] + " | ");
		}
		System.out.print(arr[i] + " | ");
		System.out.println(" ");
	}
	}
}
