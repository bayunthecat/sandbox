package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Bitwise {

	public int findIthBitFromTheEnd(int num, int i) {
		int result = 0;
		int count = 0;
		while (count <= i) {
			result = num & 1;
			count++;
			num = num >> 1;
		}
		return result;
	}
}
