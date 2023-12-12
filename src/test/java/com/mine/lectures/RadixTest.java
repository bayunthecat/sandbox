package com.mine.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RadixTest {

	Radix radix = new Radix();

	@Test
	void test_1() {
		int[] output = radix.sort(new int[] {170, 45, 75, 90, 802, 24, 2, 66}, 802);
		assertThat(output).containsExactly(2, 24, 45, 66, 75, 90, 170, 802);
	}

}