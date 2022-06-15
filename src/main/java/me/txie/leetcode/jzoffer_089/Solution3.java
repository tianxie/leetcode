package me.txie.leetcode.jzoffer_089;

public class Solution3 implements Solution {
    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[2];
        dp[0] = nums[0];
        if (nums.length > 1) {
            dp[1] = Math.max(nums[0], nums[1]);
        }

        for (int i = 2; i < nums.length; i++) {
            dp[i % 2] = Math.max(dp[(i - 2) % 2] + nums[i], dp[(i - 1) % 2]);
        }
        return dp[(nums.length - 1) % 2];
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)