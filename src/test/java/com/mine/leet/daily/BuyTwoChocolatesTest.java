package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class BuyTwoChocolatesTest {

	@Inject
	BuyTwoChocolates subject;

	@Test
	void test_1() {
		final var result = subject.buyChoco(new int[]{1, 2, 2}, 3);
		assertThat(result).isEqualTo(0);
	}

	@Test
	void test_2() {
		final var result = subject.buyChoco(new int[]{3, 2, 3}, 3);
		assertThat(result).isEqualTo(3);
	}

}