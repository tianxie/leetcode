/**
 * LeetCode - jzoffer_095
 * https://leetcode.cn/problems/qJnOS7/
 */

package me.txie.leetcode.jzoffer_095;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        if (len1 < len2) {
            return longestCommonSubsequence(text2, text1);
        }

        int[][] dp = new int[2][len2 + 1];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[(i + 1) % 2][j + 1] = dp[i % 2][j] + 1;
                } else {
                    dp[(i + 1) % 2][j + 1] = Math.max(dp[i % 2][j + 1], dp[(i + 1) % 2][j]);
                }
            }
        }
        return dp[len1 % 2][len2];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(min(m, n))