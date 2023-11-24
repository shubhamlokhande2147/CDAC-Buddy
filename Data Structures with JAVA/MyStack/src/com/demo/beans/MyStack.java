package com.demo.beans;

public class MyStack {
	private int size;
	private int arr[];
	private int top;

	public MyStack() {
		// TODO Auto-generated constructor stub
		size = 10;
		arr = new int[size];
		top = -1;
	}

	public MyStack(int n) {
		size = n;
		arr = new int[n];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(int n) {
		if (isFull()) {
			System.out.println("stack overflow/isfull");
		} else {
			top++;
			arr[top] = n;
			System.out.println("element " + arr[top] + " pushed");
		}

	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("stack underflow/isempty");
		} else {
			int data = arr[top];
			top--;
			System.out.println("element " + data + " poped");
		}
	}

	public void printdata() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}

}

//  without switch case code -

//public boolean isFull() {
//		return top == size - 1;
//	}
//
//	public boolean isEmpty() {
//		return top == -1;
//	}
//
//	public void push(int data) {
//		if (isFull()) {
//			System.out.println("Stack OverFlow");
//			System.exit(0);
//		}
//		top++;
//		arr[top] = data;
//
//	}
//
//	public void pop() {
//		if (isEmpty()) {
//			System.out.println("Stack Underflow");
//			System.exit(0);
//		} else {
//			top--;
//
//		}
//
//	}
//
//	public void printStack() {
//		for (int i = 0; i <= top; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
//	}
