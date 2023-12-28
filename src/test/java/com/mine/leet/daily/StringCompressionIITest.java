package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class StringCompressionIITest {

	@Inject
	StringCompressionII subject;

	@Test
	void test_1() {
		final var result = subject.getLengthOfOptimalCompression("aaabcccd", 2);
		assertThat(result).isEqualTo(4);
	}

}