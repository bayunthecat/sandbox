package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BuyTwoChocolates {

	public int buyChoco(int[] prices, int money) {
		int minTwoSum = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				minTwoSum = Math.min(prices[i] + prices[j], minTwoSum);
			}
		}
		return minTwoSum > money ? money : money - minTwoSum;
	}
}
