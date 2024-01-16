package com.mine.practice.fundamentals.structures;

public interface LinkedList<T> {

	T get(int index);

	int length();

	void insertAt(T value, int index);

	T remove(T value);

	void removeAt(int index);

	void append(T value);

	void prepend(T value);
}
