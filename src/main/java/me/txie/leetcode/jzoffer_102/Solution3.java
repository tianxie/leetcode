package me.txie.leetcode.jzoffer_102;

public class Solution3 implements Solution {
    @Override
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || (sum + target) % 2 == 1) {
            return 0;
        }

        int newTarget = (target + sum) / 2;
        return targetSum(nums, newTarget);
    }

    private int targetSum(int[] nums, int target) {
        Integer[][] dp = new Integer[nums.length + 1][target + 1];
        return helper(nums, dp, nums.length, target);
    }

    private int helper(int[] nums, Integer[][] dp, int i, int j) {
        if (dp[i][j] == null) {
            if (i == 0 && j == 0) {
                dp[i][j] = 1;
            } else if (i == 0 && j > 0) {
                dp[i][j] = 0;
            } else {
                dp[i][j] = helper(nums, dp, i - 1, j);
                if (j >= nums[i - 1]) {
                    dp[i][j] += helper(nums, dp, i - 1, j - nums[i - 1]);
                }
            }
        }
        return dp[i][j];
    }
}
