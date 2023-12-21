package com.mine.leet.ace75.hash;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class FindTheDifferenceOfTwoArrayTest {

	@Inject
	FindTheDifferenceOfTwoArray subject;

	@Test
	void test() {
		final var result = subject.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
		assertThat(result.get(0)).containsExactlyInAnyOrder(1, 3);
		assertThat(result.get(1)).containsExactlyInAnyOrder(4, 6);
	}

}