package com.mine.lectures.sort;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Heap {

	public int[] sort(int[] array) {
		array = buildHeap(array);
		for (int i = array.length - 1; i >= 0; i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			heapify(array, i, 0);
		}
		return array;
	}

	private int[] buildHeap(int[] array) {
		for (int i = array.length / 2 - 1; i >= 0; i--)
			heapify(array, array.length, i);
		return array;
	}

	private void heapify(int[] array, int length, int i) {
		int left = 2 * i + 1;
		int largest = i;
		if (left < length && array[left] > array[largest]) {
			largest = left;
		}
		int right = 2 * i + 2;
		if (right < length && array[right] > array[largest]) {
			largest = right;
		}
		if (i != largest) {
			int tmp = array[largest];
			array[largest] = array[i];
			array[i] = tmp;
			heapify(array, length, largest);
		}
	}
}
