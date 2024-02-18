package com.mine.leet.ace75.dp;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class DominoAndTrominoTilings {

	private static final int MOD = 1_000_000_007;

	public int numTilings(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		long result = tilings(0, n, Gap.NO, memo);
		return (int) (result % MOD);
	}

	private int tilings(int column, int target, Gap gap, int[] memo) {
		if (column == target && gap == Gap.NO) {
			return 1;
		}
		if (column > target) {
			return 0;
		}
		if (memo[column] != -1 && gap == Gap.NO) {
			return memo[column];
		}
		long num = 0;
		if (gap == Gap.TOP) {
			num += tilings(column + 1, target, Gap.BOTTOM, memo);
			num += tilings(column + 1, target, Gap.NO, memo);
		} else if (gap == Gap.BOTTOM) {
			num += tilings(column + 1, target, Gap.TOP, memo);
			num += tilings(column + 1, target, Gap.NO, memo);
		} else {
			num += tilings(column + 1, target, Gap.NO, memo);
			num += tilings(column + 2, target, Gap.NO, memo);
			num += tilings(column + 2, target, Gap.TOP, memo);
			num += tilings(column + 2, target, Gap.BOTTOM, memo);
			memo[column] = (int) (num % MOD);
		}
		return (int)(num % MOD);
	}

	private enum Gap {
		NO,
		TOP,
		BOTTOM
	}
}
