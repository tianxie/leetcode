/**
 * LeetCode - jzoffer_097
 * https://leetcode.cn/problems/21dk04/
 */

package me.txie.leetcode.jzoffer_097;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        dp[0][0] = 1;

        for (int i = 0; i < s.length(); i++) {
            dp[i + 1][0] = 1;
            for (int j = 0; j <= i && j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + dp[i][j + 1];
                } else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(mn)