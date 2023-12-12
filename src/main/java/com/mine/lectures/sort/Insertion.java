package com.mine.lectures.sort;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Insertion {

	public int[] sort(int[] array) {
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
}
