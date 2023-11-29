package com.demo.beans;

public class BinarySearchTree {

	class Node {
		int data;
		Node right;
		Node left;

		public Node(int data) {
			this.data = data;
			right = null;
			left = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = insertRec(root.left, key);
		} else {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public void inorder() {
		inorderTraversal(root);
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + ",");
			inorderTraversal(root.right);
		}
	}
//	class Node {
//		int data;
//		Node left, right;
//
//		public Node(int data) {
//			this.data = data;
//			left = null;
//			right = null;
//		}
//
//	}
//
//	private Node root;
//
//	public BinarySearchTree() {
//		root = null;
//	}
//
//	public void insert(int key) {
//		root = insertRecord(root, key); // insert record function creates
//	}
//
//	private Node insertRecord(Node root, int key) {
//
//		if (root == null) {
//			root = new Node(key);
//			return root;
//		}
//
//		if (key < root.data) {
//			root.left = insertRecord(root.left, key);
//		} else {
//			root.right = insertRecord(root.right, key);
//		}
//
//		return root;
//	}
//
//	// inorder traversal
//	public void inorder() {
//		inorderTraversal(root);
//	}
//
//	public void inorderTraversal(Node root) {
//		if (root != null) {
//			inorderTraversal(root.left);
//			System.out.print(root.data + ",");
//			inorderTraversal(root.right);
//		}
//
//	}

	// inorder traversal
	public void preorder() {
		preorderTraversal(root);
	}

	public void preorderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + ",");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	// inorder traversal
	public void postorder() {
		postorderTraversal(root);
	}

	public void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data + ",");
		}
	}
}
