package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MinimumChangesToAlteringBinaryString {

    public int minOperations(String s) {
        int modifications = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    modifications++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    modifications++;
                }
            }
        }
        return Math.min(modifications, s.length() - modifications);
    }

}
