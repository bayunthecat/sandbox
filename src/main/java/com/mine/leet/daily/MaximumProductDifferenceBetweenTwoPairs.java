package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MaximumProductDifferenceBetweenTwoPairs {

	public int maxProductDifference(int[] nums) {
		int maxProduct = Integer.MIN_VALUE;
		int minProduct = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				maxProduct = Math.max(nums[i] * nums[j], maxProduct);
				minProduct = Math.min(nums[i] * nums[j], minProduct);
			}
		}
		return maxProduct - minProduct;
	}

}
