package com.mine.leet.ace75.bit;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CountingBitsTest {

	@Inject
	CountingBits subject;

	@Test
	void test_1() {
		final var result = subject.countBits(2);
		assertThat(result).containsExactly(0, 1, 1);
	}

	@Test
	void test_2() {
		final var result = subject.countBits(5);
		assertThat(result).containsExactly(0, 1, 1, 2, 1, 2);
	}

}