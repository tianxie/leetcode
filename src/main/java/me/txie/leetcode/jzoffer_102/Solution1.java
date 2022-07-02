/**
 * LeetCode - jzoffer_102
 * https://leetcode.cn/problems/YaVDxD/
 */

package me.txie.leetcode.jzoffer_102;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum < target || (sum + target) % 2 == 1) {
            return 0;
        }
        
        return helper(nums, (target + sum) / 2);
    }

    private int helper(int[] nums, int target) {
        int[][] dp = new int[nums.length + 1][target + 1];

        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= nums[i - 1]) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[nums.length][target];
    }
}
// 时间复杂度：O(nt)
// 空间复杂度：O(nt)