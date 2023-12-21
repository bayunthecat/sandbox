package com.mine.leet.ace75.binarysearch;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class FindPeakElementTest {

	@Inject
	FindPeakElement subject;

	@Test
	void test_1_1() {
		assertThat(subject.findPeakElement(new int[]{-1, 2, 3, 7, 11, 3, 2, -1, -11})).isEqualTo(4);
	}

	@Test
	void test_1_2() {
		assertThat(subject.findPeakElement(new int[]{-1, 11, 10, 9, 8, 7, 6, 5, -11})).isEqualTo(1);
	}

	@Test
	void test_1_3() {
		assertThat(subject.findPeakElement(new int[]{4, 3, 2, 1, 0, -1, -2, -3, -4})).isEqualTo(0);
	}

}