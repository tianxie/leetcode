/**
 * LeetCode - jzoffer_101
 * https://leetcode.cn/problems/NUPfPr/
 */

package me.txie.leetcode.jzoffer_101;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

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
        boolean[][] dp = new boolean[nums.length + 1][target + 1]; // 为什么要多加1？
        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (!dp[i][j] && j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[nums.length][target];
    }
}
// 时间复杂度：O(nt)，nums的长度为n，目标和为t
// 空间复杂度：O(nt)