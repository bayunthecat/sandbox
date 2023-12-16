package com.mine.leet;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class ZigZagConversionTest {

	@Inject
	ZigZagConversion subject;

	@Test
	void test_1() {
		final var result = subject.convert("PAYPALISHIRING", 3);
		assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
	}

	@Test
	void test_2() {
		final var result = subject.convert("PAYPALISHIRING", 5);
		assertThat(result).isEqualTo("PHASIYIRPLIGAN");
	}

	@Test
	void test_3() {
		final var result = subject.convert("PAYPALISHIRING", 4);
		assertThat(result).isEqualTo("PINALSIGYAHRPI");
	}

	@Test
	void test_4() {
		final var result = subject.convert("A", 1);
		assertThat(result).isEqualTo("A");
	}
}