package com.demo.beans;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;

		public Node(int n) {
			data = n;
			next = null;
		}
	}

	Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void addAtStart(int n) {
		Node newnode = new Node(n);

		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public boolean search(int data) {
		Node temp = head;
		while (temp.next != null && temp.data != data) {
			temp = temp.next;
		}

		if (temp != null && temp.data == data) {
			return true;
		} else {
			return false;
		}

		// mam code

		// Node temp=head;
		// while(temp!=null) {
		//
		// if(n==temp.n)
		// return true;
		// temp=temp.next;
		// }
		// return false;

	}

	// delete the node by value
	public boolean deleteByValue(int val) {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			// delete from the begining
			if (head.data == val) {
				Node temp = head;
				head = head.next;
				// it will make the temp ready for garbage collection
				temp.next = null;
				return true;
			} else {
				Node prev = head;
				Node current = prev.next;
				while (current != null && current.data != val) {
					prev = prev.next;
					current = current.next;

				}
				if (current != null) {
					prev.next = current.next;
					current.next = null;
					current = null;
					return true;
				} else {
					System.out.println(val + " not found");
					return false;
				}
			}
		}
		return false;
	}

	public void display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println();
	}

}
