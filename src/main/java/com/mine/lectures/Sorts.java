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

	public int[] merge(int[] a, int[] b) {
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
}
