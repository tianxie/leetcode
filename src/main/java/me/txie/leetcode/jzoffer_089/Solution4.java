package me.txie.leetcode.jzoffer_089;

public class Solution4 implements Solution {
    @Override
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }

        int[][] dp = new int[2][2];
        dp[0][0] = 0;
        dp[1][0] = nums[0];

        for (int i = 1; i < len; i++) {
            // 不进入i号房屋
            dp[0][i % 2] = Math.max(dp[0][(i - 1) % 2], dp[1][(i - 1) % 2]);
            // 进入i号房屋
            dp[1][i % 2] = nums[i] + dp[0][(i - 1) % 2];
        }
        return Math.max(dp[0][(len - 1) % 2], dp[1][(len - 1) % 2]);
    }
}
