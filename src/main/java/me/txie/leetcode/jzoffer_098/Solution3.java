package me.txie.leetcode.jzoffer_098;

import java.util.Arrays;

public class Solution3 implements Solution {
    @Override
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(n)
