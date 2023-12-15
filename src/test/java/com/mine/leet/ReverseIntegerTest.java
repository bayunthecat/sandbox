package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ReverseIntegerTest {

	@Inject
	ReverseInteger reverseInteger;

	@Test
	void test_1() {
		final var result = reverseInteger.reverse(123);
		assertThat(result).isEqualTo(321);
	}

	@Test
	void test_2() {
		final var result = reverseInteger.reverse(-123);
		assertThat(result).isEqualTo(-321);
	}

	@Test
	void test_3() {
		final var result = reverseInteger.reverse(Integer.MAX_VALUE);
		assertThat(result).isEqualTo(0);
	}

	@Test
	void test_4() {
		final var result = reverseInteger.reverse(Integer.MIN_VALUE);
		assertThat(result).isEqualTo(0);
	}

	@Test
	void test_5() {
		final var result = reverseInteger.reverse(-10);
		assertThat(result).isEqualTo(-1);
	}

	@Test
	void test_6() {
		final var result = reverseInteger.reverse(1534236469);
		assertThat(result).isEqualTo(0);
	}


}