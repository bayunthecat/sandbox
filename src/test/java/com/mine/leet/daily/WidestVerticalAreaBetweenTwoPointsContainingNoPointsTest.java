package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {

	@Inject
	WidestVerticalAreaBetweenTwoPointsContainingNoPoints subject;

	@Test
	void test_1() {
		int[][] points = new int[][] {
				{3, 1},
				{9, 0},
				{1, 0},
				{1, 4},
				{5, 3},
				{8, 8}
		};
		int result = subject.maxWidthOfVerticalArea(points);
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test_2() {
		int[][] points = new int[][] {
				{8, 7},
				{9, 9},
				{7, 4},
				{9, 7}
		};
		int result = subject.maxWidthOfVerticalArea(points);
		assertThat(result).isEqualTo(1);
	}
}