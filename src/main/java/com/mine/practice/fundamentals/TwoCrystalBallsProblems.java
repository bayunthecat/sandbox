package com.mine.practice.fundamentals;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TwoCrystalBallsProblems {

	public int breaks(boolean[] breaks) {
		int step = (int) Math.floor(Math.sqrt(breaks.length));
		int i = step;
		for (; i < breaks.length; i += step) {
			if (breaks[i]) {
				break;
			}
		}
		i -= step;
		for (; i < i + step && i < breaks.length; i++) {
			if (breaks[i]) {
				return i;
			}
		}
		return -1;
	}
}
