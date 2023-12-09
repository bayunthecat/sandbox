package com.mine.lectures;

import java.util.Arrays;

public class Sorts {

	public int[] insertion(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j >= 1; j--) {
				if (array[j - 1] > array[j]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	public int[] merge(int[] array) {
		if (array.length != 1) {
			int half = array.length / 2;
			return merge(merge(Arrays.copyOfRange(array, 0, half)), merge(Arrays.copyOfRange(array, half, array.length)));
		}
		return array;
	}

	private int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				result[k++] = a[i++];
			} else {
				result[k++] = b[j++];
			}
		}
		while (i < a.length) {
			result[k++] = a[i++];
		}
		while (j < b.length) {
			result[k++] = b[j++];
		}
		return result;
	}

	public int[] heap(int[] array) {
		array = buildHeap(array);
		for (int i = array.length - 1; i >= 0; i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			heapify(array, i, 0);
		}
		return array;
	}

	public int[] buildHeap(int[] array) {
		for (int i = array.length / 2 - 1; i >= 0; i--)
			heapify(array, array.length, i);
		return array;
	}

	public void heapify(int[] array, int length, int i) {
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
