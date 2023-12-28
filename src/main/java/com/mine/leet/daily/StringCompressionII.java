package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class StringCompressionII {

	public int getLengthOfOptimalCompression(String s, int k) {
		int[][] memo = new int[101][101];
		for (int[] ints : memo) {
			Arrays.fill(ints, -1);
		}
		return recursion(s, 0, k, memo);
	}

	private int recursion(String s, int i, int removals, int[][] memo) {
		int n = s.length();
		int k = removals;
		if (n - i <= k) {
			return 0;
		}
		if (memo[i][k] != -1) {
			System.out.println("Memo hit");
			return memo[i][k];
		}
		int result;
		if (k != 0) {
			result = recursion(s, i + 1, k - 1, memo);
		} else {
			result = 101;
		}
		int c = 1;
		for (int j = i + 1; j <= n; j++) {
			result = Math.min(result, 1 + ((c > 99) ? 3 : (c > 9) ? 2 : (c > 1) ? 1 : 0) + recursion(s, j, k, memo));
			if (j < n && s.charAt(i) == s.charAt(j)) {
				c++;
			} else if (--k < 0) {
				break;
			}
		}
		memo[i][removals] = result;
		return result;
	}

}
