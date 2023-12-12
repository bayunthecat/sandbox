package com.mine.lectures;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Radix {

	public int[] sort(int[] input, int max) {
		for (int base = 1; max / base > 0; base = base * 10) {
			input = sortByBase(input, base);
		}
		return input;
	}

	private int[] sortByBase(int[] input, int base) {
		int[] cumulativeSum = new int[10];
		for (int j : input) {
			int num = j / base % 10;
			cumulativeSum[num]++;
		}
		for (int i = 1; i < cumulativeSum.length; i++) {
			cumulativeSum[i] = cumulativeSum[i - 1] + cumulativeSum[i];
		}
		int[] output = new int[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			int inputNum = input[i];
			int based = inputNum / base % 10;
			int position = cumulativeSum[based];
			output[position - 1] = inputNum;
			cumulativeSum[based]--;
		}
		return output;
	}
}
