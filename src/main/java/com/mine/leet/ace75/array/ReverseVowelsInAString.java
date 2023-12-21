package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReverseVowelsInAString {

	public String reverseVowels(String s) {
		char[] str = s.toCharArray();
		int j = s.length() - 1;
		int i = 0;
		while (i < j) {
			while (!isVowel(str[i]) && i < j) {
				i++;
			}
			while (!isVowel(str[j]) && j > i) {
				j--;
			}
			if (i < j) {
				char tmp = str[i];
				str[i] = str[j];
				str[j] = tmp;
				i++;
				j--;
			}
		}
		return new String(str);
	}

	private boolean isVowel(char c) {
		return switch (c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				yield true;
			default:
				yield false;
		};
	}
}
