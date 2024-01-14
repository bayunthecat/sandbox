package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BubbleSort {

	public int[] sort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j] > input[j + 1]) {
					int tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
			}
		}
		return input;
	}
}
