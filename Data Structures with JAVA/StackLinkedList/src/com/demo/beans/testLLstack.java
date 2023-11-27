package com.demo.beans;

public class testLLstack {
	public static void main(String[] args) {
		StackLinkedList n = new StackLinkedList();
		n.push(10);
		n.push(52);
		n.push(55);
		n.push(32);
		System.out.println(n.pop());
		System.out.println(n.pop());
		// System.out.println(n);
	}

}
