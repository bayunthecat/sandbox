package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
public class SpecialNumbers {

	public int numSpecial(int[][] mat) {
		int result = 0;
		Set<Integer> rows = new HashSet<>();
		Set<Integer> columns = new HashSet<>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					if (!rows.add(i) || !columns.add(j)) {
						result = Math.max(result - 1, 0);
					} else {
						result++;
					}
				}
			}
		}
		return result;
	}
}
