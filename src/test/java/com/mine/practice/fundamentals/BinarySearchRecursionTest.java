package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BinarySearchRecursionTest {

	@Inject
	BinarySearchRecursion binarySearchRecursion;

	@Test
	void test_1() {
		final var result = binarySearchRecursion.indexOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 7);
		assertThat(result).isEqualTo(6);
	}

	@Test
	void test_2() {
		final var result = binarySearchRecursion.indexOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, 40);
		assertThat(result).isEqualTo(-1);
	}
}