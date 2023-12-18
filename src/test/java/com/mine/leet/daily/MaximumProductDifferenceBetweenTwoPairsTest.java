package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MaximumProductDifferenceBetweenTwoPairsTest {

	@Inject
	MaximumProductDifferenceBetweenTwoPairs subject;

	@Test
	void test_1() {
		final var result = subject.maxProductDifference(new int[]{5, 6, 2, 7, 4});
		assertThat(result).isEqualTo(34);
	}

	@Test
	void test_2() {
		final var result = subject.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8});
		assertThat(result).isEqualTo(64);
	}

}