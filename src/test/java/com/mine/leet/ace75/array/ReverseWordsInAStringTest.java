package com.mine.leet.ace75.array;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class ReverseWordsInAStringTest {

    @Inject
    ReverseWordsInAString subject;

    @Test
    void test_1() {
        final var result = subject.reverseWords("the sky is blue");
        assertThat(result).isEqualTo("blue is sky the");
    }

    @Test
    void test_2() {
        final var result = subject.reverseWords("  hello  world  ");
        assertThat(result).isEqualTo("world hello");
    }

}