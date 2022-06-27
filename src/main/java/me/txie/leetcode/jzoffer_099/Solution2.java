/**
 * LeetCode - jzoffer_099
 * https://leetcode.cn/problems/0i0mDW/
 */

package me.txie.leetcode.jzoffer_099;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length];
        dp[0] = grid[0][0];
        for (int j = 1; j < grid[0].length; j++) {
            dp[j] = grid[0][j] + dp[j - 1];
        }

        for (int i = 1; i < grid.length; i++) {
            dp[0] += grid[i][0];
            for (int j = 1; j < grid[0].length; j++) {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
            }
        }

        return dp[grid[0].length - 1];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(n)