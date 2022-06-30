/**
 * LeetCode - jzoffer_101
 * https://leetcode.cn/problems/NUPfPr/
 */

package me.txie.leetcode.jzoffer_101;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

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
        Boolean[][] dp = new Boolean[nums.length + 1][target + 1];
        return helper(nums, dp, nums.length, target);
    }

    // 从前i个元素中选择若干，其和为j
    private boolean helper(int[] nums, Boolean[][] dp, int i, int j) {
        if (dp[i][j] == null) {
            if (j == 0) {
                dp[i][j] = true;
            } else if (i == 0) {
                dp[i][j] = false;
            } else {
                dp[i][j] = helper(nums, dp, i - 1, j); // 不选第i个元素
                if (!dp[i][j] && j >= nums[i - 1]) {
                    // 选择第i个元素
                    dp[i][j] = helper(nums, dp, i - 1, j - nums[i - 1]);
                }
            }
        }
        return dp[i][j];
    }
}
// 时间复杂度：O(nt)，nums的长度为n，目标和为t
// 空间复杂度：O(nt)