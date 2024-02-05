package com.mine.leet.ace75.graph;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class RottingOrangesTest {

	@Inject
	RottingOranges rottingOranges;

	@Test
	void test_1() {
		int[][] grid = new int[][] {
				{2, 1, 1},
				{1, 1, 0},
				{0, 1, 1}
		};
		final var result = rottingOranges.orangesRotting(grid);
		assertEquals(4, result);
	}

	@Test
	void test_2() {
		int[][] grid = new int[][] {
				{2, 1, 1},
				{0, 1, 1},
				{1, 0, 1}
		};
		final var result = rottingOranges.orangesRotting(grid);
		assertEquals(-1, result);
	}

	@Test
	void test_3() {
		int[][] grid = new int[][] {{0, 2}};
		final var result = rottingOranges.orangesRotting(grid);
		assertEquals(0, result);
	}
}