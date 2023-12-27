package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MinimumTimeToMakeRopeColorfulTest {

	@Inject
	MinimumTimeToMakeRopeColorful subject;

	@Test
	void test_1() {
		final var result = subject.minCost("aabaa", new int[]{1, 2, 3, 4, 1});
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test_2() {
		final var result = subject.minCost("abaac", new int[]{1, 2, 3, 4, 5});
		assertThat(result).isEqualTo(3);
	}

}