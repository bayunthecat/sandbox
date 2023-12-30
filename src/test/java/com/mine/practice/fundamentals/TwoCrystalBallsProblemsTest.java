package com.mine.practice.fundamentals;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class TwoCrystalBallsProblemsTest {

	@Inject
	TwoCrystalBallsProblems subject;

	@Test
	void test_1() {
		final var result = subject.breaks(generateInput(100));
		assertThat(result).isEqualTo(100);
	}

	@Test
	void test_2() {
		final var result = subject.breaks(generateInput(4));
		assertThat(result).isEqualTo(4);
	}

	@Test
	void test_3() {
		final var result = subject.breaks(new boolean[] {false, true});
		assertThat(result).isEqualTo(1);
	}

	@Test
	void test_4() {
		final var result = subject.breaks(new boolean[] {false, false, false, false});
		assertThat(result).isEqualTo(-1);
	}

	private boolean[] generateInput(int index) {
		final var random = new Random();
		int height = random.nextInt(index + 1, index * index);
		boolean[] breaks = new boolean[height];
		for (int i = 0; i < height; i++) {
			if (i >= index) {
				breaks[i] = true;
			}
		}
		return breaks;
	}
}