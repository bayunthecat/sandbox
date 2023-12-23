package com.mine.leet.ace75.array;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class GreatestCommonDivisorOfStringsTest {

    @Inject
    GreatestCommonDivisorOfStrings subject;

    @Test
    void test_1() {
        final var result = subject.gcdOfStrings("ABCABC", "ABC");
        assertThat(result).isEqualTo("ABC");
    }

    @Test
    void test_2() {
        final var result = subject.gcdOfStrings("ABABAB", "AB");
        assertThat(result).isEqualTo("AB");
    }

    @Test
    void test_3() {
        final var result = subject.gcdOfStrings("ABABAB", "ABAB");
        assertThat(result).isEqualTo("AB");
    }

}