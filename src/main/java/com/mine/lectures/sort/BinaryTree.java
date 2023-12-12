package com.mine.lectures.sort;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BinaryTree {

	public int[] sort(int[] input) {
		int[] output = new int[input.length];
		Node root = buildTree(input);
		if (root == null) return new int[]{};
		orderTraverse(root, output, new Counter());
		return output;
	}

	private void orderTraverse(Node node, int[] output, Counter counter) {
		if (node.left != null) {
			orderTraverse(node.left, output, counter);
		}
		output[counter.count++] = node.value;
		if (node.right != null) {
			orderTraverse(node.right, output, counter);
		}
	}

	private Node buildTree(int[] array) {
		Node root = null;
		for (int j : array) {
			root = insert(j, root);
		}
		return root;
	}

	private Node insert(int value, Node node) {
		if (node == null) {
			return new Node(value);
		}
		if (value < node.value) {
			node.left = insert(value, node.left);
		} else {
			node.right = insert(value, node.right);
		}
		return node;
	}

	private static class Counter {
		public int count;
	}

	private static class Node {

		private final int value;

		private Node left;

		private Node right;

		public Node(int value) {
			this.value = value;
		}
	}
}
