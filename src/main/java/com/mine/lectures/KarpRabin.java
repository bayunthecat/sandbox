package com.mine.lectures;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KarpRabin {

	public boolean contains(String input, String pattern) {
		if (input.length() < pattern.length()) {
			return false;
		}
		int patternHash = hash(pattern);
		String first = input.substring(0, pattern.length());
		int rollingHash = hash(first);
		if (rollingHash == patternHash && first.equals(pattern)) {
			return true;
		}
		for (int i = 0; i < input.length() - pattern.length(); i++) {
			rollingHash = rollingHash(rollingHash, input.charAt(i), input.charAt(i + pattern.length()));
			if (rollingHash == patternHash && pattern.equals(input.substring(i + 1, i + 1 + pattern.length()))) {
				return true;
			}
		}
		return false;
	}

	private int hash(String input) {
		int result = 0;
		for (int i = 0; i < input.length(); i++) {
			result += hash(input.charAt(i));
		}
		return result;
	}

	private int hash(char c) {
		return c;
	}

	private int rollingHash(int previous, char remove, char append) {
		return previous - hash(remove) + hash(append);
	}

}