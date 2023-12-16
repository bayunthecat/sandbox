package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class ValidAnagramTest {

	@Inject
	ValidAnagram validAnagram;

	@Test
	void test_1() {
		final var result = validAnagram.isAnagram("anagram", "nagaram");
		assertThat(result).isTrue();
	}

	@Test
	void test_2() {
		final var result = validAnagram.isAnagram("car", "cat");
		assertThat(result).isFalse();
	}

	@Test
	void test_3() {
		final var result = validAnagram.isAnagram("ac", "bb");
		assertThat(result).isFalse();
	}
}