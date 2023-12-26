package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class NumberOfDiceRollsWithTargetSum {

	private static final int MOD = (int) (Math.pow(10, 9) + 7);

	public int numRollsToTarget(int n, int k, int target) {
		int[][] memo = new int[n + 1][target + 1];
		for (int[] ints : memo) {
			Arrays.fill(ints, -1);
		}
		return numRollsToTargetRecursion(n, k, target, memo);
	}

	private int numRollsToTargetRecursion(int n, int k, int target, int[][] memo) {
		if (n == 1 && target <= k) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		if (memo[n][target] != -1) {
			return memo[n][target];
		}
		int rolls = 0;
		for (int i = 1; i <= k; i++) {
			int remains = target - i;
			if (remains > 0) {
				rolls = (rolls + numRollsToTargetRecursion(n - 1, k, remains, memo)) % MOD;
			}
		}
		memo[n][target] = rolls;
		return rolls;
	}
}
