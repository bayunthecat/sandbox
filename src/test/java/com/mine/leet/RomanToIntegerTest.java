package com.mine.leet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {

    RomanToInteger subject = new RomanToInteger();

    @Test
    void test_1() {
        final var result = subject.romanToInt("V");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void test_2() {
        final var result = subject.romanToInt("VI");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void test_3() {
        final var result = subject.romanToInt("IV");
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test_4() {
        final var result = subject.romanToInt("MCMXCIV");
        assertThat(result).isEqualTo(1994);
    }

}