package com.mine.leet.ace75.intervals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NonOverlappingIntervals {

	public int eraseOverlapIntervals(int[][] intervals) {
		int maxEnd = intervals[0][1];
		int minEnd = maxEnd;
		for (int i = 1; i < intervals.length; i++) {
			maxEnd = Math.max(maxEnd, intervals[i][1]);
			minEnd = Math.min(minEnd, intervals[i][1]);
		}

		int shift = 1 - minEnd;
		int maxIntervalRange = 2 + maxEnd - minEnd;
		int[] rightEnds = new int[maxIntervalRange];
		for (int[] interval : intervals) {
			int left = interval[0] + shift;
			int right = interval[1] + shift;
			if (left > rightEnds[right])
				rightEnds[right] = left;
		}

		int start = 1;
		int count = 1;
		for (int i = 2; i < maxIntervalRange; i++) {
			if (start <= rightEnds[i]) {
				count++;
				start = i;
			}
		}

		return intervals.length - count;

	}
}
