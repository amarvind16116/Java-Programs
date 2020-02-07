package com.bridgelabz.datastructures;

import com.bridgelabz.utils.Utility;

/**
 * @author Arvind 
 * Date: 3/12/2019 
 * purpose: implementation of binary search tree
 */

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	class Node {
		int data;
		Node leftChild = null;
		Node rightChild = null;

		public Node(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
	}

	// Function for adding new Node

	public void addNode(int data) {
		Node new_node = new Node(data);
		if (root == null) {
			root = new_node;
		} else {
			traverseForAdd(root, new_node);
		}
	}

	// traverse through the tree and add new Node

	public void traverseForAdd(Node current, Node new_node) {
		if (new_node.data < current.data) {
			if (current.leftChild == null) {
				current.leftChild = new_node;
			} else {
				traverseForAdd(current.leftChild, new_node);
			}
		} else if (new_node.data > current.data) {
			if (current.rightChild == null) {
				current.rightChild = new_node;
			} else {
				traverseForAdd(current.rightChild, new_node);
			}
		}
	}

	// method for delete the node
	public void delete(int data) {
		root = deleteAt(root, data);
	}

	private Node deleteAt(Node root, int data) {
		if (root == null) {
			return root;
		} else if (data < root.data) {
			root.leftChild = deleteAt(root.leftChild, data);
		} else if (data > root.data) {
			root.rightChild = deleteAt(root.rightChild, data);
		} else {
			if (root.leftChild == null) {
				return root.rightChild;
			} else if (root.rightChild == null) {
				return root.leftChild;
			}

			root.data = minValue(root.rightChild);
			root.rightChild = deleteAt(root.rightChild, root.data);
		}
		return root;
	}

	private int minValue(Node root) {
		int min = root.data;

		while (root.leftChild != null) {
			min = root.leftChild.data;
			root = root.leftChild;
		}
		return min;
	}

	// Inorder traversal for tree
	public void inorderPrint() {
		inorderTraversal(root);
	}

	public void inorderTraversal(Node root) {
		while (root != null) {
			inorderTraversal(root.leftChild);
			System.out.print(root.data + " ");
			inorderTraversal(root.rightChild);
		}
	}

	// method for count the number of possibilities
	public int noOfBinaryTree(int key) {
		int possibility = Utility.factorial(key * 2) / Utility.factorial(key + 1) * Utility.factorial(key);
		return possibility;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree binaryTree = new BinarySearchTree();

		binaryTree.addNode(50);
		binaryTree.addNode(30);
		binaryTree.addNode(20);
		binaryTree.addNode(40);
		binaryTree.addNode(70);
		binaryTree.addNode(60);
		binaryTree.addNode(80);

		System.out.println("Delete 70");
		binaryTree.delete(70);

		System.out.println(binaryTree.noOfBinaryTree(3));
	}

}
