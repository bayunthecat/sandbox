package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class PalindromeNumberTest {

	@Inject
	PalindromeNumber subject;

	@Test
	void test_1() {
		assertThat(subject.isPalindrome(121)).isTrue();
	}

	@Test
	void test_2() {
		assertThat(subject.isPalindrome(-121)).isFalse();
	}

	@Test
	void test_3() {
		assertThat(subject.isPalindrome(123456)).isFalse();
	}

	@Test
	void test_4() {
		assertThat(subject.isPalindrome(123321)).isTrue();
	}

	@Test
	void test_6() {
		assertThat(subject.isPalindrome(12321)).isTrue();
	}

}