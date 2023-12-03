package com.demo.beans;

public class BinarySearchTree {
	
	class Node
	{
		private int data;
		private Node left,right;
		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	
	
	public void insert(int key)
	{
		root = insertrecord(root,key);
	}


	private Node insertrecord(Node root, int key) {
		
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		
		if(key < root.data)
		{
			root.left = insertrecord(root.left,key);
		}
		else
		{
			root.right = insertrecord(root.right,key);
		}
		
		return root;
	}
	
	public void inorder()
	{
		inordrTravrsal(root);
	}

	private void inordrTravrsal(Node root) {
         //inorder == LRD
        if(root != null) {
        	inordrTravrsal(root.left);
        	System.out.print(root.data + ",");
        	inordrTravrsal(root.right);
		
        }
		
	}

}

