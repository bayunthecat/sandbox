package com.mine.leet.ace75.twopointers;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		int remaining = s.length(), targetIndex = 0;
		char target, source;
		for (int i = 0; i < s.length(); i++) {
			source = s.charAt(i);
			while(targetIndex <= t.length() - 1) {
				target = t.charAt(targetIndex++);
				if (target == source) {
					remaining--;
					break;
				}
			}
		}
		return remaining <= 0;
	}
}
