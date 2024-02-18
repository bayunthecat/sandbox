package com.mine.leet.ace75.dp;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class DominoAndTrominoTilingsTest {

	@Inject
	DominoAndTrominoTilings subject;

	@Test
	void test_1() {
		var result = subject.numTilings(4);
		assertThat(result).isEqualTo(11);
	}

	@Test
	void test_2() {
		var result = subject.numTilings(30);
		assertThat(result).isEqualTo(312342182);
	}

	@Test
	void test_3() {
		var result = subject.numTilings(60);
		assertThat(result).isEqualTo(882347204);
	}
}