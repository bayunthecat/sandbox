package com.mine.leet.ace75.hash;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class UniqueNumberOfOccurrencesTest {

	@Inject
	UniqueNumberOfOccurrences subject;

	@Test
	void test_1() {
		final var result = subject.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
		assertThat(result).isTrue();
	}

	@Test
	void test_2() {
		final var result = subject.uniqueOccurrences(new int[]{1, 2});
		assertThat(result).isFalse();
	}
}