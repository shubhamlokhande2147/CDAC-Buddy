package com.demo.beans;

import java.util.Arrays;

public class MyQueue {

	private int[] queuearr;
	private int size;
	private int front;
	private int rear;

	public MyQueue() {
		size = 10;
		queuearr = new int[size];
		front = 0;
		rear = -1;

	}

	public MyQueue(int n) {
		size = n;
		queuearr = new int[n];
		front = 0;
		rear = -1;

	}

	public boolean isFull() {
		return rear == size - 1;
	}

	public boolean isEmpty() {
//		if (front > rear) {
//			return true;
//		} else {
//			return false;
//		}
		return front > rear;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			rear++;
			queuearr[rear] = data;
			System.out.println(data + " added to queue");

		}

	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			int n = queuearr[front];
			front++;
			return n;
		}

	}

	public int capacity() {
//		if (isFull()) {
//			return size;
//		}
		if (isEmpty()) {
			return -1;
		}
		return rear - front + 1;
	}

	public void PrintData() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.print("| ");
			for (int i = front; i <= rear; i++) {
				System.out.print(queuearr[i] + " | ");
			}
			System.out.println(" ");
		}
	}

	public String toString() {
		return Arrays.toString(queuearr) + " front :" + front + " rear: " + rear;
	}
}
