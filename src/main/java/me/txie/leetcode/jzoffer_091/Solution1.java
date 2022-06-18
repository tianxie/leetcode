/**
 * LeetCode - jzoffer_091
 * https://leetcode.cn/problems/JEj789/
 */

package me.txie.leetcode.jzoffer_091;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minCost(int[][] costs) {
        if (costs.length == 0) {
            return 0;
        }

        int[][] dp = new int[3][2];
        for (int i = 0; i < 3; i++) {
            dp[i][0] = costs[0][i];
        }

        for (int i = 1; i < costs.length; i++) {
            for (int j = 0; j < 3; j++) {
                int prev1 = dp[(j + 2) % 3][(i - 1) % 2];
                int prev2 = dp[(j + 1) % 3][(i - 1) % 2];
                dp[j][i % 2] = Math.min(prev1, prev2) + costs[i][j];
            }
        }

        int last = (costs.length - 1) % 2;
        return Math.min(dp[0][last], Math.min(dp[1][last], dp[2][last]));
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)