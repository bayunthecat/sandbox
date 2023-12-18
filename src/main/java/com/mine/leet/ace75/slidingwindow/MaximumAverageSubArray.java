package com.mine.leet.ace75.slidingwindow;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MaximumAverageSubArray {

	public double findMaxAverage(int[] nums, int k) {
		int window = 0;
		for (int i = 0; i < k; i++) {
			window += nums[i];
		}
		double maxAvg = (double) window / k;
		for (int i = 0; i < nums.length - k; i++) {
			window = window - nums[i];
			window = window + nums[i + k];
			maxAvg = Math.max(maxAvg, (double) window / k);
		}
		return maxAvg;
	}
}
