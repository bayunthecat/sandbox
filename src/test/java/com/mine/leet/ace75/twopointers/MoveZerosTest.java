package com.mine.leet.ace75.twopointers;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MoveZerosTest {

	@Inject
	MoveZeros moveZeros;

	@Test
	void test_1() {
		int[] input = new int[]{0, 1, 0, 3, 12};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(1, 3, 12, 0, 0);
	}

	@Test
	void test_2() {
		int[] input = new int[]{0, 1};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(1, 0);
	}

	@Test
	void test_3() {
		int[] input = new int[]{1, 0, 0};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(1, 0, 0);
	}

	@Test
	void test_4() {
		int[] input = new int[]{0, 0, 1};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(1, 0, 0);
	}

	@Test
	void test_5() {
		int[] input = new int[]{0};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(0);
	}

	@Test
	void test_6() {
		int[] input = new int[]{1};
		moveZeros.moveZeroes(input);
		assertThat(input).containsExactly(1);
	}

}