package com.demo.beans;

public class circularlinkedlist {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;

	public circularlinkedlist() {
		head = null;
	}

	public void addNodeByPosition(int pos, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			if (pos == 1) {
				Node temp = head;
				while (temp.next != head) {
					temp = temp.next;
				}
				newNode.next = head;
				head = newNode;
				temp.next = head;
			} else {
				Node temp = head;
				for (int i = 1; temp.next != head && i != pos - 1; i++) {
					temp = temp.next;
				}
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}

//		Node newnode = new Node(data);
//
//		if (head == null) {
//			head = newnode;
//			newnode.next = head;
//		}
//
//		if (pos == 1) {
//			Node temp = head;
//			while (temp.next != head) {
//				temp = temp.next;
//			}
//
//			newnode.next = head;
//			head = newnode;
//			newnode.next = head;
//		} else {
//			Node temp = head;
//			for (int i = 1; temp.next != head && i != pos - 1; i++) {
//				temp = temp.next;
//			}
//
//			newnode.next = temp.next;
//			temp.next = newnode;
//
//		}

	}

	public void deleteByKey(int val) {
		Node prev = null;
		Node current = head;
		while (current.next != head && current.data != val) {
			prev = current;
			current = current.next;
		}
		if (current.data == val) {
			if (current == head) {
				Node temp = current;
				while (temp.next != head) {
					temp = temp.next;
				}
				temp.next = current.next;
				head = head.next;
				current.next = null;
				current = null;
			} else {
				prev.next = current.next;
				current.next = null;
				current = null;
			}
		}
	}

	public void DisplayData() {
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data + "->head");
		System.out.println();
	}

}
