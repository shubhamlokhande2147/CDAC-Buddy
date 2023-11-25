package com.demo.beans;

import java.util.Arrays;

public class MyCircularQueue {

	private int[] queuearr;
	private int size;
	private int front;
	private int rear;

	public MyCircularQueue() {
		size = 10;
		queuearr = new int[size];
		front = -1;
		rear = -1;

	}

	public MyCircularQueue(int n) {
		size = n;
		queuearr = new int[n];
		front = -1;
		rear = -1;

	}

	public boolean isFull() {

		if (front == 0 && rear == size - 1) {
			return true;
		} else if ((rear + 1) % size == front) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}

	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0; // set front at 0th position
			}
			rear = (rear + 1) % size;
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
			if (front == rear) { // this condition for if only one element is present in circular queue
				front = -1;
				rear = -1; // set front and rear -1 position
			} else {
				System.out.println(n + "removed from Circular Queue");
				front = (front + 1) % size;
			}
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
			int i;
			for (i = front; i != rear; i = (i + 1) % size) {
				System.out.print(queuearr[i] + " | ");
			}
			System.out.print(queuearr[i] + " | ");
			System.out.println(" ");
		}

	}

	public String toString() {
		return Arrays.toString(queuearr) + " front :" + front + " rear: " + rear;
	}

}
