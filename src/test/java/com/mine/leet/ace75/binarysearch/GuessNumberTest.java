package com.mine.leet.ace75.binarysearch;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class GuessNumberTest {

	@Test
	void test_1() {
		GuessNumber guessNumber = new GuessNumber(6);
		final var result = guessNumber.guessNumber(10);
		assertThat(result).isEqualTo(6);
	}

	@Test
	void test_2() {
		GuessNumber guessNumber = new GuessNumber(10);
		final var result = guessNumber.guessNumber(10);
		assertThat(result).isEqualTo(10);
	}

	@Test
	void test_3() {
		GuessNumber guessNumber = new GuessNumber(0);
		final var result = guessNumber.guessNumber(0);
		assertThat(result).isEqualTo(0);
	}

}