package com.mine.lectures.bst;

public class Tree<T extends Comparable<T>> {

	private Node<T> root;

	public void insert(T value) {
		if (root == null) {
			root = new Node<T>(value);
		} else {
			insert(value, root);
		}
	}

	private Node<T> insert(T value, Node<T> node) {
		if (node == null) {
			return new Node<T>(value);
		}
		if (value.compareTo(node.value) < 0) {
			node.left = insert(value, node.left);
		} else if (value.compareTo(node.value) > 0) {
			node.right = insert(value, node.right);
		}
		return node;
	}

	private static class Node<T extends Comparable<T>> {

		public T value;

		public Node<T> left;

		public Node<T> right;

		public Node(T value) {
			this.value = value;
		}
	}
}
