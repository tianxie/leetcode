/**
 * LeetCode - jzoffer_088
 * https://leetcode.cn/problems/GzCJIP/
 */

package me.txie.leetcode.jzoffer_088;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[len - 1], dp[len - 2]);
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)