package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MaximumScoreAfterSplittingAStringTest {

	@Inject
	MaximumScoreAfterSplittingAString subject;

	@Test
	void test_1() {
		final var result = subject.maxScore("011101");
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test_2() {
		final var result = subject.maxScore("00111");
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test_3() {
		final var result = subject.maxScore("1111");
		assertThat(result).isEqualTo(3);
	}

	@Test
	void test_4() {
		final var result = subject.maxScore("00");
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_5() {
		final var result = subject.maxScore("0100");
		assertThat(result).isEqualTo(2);
	}

}