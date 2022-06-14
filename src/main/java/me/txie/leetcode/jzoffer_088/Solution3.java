package me.txie.leetcode.jzoffer_088;

public class Solution3 implements Solution {
    @Override
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[]{cost[0], cost[1]};
        for (int i = 2; i < cost.length; i++) {
            dp[i % 2] = Math.min(dp[0], dp[1]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)