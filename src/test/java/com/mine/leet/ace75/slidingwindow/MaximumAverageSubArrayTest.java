package com.mine.leet.ace75.slidingwindow;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MaximumAverageSubArrayTest {

	@Inject
	MaximumAverageSubArray subject;

	@Test
	void test_1() {
		final var result = subject.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
		assertThat(result).isEqualTo(12.75);
	}
}