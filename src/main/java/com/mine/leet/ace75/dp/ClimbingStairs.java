package com.mine.leet.ace75.dp;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class ClimbingStairs {

	public int minCostClimbingStairs(int[] cost) {
		int[] dp = new int[cost.length + 1];
		Arrays.fill(dp, -1);
		return minCost(cost, cost.length, dp);
	}

	private int minCost(int[] cost, int step, int[] dp) {
		if (step == 1 || step == 0) {
			return cost[step];
		}
		if (dp[step] != -1) {
			return dp[step];
		}
		int stepCost = step >= cost.length ? 0 : cost[step];
		int minusOne = stepCost + minCost(cost, step - 1, dp);
		int minusTwo = stepCost + minCost(cost, step - 2, dp);
		dp[step] = Math.min(minusTwo, minusOne);
		return dp[step];
	}
}
