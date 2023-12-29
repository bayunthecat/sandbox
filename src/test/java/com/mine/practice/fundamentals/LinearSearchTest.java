package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class LinearSearchTest {

	@Inject
	LinearSearch subject;

	@Test
	void test_1() {
		final var result = subject.indexOf(new int[]{4, 5, 1, 8, 7, 11, 12, 3, 7}, 7);
		assertThat(result).isEqualTo(4);
	}

	@Test
	void test_2() {
		final var result = subject.indexOf(new int[]{4, 5, 1, 8, 7, 11, 12, 3, 7}, 21);
		assertThat(result).isEqualTo(-1);
	}
}