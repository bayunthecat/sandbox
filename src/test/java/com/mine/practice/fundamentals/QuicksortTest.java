package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class QuicksortTest {

	@Inject
	Quicksort quicksort;

	@Test
	void test_1() {
		final var result = quicksort.sort(new int[] {1, 7, 3, 6, 11, 5, 2, 7});
		assertThat(result).containsExactly(1, 2, 3, 5, 6, 7, 7, 11);
	}

}