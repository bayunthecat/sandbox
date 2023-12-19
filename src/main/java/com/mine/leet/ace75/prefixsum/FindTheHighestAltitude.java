package com.mine.leet.ace75.prefixsum;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FindTheHighestAltitude {

	public int largestAltitude(int[] gain) {
		int rollingSum = 0;
		int max = 0;
		for (int j : gain) {
			rollingSum += j;
			max = Math.max(rollingSum, max);
		}
		return max;
	}
}
