package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MaxSumOfKElementsTest {

	@Inject
	MaxSumOfKElements subject;

	@Test
	void test_1() {
		final var result = subject.maxSum(new int[] {-7, 1, 4, 6, 2, 11}, 3);
		assertThat(result).isEqualTo(21);
	}
}