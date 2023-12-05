package com.mine.lectures;

public class PeakFinder {

	public int findAPeakRecursive(int[] array) {
		return findAPeakRecursive(array, 0, array.length);
	}

	private int findAPeakRecursive(int[] array, int from, int to) {
		int half = from + ((to - from) / 2);
		int value = array[half];
		if (half - 1 >= 0 && value < array[half - 1]) {
			return findAPeakRecursive(array, from, half);
		} else if (half + 1 < array.length && value < array[half + 1]) {
			return findAPeakRecursive(array, half, to);
		} else {
			return half;
		}
	}

	public int findAPeakCycle(int[] array) {
		int to = array.length, from = 0;
		do {
			int half = from + ((to - from) / 2);
			if (half - 1 >= 0 && array[half] < array[half - 1]) {
				to = half;
			} else if (half + 1 < array.length && array[half] < array[half + 1]) {
				from = half;
			} else {
				return half;
			}
		} while (true);
	}

	public int[] findAPeak(int[][] array) {
		int from = 0, to = array.length, half, maxIndex;
		do {
			half = from + ((to - from) / 2);
			int[] column = array[half];
			maxIndex = findAPeakCycle(column);
			if (maxIndex - 1 >= 0 && array[half][maxIndex - 1] > array[half][maxIndex]) {
				to = half;
			} else if (maxIndex + 1 < to && array[half][maxIndex + 1] > array[half][maxIndex]) {
				from = half;
			} else {
				break;
			}
		} while (true);
		return new int[]{half, maxIndex};
	}
}