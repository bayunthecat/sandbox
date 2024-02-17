package com.mine.leet.ace75.dp;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BestTimeToBuyAndSellStockWithFeeTest {

	@Inject
	BestTimeToBuyAndSellStockWithFee subject;

	@Test
	void test_1() {
		final var result = subject.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2);
		assertThat(result).isEqualTo(8);
	}
}