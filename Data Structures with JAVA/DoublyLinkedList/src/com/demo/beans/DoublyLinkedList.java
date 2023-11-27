package com.demo.beans;

public class DoublyLinkedList {
	Node head;

	class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			super();
			this.data = data;
			next = null;
			prev = null;
		}
	}

	public DoublyLinkedList() {
		super();
		head = null;
	}

	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	public void addAtPoisition(int data, int pos) {
		Node newNode = new Node(data);
		// shift head position if pos =1
		if (pos == 1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		Node temp = head;
		for (int i = 1; i <= pos - 2; i++) {
			temp = temp.next;
		}
		if (temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		} else {
			System.out.println("wrong position");
		}
	}

	public void addbeforeKey(int data, int num) {
		Node newNode = new Node(data);
		Node temp = head;
		while (temp.next != null && temp.next.data != num) {
			temp = temp.next;
		}
		if (temp.next != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		} else {
			System.out.println(data + " data is not matched");
		}

	}

	public void addAfterKey(int data, int num) {
		Node newNode = new Node(data);
		Node temp = head;
		while (temp != null && temp.data != num) {
			temp = temp.next;
		}
		if (temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
		} else {
			System.out.println(data + " data is not matched");
		}
	}

	public void deleteByKey(int num) {
		Node temp = head;

		while (temp != null && temp.data != num) {
			temp = temp.next;
		}
		if (temp != null) {
			if (temp == head) {
				head = head.next;
				head.prev = null;
				temp.next = null;
				temp = null;
			} else {

				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;
				temp = null;

			}
		}

	}

	public void deleteByPosition(int pos) {
		Node temp = head;

		if (pos == 1) {
			head = head.next;
			head.prev = null;
			temp.next = null;
			temp = null;
		} else {

			for (int i = 1; temp != null && i != pos; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;
				temp = null;
			} else {
				System.out.println("position not found");
			}
		}
	}

	public void printData() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null\n");
	}

}
