package com.mine.leet.ace75.binarysearch;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FindPeakElement {

	public int findPeakElement(int[] nums) {
		int to = nums.length;
		int from = 0;
		do {
			int half = (to - from) / 2 + from;
			if (half + 1 < to && nums[half + 1] > nums[half]) {
				from = half;
			} else if (half - 1 >= 0 && nums[half - 1] > nums[half]) {
				to = half;
			} else {
				return half;
			}
		} while (true);
	}
}
