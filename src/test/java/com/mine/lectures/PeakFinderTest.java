package com.mine.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PeakFinderTest {

    PeakFinder subject = new PeakFinder();

    @Test
    void test_1() {
        assertThat(subject.findAPeakRecursive(new int[] {-1, 2, 3, 7, 11, 3, 2, -1, -11})).isEqualTo(4);
    }

    @Test
    void test_2() {
        assertThat(subject.findAPeakRecursive(new int[] {-1, 11, 10, 9, 8, 7, 6, 5, -11})).isEqualTo(1);
    }

    @Test
    void test_1_1() {
        assertThat(subject.fundAPeakCycle(new int[] {-1, 2, 3, 7, 11, 3, 2, -1, -11})).isEqualTo(4);
    }

    @Test
    void test_2_1() {
        assertThat(subject.fundAPeakCycle(new int[] {-1, 11, 10, 9, 8, 7, 6, 5, -11})).isEqualTo(1);
    }

    @Test
    void test2d_1() {
        int[][] array = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 2, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0}
        };
        assertThat(subject.findAPeak(array));
    }

    @Test
    void test2d_2() {
        int[][] array = new int[][] {
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {2, 1, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        assertThat(subject.findAPeak(array));
    }

}