package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int remaining = n, flower, previous, next;
		for (int i = 0; i < flowerbed.length; i++) {
			flower = flowerbed[i];
			if (flower == 0) {
				if (i == 0) {
					previous = 0;
				} else {
					previous = flowerbed[i - 1];
				}
				if (i == flowerbed.length - 1) {
					next = 0;
				} else {
					next = flowerbed[i + 1];
				}
				if (previous == 0 && next == 0) {
					remaining--;
					i++;
				}
			}
		}
		return remaining <= 0;
	}
}
