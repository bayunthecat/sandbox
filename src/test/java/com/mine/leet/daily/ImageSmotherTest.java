package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@QuarkusTest
class ImageSmotherTest {

	@Inject
	ImageSmother imageSmother;

	@Test
	void test_1() {
		int[][] input = new int[][]{
				{100, 200, 100},
				{200, 50, 200},
				{100, 200, 100}
		};
		int[][] expected = new int[][]{
				{137, 141, 137},
				{141, 138, 141},
				{137, 141, 137}
		};
		final var output = imageSmother.imageSmoother(input);
		assertArray(output, expected);
	}

	private void assertArray(int[][] output, int[][] expected) {
		for (int i = 0; i < output.length; i++) {
			assertThat(output[i]).containsExactly(expected[i]);
		}
	}
}