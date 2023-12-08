package com.mine.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortsTest {

	Sorts sorts = new Sorts();

	@Test
	void testInsertions_1() {
		final var result = sorts.insertion(new int[]{1, 4, 2, 0, 7, 1});
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

	@Test
	void testMerge_1() {
		final var result = sorts.merge(new int[]{1, 4, 2, 0, 7, 1});
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

	@Test
	void testHeapify_1() {
		final var input = new int[]{1, 4, 2};
		sorts.heapify(input, 0);
		assertThat(input[0]).isEqualTo(4);
	}

	@Test
	void testHeapify_2() {
		final var input = new int[]{12, 11, 13};
		sorts.heapify(input, 0);
		assertThat(input[0]).isEqualTo(13);
	}

}