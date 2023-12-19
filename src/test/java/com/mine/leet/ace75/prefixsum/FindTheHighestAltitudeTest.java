package com.mine.leet.ace75.prefixsum;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class FindTheHighestAltitudeTest {

	@Inject
	FindTheHighestAltitude subject;

	@Test
	void test_1() {
		final var result = subject.largestAltitude(new int[] {-5, 1, 5, 0, -7});
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_2() {
		final var result = subject.largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2});
		assertThat(result).isEqualTo(0);
	}

}