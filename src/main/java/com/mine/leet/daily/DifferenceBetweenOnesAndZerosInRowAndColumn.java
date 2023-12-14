package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DifferenceBetweenOnesAndZerosInRowAndColumn {

    public int[][] difference(int[][] grid) {
        int[][] output = new int[grid.length][grid[0].length];
        int[] onesRow = new int[grid.length];
        int[] onesColumn = new int[grid[0].length];
        int[] zerosRow = new int[grid.length];
        int[] zerosColumn = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    zerosRow[i]++;
                    zerosColumn[j]++;
                }
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesColumn[j]++;
                }
            }
        }
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                output[i][j] = onesRow[i] + onesColumn[j] - zerosRow[i] - zerosColumn[j];
            }
        }
        return output;
    }
}
