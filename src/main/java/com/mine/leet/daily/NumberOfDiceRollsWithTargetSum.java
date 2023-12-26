package com.mine.leet.daily;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NumberOfDiceRollsWithTargetSum {

    public int numRollsToTarget(int n, int k, int target) {
        return numRollsToTargetRecursion(n, k, target);
    }

    private int numRollsToTargetRecursion(int n, int k, int target) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 && target <= k) {
            return 1;
        }

        int rolls = 0;
        for (int i = 1; i <= k; i++) {
            int remains = target - i;
            if (remains > 0) {
                rolls += numRollsToTarget(n - 1, k, remains);
            } else {
                break;
            }
        }
        return rolls;
    }
}
