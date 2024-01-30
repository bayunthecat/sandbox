package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class GraphBreadthAdjacencyTest {

	@Inject
	GraphBreadthAdjacency subject;

	@Test
	void test_1() {
		int[][] adjacency = new int[][]{
				{0, 1, 1, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0},
				{0, 0, 0, 0, 1},
				{0, 0, 0, 0, 0}
		};
		List<Integer> result = subject.bfs(adjacency, 0, 4);
		assertEquals(Arrays.asList(0, 3, 4), result);
	}
}