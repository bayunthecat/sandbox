package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BubbleSortTest {

	@Inject
	BubbleSort subject;

	@Test
	void test_1() {
		final var result = subject.sort(new int[] {1, 3, 7, 4, 2});
		assertThat(result).containsExactly(1, 2, 3, 4, 7);
	}
}