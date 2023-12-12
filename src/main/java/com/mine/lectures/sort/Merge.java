package com.mine.lectures.sort;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class Merge {

	public int[] sort(int[] array) {
		if (array.length != 1) {
			int half = array.length / 2;
			return merge(sort(Arrays.copyOfRange(array, 0, half)), sort(Arrays.copyOfRange(array, half, array.length)));
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
}
