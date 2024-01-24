package com.mine.util;

public class TreeNode<T> {

	private final T value;

	private TreeNode<T> left;

	private TreeNode<T> right;

	public TreeNode(T value) {
		this.value = value;
	}

	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public T getValue() {
		return value;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public TreeNode<T> getRight() {
		return right;
	}
}
