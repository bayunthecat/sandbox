package com.mine.leet.ace75;

import com.mine.leet.ace75.array.MergeStringsAlternately;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MergeStringsAlternatelyTest {

	@Inject
	MergeStringsAlternately subject;

	@Test
	void test_1() {
		final var result = subject.mergeAlternately("abc", "xyz");
		assertThat(result).isEqualTo("axbycz");
	}

	@Test
	void test_2() {
		final var result = subject.mergeAlternately("abcdef", "xyz");
		assertThat(result).isEqualTo("axbyczdef");
	}

	@Test
	void test_3() {
		final var result = subject.mergeAlternately("abc", "xyzdef");
		assertThat(result).isEqualTo("axbyczdef");
	}

	@Test
	void test_4() {
		final var result = subject.mergeAlternately("", "xyzdef");
		assertThat(result).isEqualTo("xyzdef");
	}

	@Test
	void test_5() {
		final var result = subject.mergeAlternately("xyzdef", "");
		assertThat(result).isEqualTo("xyzdef");
	}

	@Test
	void test_6() {
		final var result = subject.mergeAlternately("", "");
		assertThat(result).isEqualTo("");
	}
}