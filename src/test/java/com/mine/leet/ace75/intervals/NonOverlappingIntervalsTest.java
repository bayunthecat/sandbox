package com.mine.leet.ace75.intervals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class NonOverlappingIntervalsTest {

	@Inject
	NonOverlappingIntervals subject;

	@Test
	void test_1() {
		int[][] intervals = new int[][] {
				{1, 2},
				{2, 3},
				{3, 4},
				{1, 3}
		};
		int result = subject.eraseOverlapIntervals(intervals);
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_2() {
		int[][] intervals = new int[][] {
				{1, 2},
				{1, 2},
				{1, 2}
		};
		int result = subject.eraseOverlapIntervals(intervals);
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test_3() {
		int[][] intervals = new int[][] {
				{1, 2},
				{2, 3}
		};
		int result = subject.eraseOverlapIntervals(intervals);
		assertThat(result).isEqualTo(0);
	}
}