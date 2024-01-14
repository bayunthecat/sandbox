package com.mine.leet.ace75.bit;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CountingBits {

	public int[] countBits(int n) {
		int[] bits = new int[n + 1];
		int offset = 1;
		for (int i = 1; i <= n; i++) {
			if (i == offset * 2) {
				offset = i;
			}
			bits[i] = 1 + bits[i - offset];
		}
		return bits;
	}
}
