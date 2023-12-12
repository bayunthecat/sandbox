package com.mine.lectures;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class PeakFinderTest {

	@Inject
	PeakFinder subject;

	@Test
	void test_1_1() {
		assertThat(subject.findAPeakRecursive(new int[]{-1, 2, 3, 7, 11, 3, 2, -1, -11})).isEqualTo(4);
	}

	@Test
	void test_1_2() {
		assertThat(subject.findAPeakRecursive(new int[]{-1, 11, 10, 9, 8, 7, 6, 5, -11})).isEqualTo(1);
	}

	@Test
	void test_1_3() {
		assertThat(subject.findAPeakRecursive(new int[]{4, 3, 2, 1, 0, -1, -2, -3, -4})).isEqualTo(0);
	}

	@Test
	void test_1_4() {
		assertThat(subject.findAPeakRecursive(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4})).isEqualTo(8);
	}

	@Test
	void test_1_5() {
		assertThat(subject.findAPeakRecursive(new int[]{-4, -3, -2, -1, 0, 1, 6, 3, 4})).isEqualTo(6);
	}

	@Test
	void test_2_1() {
		assertThat(subject.findAPeakCycle(new int[]{-1, 2, 3, 7, 11, 3, 2, -1, -11})).isEqualTo(4);
	}

	@Test
	void test_2_2() {
		assertThat(subject.findAPeakCycle(new int[]{-1, 11, 10, 9, 8, 7, 6, 5, -11})).isEqualTo(1);
	}

	@Test
	void test_2_3() {
		assertThat(subject.findAPeakCycle(new int[]{4, 3, 2, 1, 0, -1, -2, -3, -4})).isEqualTo(0);
	}

	@Test
	void test_2_4() {
		assertThat(subject.findAPeakCycle(new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4})).isEqualTo(8);
	}

	@Test
	void test_2_5() {
		assertThat(subject.findAPeakCycle(new int[]{-4, -3, -2, -1, 0, 1, 6, 3, 4})).isEqualTo(6);
	}

	@Test
	void test2d_1() {
		int[][] array = new int[][]{
				{0, 0, 0, 0, 0},
				{0, 1, 1, 1, 0},
				{0, 1, 2, 1, 0},
				{0, 1, 1, 1, 0},
				{0, 0, 0, 0, 0}
		};
		assertThat(subject.findAPeak(array)).containsExactly(2, 2);
	}

	@Test
	void test2d_2() {
		int[][] array = new int[][]{
				{0, 0, 0, 0, 0},
				{1, 3, 2, 1, 0},
				{4, 3, 2, 1, 0},
				{1, 3, 2, 1, 0},
				{0, 0, 0, 0, 0}
		};
		assertThat(subject.findAPeak(array)).containsExactly(2, 0);
	}

}