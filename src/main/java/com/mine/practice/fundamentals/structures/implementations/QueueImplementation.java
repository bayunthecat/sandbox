package com.mine.practice.fundamentals.structures.implementations;

import com.mine.practice.fundamentals.structures.Queue;

public class QueueImplementation<T> implements Queue<T> {

	private Node<T> head;

	private Node<T> tail;

	private int length;

	@Override
	public void enqueue(T value) {
		this.length++;
		final var node = new Node<>(value);
		if (tail == null) {
			this.tail = this.head = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
	}

	@Override
	public T deque() {
		if (head == null) {
			return null;
		}
		final var head = this.head;
		this.head = this.head.next;
		head.next = null;
		length--;
		return head.value;
	}

	@Override
	public T peek() {
		return this.head != null ? head.value : null;
	}

	private static class Node<T> {

		private T value;

		private Node<T> next;

		public Node(T value) {
			this.value = value;
		}
	}

	@Override
	public int length() {
		return length;
	}
}
