package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReverseVowelsInAString {

	public String reverseVowels(String s) {
		char[] str = s.toCharArray();
		int j = s.length() - 1;
		for (int i = 0; i < j; i++) {
			char front = str[i];
			if (!isVowel(front)) {
				continue;
			}
			for (; j > i; j--) {
				char back = str[j];
				if (isVowel(back)) {
					str[i] = back;
					str[j] = front;
					j--;
					break;
				}
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
