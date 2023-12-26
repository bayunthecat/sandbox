package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class NumberOfDiceRollsWithTargetSumTest {

    @Inject
    NumberOfDiceRollsWithTargetSum subject;

    @Test
    void test_1() {
        final var result = subject.numRollsToTarget(2, 6, 7);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void test_2() {
        final var result = subject.numRollsToTarget(3, 6, 8);
        assertThat(result).isEqualTo(21);
    }

    @Test
    void test_3() {
        final var result = subject.numRollsToTarget(3, 6, 150);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test_6() {
        final var result = subject.numRollsToTarget(2, 6, 5);
        assertThat(result).isEqualTo(4);
    }
}