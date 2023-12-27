package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MinimumTimeToMakeRopeColorful {

	public int minCost(String colors, int[] neededTime) {
		char current;
		int result = 0, maxLocal = 0;
		for (int i = 0; i < colors.length(); i++) {
			current = colors.charAt(i);
			if (i < colors.length() - 1 && colors.charAt(i + 1) == current) {
				result += neededTime[i];
				maxLocal = Math.max(maxLocal, neededTime[i]);
			} else {
				if (maxLocal != 0) {
					result += neededTime[i];
					maxLocal = Math.max(maxLocal, neededTime[i]);
				}
				result -= maxLocal;
				maxLocal = 0;
			}
		}
		return result;
	}
}
