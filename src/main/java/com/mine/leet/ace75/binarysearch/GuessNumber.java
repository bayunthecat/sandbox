package com.mine.leet.ace75.binarysearch;

public class GuessNumber {

	private final int pick;

	public GuessNumber(int pick) {
		this.pick = pick;
	}

	private int guess(int guess) {
		return Integer.compare(pick, guess);
	}

	public int guessNumber(int n) {
		int half, result, from = 1, to = n;
		if (guess(n) == 0) {
			return n;
		}
		do {
			half = from + ((to - from) / 2);
			result = guess(half);
			if (result < 0) {
				to = half;
			} else {
				from = half;
			}
		} while (result != 0);
		return half;
	}
}
