/**
 * LeetCode - jzoffer_089
 * https://leetcode.cn/problems/Gu0c2T/
 */
package me.txie.leetcode.jzoffer_089;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        helper(nums, nums.length - 1, dp);
        return dp[nums.length - 1];
    }

    private void helper(int[] nums, int i, int[] dp) {
        if (i == 0) {
            dp[i] = nums[0];
        } else if (i == 1) {
            dp[i] = Math.max(nums[0], nums[1]);
        } else if (dp[i] < 0) {
            helper(nums, i - 2, dp);
            helper(nums, i - 1, dp);
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
    }
}
// 状态转移方程 f(i) = max(f(i-2)+nums[i], f(i-1))
// 时间复杂度：O(n)
// 空间复杂度：O(n)
