/**
 * LeetCode - jzoffer_088
 * https://leetcode.cn/problems/GzCJIP/
 */

package me.txie.leetcode.jzoffer_088;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length];
        helper(cost, length - 1, dp);
        helper(cost, length - 2, dp);
        return Math.min(dp[length - 1], dp[length - 2]);
    }

    private void helper(int[] cost, int i, int[] dp) {
        if (i < 2) {
            dp[i] = cost[i];
        } else if (dp[i] == 0) {
            helper(cost, i - 2, dp);
            helper(cost, i - 1, dp);
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)