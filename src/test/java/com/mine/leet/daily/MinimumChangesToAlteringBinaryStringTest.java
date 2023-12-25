package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class MinimumChangesToAlteringBinaryStringTest {

    @Inject
    MinimumChangesToAlteringBinaryString subject;

    @Test
    void test_1() {
        final var result = subject.minOperations("0100");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test_2() {
        final var result = subject.minOperations("1111");
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test_3() {
        final var result = subject.minOperations("10");
        assertThat(result).isEqualTo(2);
    }

}