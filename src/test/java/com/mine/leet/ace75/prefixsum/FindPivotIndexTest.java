package com.mine.leet.ace75.prefixsum;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class FindPivotIndexTest {

	@Inject
	FindPivotIndex subject;

	@Test
	void test_1() {
		int result = subject.pivotIndex(new int[] {1, 7, 3, 6, 5, 6});
		assertThat(result).isEqualTo(3);
	}
}