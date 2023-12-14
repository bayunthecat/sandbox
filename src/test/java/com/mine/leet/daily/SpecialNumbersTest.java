package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class SpecialNumbersTest {

	@Inject
	SpecialNumbers specialNumbers;

	@Test
	void test_1() {
		int[][] input = new int[][]{
				{1, 0, 0},
				{0, 0, 1},
				{1, 0, 0}};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_2() {
		int[][] input = new int[][]{
				{1, 0, 0},
				{0, 1, 0},
				{0, 0, 1}};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test_3() {
		int[][] input = new int[][]{
				{1, 1, 0},
				{0, 0, 0},
				{0, 0, 0}};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(0);
	}

	@Test
	void test_4() {
		int[][] input = new int[][]{
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(0);
	}

	@Test
	void test_5() {
		int[][] input = new int[][]{
				{0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 1},
				{0, 0, 0, 0, 1, 0, 0, 0},
				{1, 0, 0, 0, 1, 0, 0, 0},
				{0, 0, 1, 1, 0, 0, 0, 0}
		};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_6() {
		int[][] input = new int[][]{
				{1, 0, 0, 0},
				{0, 1, 1, 0},
				{0, 1, 1, 0},
				{0, 0, 0, 1}
		};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(2);
	}

	@Test
	void test_7() {
		int[][] input = new int[][]{
				{0, 0, 0, 0},
				{1, 0, 1, 0},
				{0, 1, 0, 0},
				{0, 1, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 1, 0, 0}
		};
		final var result = specialNumbers.numSpecial(input);
		assertThat(result).isEqualTo(0);
	}
}