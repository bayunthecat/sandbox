package com.mine.leet.ace75;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {
		int i = 0;
		StringBuilder builder = new StringBuilder();
		while (i < word1.length() && i < word2.length()) {
			builder.append(word1.charAt(i));
			builder.append(word2.charAt(i));
			i++;
		}
		while (i < word1.length()) {
			builder.append(word1.charAt(i));
			i++;
		}
		while (i < word2.length()) {
			builder.append(word2.charAt(i));
			i++;
		}
		return builder.toString();
	}
}
