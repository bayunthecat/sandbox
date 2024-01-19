package com.mine.leet.ace75.array;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class IncreasingTripletSubsequenceTest {

	@Inject
	IncreasingTripletSubsequence subject;

	@Test
	void test_1() {
		assertThat(subject.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isTrue();
	}

	@Test
	void test_2() {
		assertThat(subject.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isFalse();
	}

	@Test
	void test_3() {
		assertThat(subject.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isTrue();
	}
}