package com.mine.lectures;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class KarpRabinTest {

	@Inject
	KarpRabin karpRabin;

	@Test
	void testMatch_1() {
		final var result = karpRabin.contains("abcdefghasdbwlbhvurdjbvliurbfha", "bcde");
		assertThat(result).isTrue();
	}

	@Test
	void testMatch_2() {
		final var result = karpRabin.contains("abcdefghasdbwlbhvurdjbvliurbfha", "vurd");
		assertThat(result).isTrue();
	}

	@Test
	void testMatch_3() {
		final var result = karpRabin.contains("abcdefghasdbwlbhvurdjbvliurbfha", "abcd");
		assertThat(result).isTrue();
	}

	@Test
	void testMatch_4() {
		final var result = karpRabin.contains("abcdefghasdbwlbhvurdjbvliurbfha", "bfha");
		assertThat(result).isTrue();
	}

	@Test
	void testNotMatch() {
		final var result = karpRabin.contains("abcdefghasdbwlbhvurdjbvliurbfha", "zxcvb");
		assertThat(result).isFalse();
	}

	@Test
	void test10mb() {
		final var input10Mb = generate10Mb();
		Instant start = Instant.now();
		String pattern = "unlikely string";
		final var result = karpRabin.contains(input10Mb, pattern);
		System.out.println("10mb search took " + Duration.between(start, Instant.now()).toMillis() + "ms, contains " + pattern + ": " + result);
	}

	private String generate10Mb() {
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		for (long i = 0; i < 10_000_000; i++) {
			builder.append((char) random.nextInt(64, 123));
		}
		return builder.toString();
	}

}