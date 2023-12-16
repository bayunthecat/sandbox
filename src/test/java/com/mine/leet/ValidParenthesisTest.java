package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ValidParenthesisTest {

	@Inject
	ValidParenthesis validParenthesis;

	@Test
	void test_1() {
		final var result = validParenthesis.isValid("{[(([{}]))]}");
		assertThat(result).isTrue();
	}

	@Test
	void test_2() {
		final var result = validParenthesis.isValid("{[([{}]))]}");
		assertThat(result).isFalse();
	}

	@Test
	void test_3() {
		final var result = validParenthesis.isValid("(){}}{");
		assertThat(result).isFalse();
	}
}