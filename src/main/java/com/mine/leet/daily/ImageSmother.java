package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImageSmother {

	public int[][] imageSmoother(int[][] img) {
		int[][] output = new int[img.length][img[0].length];
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[i].length; j++) {
				int sum = img[i][j];
				int total = 1;
				if (i + 1 < img.length) {
					sum += img[i + 1][j];
					total++;
					if (j + 1 < img[i].length) {
						sum += img[i + 1][j + 1];
						total++;
					}
					if (j - 1 >= 0) {
						sum += img[i + 1][j - 1];
						total++;
					}
				}
				if (i - 1 >= 0) {
					sum += img[i - 1][j];
					total++;
					if (j + 1 < img[i].length) {
						sum += img[i - 1][j + 1];
						total++;
					}
					if (j - 1 >= 0) {
						sum += img[i - 1][j - 1];
						total++;
					}
				}
				if (j - 1 >= 0) {
					sum += img[i][j - 1];
					total++;
				}
				if (j + 1 < img[i].length) {
					sum += img[i][j + 1];
					total++;
				}
				output[i][j] = (int) Math.floor((double) sum / total);
			}
		}
		return output;
	}
}
