package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.LinkedList;

@ApplicationScoped
public class ValidParenthesis {

	public boolean isValid(String s) {
		LinkedList<Character> braces = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			char bracket = s.charAt(i);
			Character popped = braces.peek();
			if (match(bracket, popped)) {
				braces.pop();
			} else {
				braces.push(bracket);
			}
		}
		return braces.isEmpty();
	}

	private boolean match(char bracket, Character popped) {
		return popped != null && popped != bracket && bracket - popped <= 2 && bracket - popped > 0;
	}

}
