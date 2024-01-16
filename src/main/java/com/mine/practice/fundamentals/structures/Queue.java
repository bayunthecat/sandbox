package com.mine.practice.fundamentals.structures;

public interface Queue<T> {

	void enqueue(T value);

	T deque();

	T peek();

	int length();
}