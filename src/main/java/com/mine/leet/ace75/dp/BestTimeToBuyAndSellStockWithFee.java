package com.mine.leet.ace75.dp;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BestTimeToBuyAndSellStockWithFee {

	public int maxProfit(int[] prices, int fee) {
		int buy = Integer.MIN_VALUE;
		int sell = 0;
		for (int price : prices) {
			buy = Math.max(buy, sell - price);
			sell = Math.max(sell, buy + price - fee);
		}
		return sell;
	}
}
