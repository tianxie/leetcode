package me.txie.leetcode.jzoffer_101;

public class Solution3 implements Solution {
    @Override
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) {
            return false;
        }
        return subsetSum(nums, sum / 2);
    }

    private boolean subsetSum(int[] nums, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int i = 1; i <= nums.length; i++) {
            for (int j = target; j > 0; j--) {
                if (!dp[j] && j >= nums[i - 1]) {
                    dp[j] = dp[j - nums[i - 1]];
                }
            }
        }
        return dp[target];
    }
}
// 时间复杂度：O(nt)，nums的长度为n，目标和为t
// 空间复杂度：O(t)
