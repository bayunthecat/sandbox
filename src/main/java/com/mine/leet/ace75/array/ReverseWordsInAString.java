package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReverseWordsInAString {

    public String reverseWords(String s) {
        final String[] split = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (!"".equals(split[i])) {
                result.append(split[i]);
            } else {
                continue;
            }
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
