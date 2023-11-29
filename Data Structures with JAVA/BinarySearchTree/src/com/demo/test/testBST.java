package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class testBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(60);
		bst.insert(35);
		bst.insert(75);
		bst.insert(40);
		bst.insert(20);
		bst.insert(70);
		bst.insert(85);
		System.out.println("Inorder traversal");
		bst.inorder();
		System.out.println();
		System.out.println("\nPreorder traversal");
		bst.preorder();
		System.out.println();
		System.out.println("\nPostorder traversal");
		bst.postorder();
	}

}
