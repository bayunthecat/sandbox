package com.mine.leet;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.HashMap;

@ApplicationScoped
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        final var set = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (set.containsKey(target - num)) {
                return new int[]{i, set.get(target - num)};
            }
            set.put(num, i);
        }
        return new int[]{};
    }
}
