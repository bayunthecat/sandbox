package com.mine.lectures.sort;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class InsertionTest {

	@Inject
	Insertion insertion;

	@Test
	void testInsertions_1() {
		final var result = insertion.sort(new int[]{1, 4, 2, 0, 7, 1});
		assertThat(result).containsExactly(0, 1, 1, 2, 4, 7);
	}

}