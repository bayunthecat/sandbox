package com.mine.lectures;

public class Counting {

	int[] sort(int[] input) {
		int[] prefixSum = new int[10];
		for (int num : input) {
			prefixSum[num] += 1;
		}
		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
		}
		int[] output = new int[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			int num = input[i];
			int position = prefixSum[num];
			output[position - 1] = num;
			prefixSum[num] -= 1;
		}
		return output;
	}
}
