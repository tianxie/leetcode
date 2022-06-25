/**
 * LeetCode - jzoffer_098
 * https://leetcode.cn/problems/2AoeFn/
 */

package me.txie.leetcode.jzoffer_098;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return helper(m - 1, n - 1, dp);
    }

    private int helper(int i, int j, int[][] dp) {
        if (dp[i][j] == 0) { // 保证每个值计算一次
            if (i == 0 || j == 0) {
                // 第一行和第一列只有一种走法
                dp[i][j] = 1;
            } else {
                dp[i][j] = helper(i - 1, j, dp) + helper(i, j - 1, dp);
            }
        }
        return dp[i][j];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(mn)