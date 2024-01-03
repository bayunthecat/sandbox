package com.mine.leet.ace75.array;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class CanPlaceFlowersTest {

	@Inject
	CanPlaceFlowers subject;

	@Test
	void test_1() {
		final var result = subject.canPlaceFlowers(new int[]{0, 0, 1, 1, 1, 1}, 1);
		assertThat(result).isTrue();
	}

	@Test
	void test_2() {
		final var result = subject.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 1}, 1);
		assertThat(result).isTrue();
	}

	@Test
	void test_3() {
		final var result = subject.canPlaceFlowers(new int[]{1, 1, 1, 1, 0, 0}, 1);
		assertThat(result).isTrue();
	}

	@Test
	void test_4() {
		final var result = subject.canPlaceFlowers(new int[]{1, 1, 1, 0, 0, 1}, 1);
		assertThat(result).isFalse();
	}

	@Test
	void test_5() {
		final var result = subject.canPlaceFlowers(new int[] {1, 0, 1, 0, 0, 1}, 1);
		assertThat(result).isFalse();
	}

}