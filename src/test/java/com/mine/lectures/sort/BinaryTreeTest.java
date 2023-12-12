package com.mine.lectures.sort;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BinaryTreeTest {

	@Inject
	BinaryTree tree;

	@Test
	void testTree_1() {
		final var input = new int[]{1, 4, 2, 0, 7, 1};
		final var result = tree.sort(input);
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

	@Test
	void testTree_2() {
		final var input = new int[]{12, 11, 13};
		final var result = tree.sort(input);
		assertThat(result).containsExactly(11, 12, 13);
	}

	@Test
	void testTree_3() {
		final var input = new int[]{1, 4, 2};
		final var result = tree.sort(input);
		assertThat(result).containsExactly(1, 2, 4);
	}
}