package com.demo.beans;

public class LinkedList {
	public class Node {
		public Employee data;
		public Node next;

		Node(Employee data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;

	public LinkedList() {
		head = null;
	}

	public void addAtEnd(Employee data) {
		Node newNode = new Node(data);
		// when list is null
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}

	public void addByPosition(Employee value, int pos) {
//		Node newNode = new Node(data);
//		if (head == null && position != 0) {
//			head = newNode;
//		} else {
//			Node prev = head;
//			Node curr = prev.next;
//			for (int i = 1; i < position - 2; i++) {
//				curr = curr.next;
//			}
//			curr.next = newNode;
//			
//		}
		// create a node
		Node newnode = new Node(value);
		if (head == null && pos != 1) {
			System.out.println("list is empty");
		}
		if (pos == 1) {
			if (head == null) {
				head = newnode;
			} else {
				newnode.next = head;
				head = newnode;
			}
		} else {
			Node prev = head;
			for (int i = 1; prev != null && i <= pos - 2; i++) {
				prev = prev.next;
			}
			if (prev != null) {
				newnode.next = prev.next;
				prev.next = newnode;
			} else {
				System.out.println("position is wrong");
			}
		}
	}

	// delete the node by value
	public boolean deleteByValue(Employee val) {
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

	public Node Head() {
		return head;
	}

	public boolean deleteByPosition(int pos) {
		if (pos == 1) {
			Node temp = head;
			head = head.next;
			// it will make the temp ready for garbage collection
			temp.next = null;
			return true;
		} else {
			Node prev = head;
			Node current = prev.next;
			for (int i = 1; current != null && i <= pos - 2; i++) {
				prev = prev.next;
				current = current.next;
			}
			if (current != null) {
				prev.next = current.next;
				current.next = null;
				current = null;
				return true;
			} else {
				System.out.println(pos + " is wrong");
				return false;
			}

		}
	}

//	public void displaydata() {
//		Node temp = head;
//		while (temp != null) {
//			System.out.print(temp.data);
//			temp = temp.next;
//			System.out.print("->");
//		}
//		System.out.println("null");
//		System.out.println();
//	}
	public void displaydata() {
		Node curr = head;
		while (curr.next != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
		System.out.println(curr.data);

	}
}
