package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BitwiseTest {

	@Inject
	Bitwise subject;

	@Test
	void test_1() {
		final var result = subject.findIthBitFromTheEnd(10, 1);
		assertThat(result).isEqualTo(1);
	}
}