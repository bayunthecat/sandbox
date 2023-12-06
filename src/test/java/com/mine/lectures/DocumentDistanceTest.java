package com.mine.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DocumentDistanceTest {

	DocumentDistance distance = new DocumentDistance();

	@Test
	void test() {
		final var result = distance.distance("Eat shit", "Drink shit");
		assertThat(result).isEqualTo(0.5);
	}

}