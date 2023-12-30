package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BinarySearchRecursion {

	public int indexOf(int[] array, int value) {
		return indexOf(array, 0, array.length, value);
	}

	private int indexOf(int[] array, int from, int to, int value) {
		int half = from + (to - from) / 2;
		if (from >= to) {
			return -1;
		} else if (array[half] < value) {
			return indexOf(array, half + 1, to, value);
		} else if (array[half] > value) {
			return indexOf(array, from, half, value);
		}
		return half;
	}
}
