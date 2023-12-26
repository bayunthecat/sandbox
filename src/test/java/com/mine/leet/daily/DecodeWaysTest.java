package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class DecodeWaysTest {

    @Inject
    DecodeWays subject;

    @Test
    void test_1() {
        final var result = subject.numDecodings("12");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test_2() {
        final var result = subject.numDecodings("226");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void test_3() {
        final var result = subject.numDecodings("06");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test_4() {
        final var result = subject.numDecodings("110612");
        assertThat(result).isEqualTo(8);
    }

    @Test
    void test_5() {
        final var result = subject.numDecodings("111111111111111111111111111111111111111111111");
        assertThat(result).isEqualTo(1836311903);
    }

}