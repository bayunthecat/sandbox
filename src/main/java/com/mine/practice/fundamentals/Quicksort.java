package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Quicksort {

	public int[] sort(int[] input) {
		quicksort(input, 0, input.length - 1);
		return input;
	}

	private void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivotIndex = partition(arr, lo, hi);
		quicksort(arr, lo, pivotIndex - 1);
		quicksort(arr, pivotIndex + 1, hi);
	}

	private int partition(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int index = lo - 1;
		for (int i = lo; i < hi; i++) {
			if (arr[i] <= pivot) {
				index++;
				int tmp = arr[i];
				arr[i] = arr[index];
				arr[index] = tmp;
			}
		}
		index++;
		arr[hi] = arr[index];
		arr[index] = pivot;
		return index;
	}
}
