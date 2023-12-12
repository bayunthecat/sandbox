package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0, current = x;
        while (current != 0) {
            reversed *= 10;
            reversed += (current % 10);
            current = current / 10;
        }
        return x == reversed;
    }
}
