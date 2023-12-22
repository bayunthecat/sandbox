package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MaximumScoreAfterSplittingAString {

	public int maxScore(String s) {
		int maxLeft = Integer.MIN_VALUE, zeroes = 0, ones = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0')
				zeroes++;
			else
				ones++;
			maxLeft = Math.max(maxLeft, zeroes - ones);
		}
		if (s.charAt(s.length() - 1) == '1') {
			ones++;
		}
		return maxLeft + ones;
	}

}
