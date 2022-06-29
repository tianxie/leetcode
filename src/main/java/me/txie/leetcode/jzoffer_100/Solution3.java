package me.txie.leetcode.jzoffer_100;

import java.util.Arrays;
import java.util.List;

public class Solution3 implements Solution {
    @Override
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return helper(triangle, 0, 0, dp);
    }

    private int helper(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if (i == triangle.size()) {
            return 0;
        }

        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        dp[i][j] = Math.min(helper(triangle, i + 1, j, dp), helper(triangle, i + 1, j + 1, dp)) + triangle.get(i).get(j);
        return dp[i][j];
    }
}

// 自顶向下的递归算法
// 时间复杂度：O(n^2)
// 空间复杂度：O(n^2)