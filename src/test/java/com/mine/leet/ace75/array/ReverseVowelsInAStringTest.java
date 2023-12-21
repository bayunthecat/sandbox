package com.mine.leet.ace75.array;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@QuarkusTest
class ReverseVowelsInAStringTest {

	@Inject
	ReverseVowelsInAString reverseVowelsInAString;

	@Test
	void test_1() {
		final var result = reverseVowelsInAString.reverseVowels("hello");
		assertThat(result).isEqualTo("holle");
	}

	@Test
	void test_2() {
		final var result = reverseVowelsInAString.reverseVowels("leetcode");
		assertThat(result).isEqualTo("leotcede");
	}

	@Test
	void test_3() {
		final var result = reverseVowelsInAString.reverseVowels("aouieo");
		assertThat(result).isEqualTo("oeiuoa");
	}

	@Test
	void test_4() {
		final var result = reverseVowelsInAString.reverseVowels("aA");
		assertThat(result).isEqualTo("Aa");
	}

	@Test
	void test_5() {
		final var result = reverseVowelsInAString.reverseVowels(".,");
		assertThat(result).isEqualTo(".,");
	}



}