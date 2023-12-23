package com.mine.leet.ace75.array;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str2 + str1).equals(str1 + str2)) {
            return "";
        }
        int gdc = gcd(str1.length(), str2.length());
        return str1.substring(0, gdc);
    }

    private int gcd(int number, int another) {
        int nextNumber = number, nextAnother = another, mod, max, min;
        do {
            max = Math.max(nextNumber, nextAnother);
            min = Math.min(nextNumber, nextAnother);
            mod = max % min;
            nextNumber = mod;
            nextAnother = min;
        } while (mod != 0);
        return min;
    }

}
