package com.mine.lectures.sort;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class HeapTest {

	@Inject
	Heap heap;

	@Test
	void testHeap_1() {
		final var input = new int[]{1, 4, 2};
		final var result = heap.sort(input);
		assertThat(result).containsExactly(1, 2, 4);
	}

	@Test
	void testHeap_2() {
		final var input = new int[]{12, 11, 13};
		final var result = heap.sort(input);
		assertThat(result).containsExactly(11, 12, 13);
	}

	@Test
	void testHeap_3() {
		final var input = new int[]{1, 4, 2, 0, 7, 1};
		final var result = heap.sort(input);
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}
}