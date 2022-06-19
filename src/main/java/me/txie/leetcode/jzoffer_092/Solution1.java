/**
 * LeetCode - jzoffer_092
 * https://leetcode.cn/problems/cyJERH/
 */

package me.txie.leetcode.jzoffer_092;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minFlipsMonoIncr(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }

        int[][] dp = new int[2][2];
        char c = s.charAt(0);
        dp[0][0] = c == '0' ? 0 : 1;
        dp[1][0] = c == '1' ? 0 : 1;

        for (int i = 1; i < len; i++) {
            char ch = s.charAt(i);
            int prev0 = dp[0][(i - 1) % 2];
            int prev1 = dp[1][(i - 1) % 2];
            dp[0][i % 2] = prev0 + (ch == '0' ? 0 : 1);
            dp[1][i % 2] = Math.min(prev0, prev1) + (ch == '1' ? 0 : 1);
        }

        return Math.min(dp[0][(len - 1) % 2], dp[1][(len - 1) % 2]);
    }
}
// 时间复杂度：O（n）
// 空间复杂度：O(1)