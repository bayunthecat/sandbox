package com.mine.leet.ace75.mono;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class DailyTemperaturesTest {

	@Inject
	DailyTemperatures subject;

	@Test
	void test_1() {
		int[] result = subject.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
		assertThat(result).containsExactly(1, 1, 4, 2, 1, 1, 0, 0);
	}
}