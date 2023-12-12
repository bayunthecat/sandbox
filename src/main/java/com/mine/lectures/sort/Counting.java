package com.mine.lectures.sort;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Counting {

	int[] sortAlt(int[] input) {
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

	int[] sort(int[] input, int maxValue) {
		int[] counts = new int[maxValue + 1];
		for (int num : input) {
			counts[num] += 1;
		}
		int[] output = new int[input.length];
		int k = 0;
		for (int i = 0; i < counts.length; i++) {
			int count = counts[i];
			for (int j = 0; j < count; j++) {
				output[k++] = i;
			}
		}
		return output;
	}
}
