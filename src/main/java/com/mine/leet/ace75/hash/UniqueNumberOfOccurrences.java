package com.mine.leet.ace75.hash;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ApplicationScoped
public class UniqueNumberOfOccurrences {

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> occurrences = new HashMap<>();
		for (int j : arr) {
			occurrences.compute(j, (key, value) -> {
				if (value == null) {
					return 1;
				}
				return value + 1;
			});
		}
		Set<Integer> uniqueNumberOfOccurrences = new HashSet<>();
		for (Integer value : occurrences.values()) {
			if (!uniqueNumberOfOccurrences.add(value)) {
				return false;
			}
		}
		return true;
	}
}
