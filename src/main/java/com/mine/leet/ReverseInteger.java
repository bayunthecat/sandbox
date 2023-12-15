package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReverseInteger {

	public int reverse(int x) {
		int result = 0;
		int next = x;
		do {
			int fraction = next % 10;
			next = next / 10;
			result = result * 10 + fraction;
			if (result % 10 != fraction) {
				return 0;
			}
		} while (next != 0);
		return result;
	}

}
