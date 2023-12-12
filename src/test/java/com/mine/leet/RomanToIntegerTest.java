package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class RomanToIntegerTest {

	@Inject
	RomanToInteger subject;

	@Test
	void test_1() {
		final var result = subject.romanToInt("V");
		assertThat(result).isEqualTo(5);
	}

	@Test
	void test_2() {
		final var result = subject.romanToInt("VI");
		assertThat(result).isEqualTo(6);
	}

	@Test
	void test_3() {
		final var result = subject.romanToInt("IV");
		assertThat(result).isEqualTo(4);
	}

	@Test
	void test_4() {
		final var result = subject.romanToInt("MCMXCIV");
		assertThat(result).isEqualTo(1994);
	}

}