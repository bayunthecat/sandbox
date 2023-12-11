package com.mine.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingTest {

	Counting countingSort = new Counting();

	@Test
	void test() {
		final var result = countingSort.sort(new int[] {1, 4, 2, 0, 7, 1});
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

}