package com.mine.lectures;

public class Avl {

	private Node root;

	public void insert(int key) {
		root = insert(key, root);
	}

	private int balanceFactor(Node node) {
		return height(node.left) - height(node.right);
	}

	private int height(Node node) {
		return node != null ? node.height : 0;
	}

	private Node insert(int key, Node node) {
		if (node == null) {
			return new Node(key);
		}
		if (key < node.key) {
			node.left = insert(key, node.left);
		} else {
			node.right = insert(key, node.right);
		}
		node.height = 1 + Math.max(height(node.left), height(node.right));
		int balanceFactor = balanceFactor(node);
		if (balanceFactor > 1) {
			if (balanceFactor(node.left) > 0) {
				node = right(node);
			} else {
				node.left = left(node.left);
				node = right(node);
			}
		} else if (balanceFactor < -1) {
			if (balanceFactor(node.right) < 0) {
				node = left(node);
			} else {
				node.right = right(node.right);
				node = left(node);
			}
		}
		System.out.printf("Visiting node %s, inserting %s, height %s%n", node.key, key, node.height);
		return node;
	}

	private Node left(Node node) {
		Node b = node.right;
		Node t2 = b.left;
		b.left = node;
		node.right = t2;
		node.height = 1 + Math.max(height(node.left), height(node.right));
		b.height = 1 + Math.max(height(b.left), height(b.right));
		return b;
	}

	private Node right(Node node) {
		Node b = node.left;
		Node t2 = b.right;
		b.right = node;
		node.left = t2;
		node.height = 1 + Math.max(height(node.left), height(node.right));
		b.height = 1 + Math.max(height(b.left), height(b.right));
		return b;
	}

	private static class Node {

		public Node left;

		public Node right;

		public int key;

		public int height;

		public Node(int key) {
			this.key = key;
			height = 1;
		}
	}
}
