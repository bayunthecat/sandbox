package com.mine.leet.ace75.hash;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class FindTheDifferenceOfTwoArrayTest {

	@Inject
	FindTheDifferenceOfTwoArray subject;

	@Test
	void test() {
		final var result = subject.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
		System.out.println(result);
	}

}