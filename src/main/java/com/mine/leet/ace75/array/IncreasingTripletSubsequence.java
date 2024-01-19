package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] nums) {
		int minI = Integer.MAX_VALUE, minJ = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			minI = Math.min(minI, nums[i]);
			if (minI < nums[i]) {
				minJ = Math.min(minJ, nums[i]);
			}
			if (nums[i] > minJ && nums[i] > minI) {
				return true;
			}
		}
		return false;
	}
}
