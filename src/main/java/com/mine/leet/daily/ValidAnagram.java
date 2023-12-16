package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			count.compute(s.charAt(i), (key, value) -> value != null ? value + 1 : 1);
		}
		for (int i = 0; i < t.length(); i++) {
			count.compute(t.charAt(i), (key, value) -> value == null ? -1 : value - 1);
		}
		return count.entrySet().stream().filter(entry -> entry.getValue() != 0).findAny().isEmpty();
	}
}
