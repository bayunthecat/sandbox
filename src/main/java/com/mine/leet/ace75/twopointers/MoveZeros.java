package com.mine.leet.ace75.twopointers;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MoveZeros {

	public void moveZeroesAlt(int[] nums) {
		for (int i = 0, tail = nums.length - 1; i < tail; i++) {
			if (nums[i] == 0) {
				System.arraycopy(nums, i + 1, nums, i, tail - i);
				nums[tail--] = 0;
				i--;
			}
		}
	}

	public void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int tmp = nums[i];
				nums[i] = nums[nonZeroIndex];
				nums[nonZeroIndex++] = tmp;
			}
		}
		while (nonZeroIndex < nums.length) {
			nums[nonZeroIndex++] = 0;
		}
	}

}
