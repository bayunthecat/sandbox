package com.mine.lectures.sort;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CountingTest {

	@Inject
	Counting countingSort;

	@Test
	void test_1() {
		final var result = countingSort.sort(new int[]{1, 4, 2, 0, 7, 1}, 7);
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

	@Test
	void test_2() {
		final var result = countingSort.sort(new int[]{9, 8, 7, 7, 6, 5, 4, 3, 3, 3, 2, 1, 0}, 9);
		assertThat(result).containsExactly(0, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 9);
	}

	@Test
	void testAlt() {
		final var result = countingSort.sortAlt(new int[]{1, 4, 2, 0, 7, 1});
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

}