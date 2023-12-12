package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RomanToInteger {

    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param s roman numeral
     * @return integer converted from provided value
     */
    public int romanToInt(String s) {
        int result = 0, previousFaceValue = Integer.MIN_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = faceValue(c);
            if (previousFaceValue <= value) {
                result += value;
            } else {
                result -= value;
            }
            previousFaceValue = value;
        }
        return result;
    }

    private int faceValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}
