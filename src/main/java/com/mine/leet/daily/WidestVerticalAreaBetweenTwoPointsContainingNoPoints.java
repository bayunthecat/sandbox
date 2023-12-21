package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Arrays;

@ApplicationScoped
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

	public int maxWidthOfVerticalArea(int[][] points) {
		int[] x = new int[points.length];
		for (int i = 0; i < points.length; i++) {
			x[i] = points[i][0];
		}
		Arrays.sort(x);
		int maxArea = 0;
		for (int i = 0; i < x.length - 1; i++) {
			maxArea = Math.max(x[i + 1] - x[i], maxArea);
		}
		return maxArea;
	}
}