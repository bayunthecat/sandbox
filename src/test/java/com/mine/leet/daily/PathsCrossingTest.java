package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class PathsCrossingTest {

    @Inject
    PathsCrossing subject;

    @Test
    void test_1() {
        final var result = subject.isPathCrossing("NES");
        assertThat(result).isEqualTo(false);
    }

    @Test
    void test_2() {
        final var result = subject.isPathCrossing("NESWW");
        assertThat(result).isEqualTo(true);
    }

    @Test
    void test_3() {
        final var result = subject.isPathCrossing("NEENWW");
        assertThat(result).isEqualTo(false);
    }

}