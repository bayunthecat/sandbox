package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class MinimumTimeToMakeRopeColorful {

	public int minCost(String colors, int[] neededTime) {
		char prev = '\u0000', current;
		int result = 0;
		int from = -1;
		for (int i = 0; i < colors.length(); i++) {
			current = colors.charAt(i);
			if (prev == current) {
				if (from == -1) {
					from = i - 1;
				}
			} else if (from != -1) {
				result += minTime(neededTime, from, i);
				from = -1;
			}
			prev = current;
		}
		if (from != -1) {
			result += minTime(neededTime, from, colors.length());
		}
		return result;
	}

	private int minTime(int[] neededTime, int from, int to) {
		int minTime = 0;
		Arrays.sort(neededTime, from, to);
		for (int i = from; i < to - 1; i++) {
			minTime += neededTime[i];
		}
		return minTime;
	}
}
