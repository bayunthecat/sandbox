package com.mine.leet.ace75.heap;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class KthLargestTest {

	@Inject
	KthLargest kthLargest;

	@Test
	void test_1() {
		final var result = kthLargest.kthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2);
		assertThat(result).isEqualTo(5);
	}
}