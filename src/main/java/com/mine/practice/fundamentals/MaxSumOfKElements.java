package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.PriorityQueue;
import java.util.Queue;

@ApplicationScoped
public class MaxSumOfKElements {

	public int maxSum(int[] array, int k) {
		Queue<Integer> queue = new PriorityQueue<>();
		int rollingSum = 0, maxSum = 0, i = 0;
		while (i < array.length) {
			while (queue.size() < k) {
				rollingSum += array[i];
				queue.offer(array[i]);
				i++;
			}
			maxSum = Math.max(rollingSum, maxSum);
			Integer minFromQueue = queue.poll();
			if (minFromQueue != null) {
				rollingSum -= minFromQueue;
			}
		}
		return maxSum;
	}
}
