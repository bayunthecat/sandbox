package com.mine.leet.ace75.twopointers;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class IsSubsequenceTest {

	@Inject
	IsSubsequence subject;

	@Test
	void test_1() {
		final var result = subject.isSubsequence("abc", "a1b1c1");
		assertThat(result).isTrue();
	}

	@Test
	void test_2() {
		final var result = subject.isSubsequence("abd", "a1b1c1");
		assertThat(result).isFalse();
	}

}