package com.mine.leet.daily;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@QuarkusTest
class DifferenceBetweenOnesAndZerosInRowAndColumnTest {

    @Inject
    DifferenceBetweenOnesAndZerosInRowAndColumn subject;

    @Test
    void test() {
        int[][] input = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 1}
        };
        int[][] expected = new int[][]{
                {0, 0, 4},
                {0, 0, 4},
                {-2, -2, 2}
        };
        assertEquals(input, expected);
    }

    private void assertEquals(int[][] input, int[][] expected) {
        final var output = subject.difference(input);
        for (int i = 0; i < output.length; i++) {
            assertThat(output[i]).containsExactly(expected[i]);
        }
    }
}