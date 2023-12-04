package com.mine.lectures;

import java.util.Arrays;

public class PeakFinder {

    public int findAPeakRecursive(int[] array) {
        int half = array.length / 2;
        int value = array[half];
        if (half - 1 >= 0 && value < array[half - 1]) {
            return findAPeakRecursive(Arrays.copyOfRange(array, 0, half));
        } else if (half + 1 < array.length && value < array[half + 1]) {
            return findAPeakRecursive(Arrays.copyOfRange(array, half, array.length));
        } else {
            return half;
        }
    }

    public int fundAPeakCycle(int[] array) {
        int result = -1;
        int[] divided = array;
        do {
            int half = divided.length / 2;
            if (half - 1 > 0 && divided[half] < divided[half - 1]) {
                divided = Arrays.copyOfRange(divided, 0, half);
            } else if (half + 1 < divided.length && divided[half] < divided[half + 1]) {
                divided = Arrays.copyOfRange(divided, half, divided.length);
            } else {
                return half;
            }
        } while (divided.length != 1);
        return result;
    }

    public int[] findAPeak(int[][] array) {
        return new int[] {0, 0};
    }
}