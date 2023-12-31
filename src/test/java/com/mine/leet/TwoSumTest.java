package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class TwoSumTest {

	@Inject
	TwoSum twoSum;

	@Test
	public void test_1() {
		int[] input = new int[]{3, 3};
		int[] result = twoSum.twoSum(input, 6);
		assertThat(result).containsExactlyInAnyOrder(0, 1);
	}

	@Test
	public void test_2() {
		int[] input = new int[]{3, 2, 4};
		int[] result = twoSum.twoSum(input, 6);
		assertThat(result).containsExactlyInAnyOrder(1, 2);
	}

	@Test
	public void test_3() {
		int[] input = new int[]{2, 7, 11, 15};
		int[] result = twoSum.twoSum(input, 9);
		assertThat(result).containsExactlyInAnyOrder(0, 1);
	}
}