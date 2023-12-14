package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SpecialNumbers {

	public int numSpecial(int[][] mat) {
		int result = 0;
		int[] byRows = new int[mat.length];
		int[] byColumns = new int[mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					byRows[i]++;
					byColumns[j]++;
					if (byRows[i] == 1 && byColumns[j] == 1) {
						result++;
					} else if (byRows[i] == 2 && byColumns[i] <= 1) {
						result--;
					} else if (byColumns[j] == 2 && byRows[j] <= 1) {
						result--;
					}
				}
			}
		}
		return result;
	}
}
