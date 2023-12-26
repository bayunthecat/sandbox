package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class DecodeWays {

    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return decode(s, 0, memo);
    }

    private int decode(String s, int index, int[] memo) {
        if (index == s.length()) {
            return 1;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        int ways = decode(s, index + 1, memo);
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += decode(s, index + 2, memo);
        }
        memo[index] = ways;
        return ways;
    }
}
