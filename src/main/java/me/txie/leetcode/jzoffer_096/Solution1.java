/**
 * LeetCode - jzoffer_096
 * https://leetcode.cn/problems/IY6buf/
 */

package me.txie.leetcode.jzoffer_096;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        int len1 = s1.length();
        int len2 = s2.length();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;

        for (int i = 0; i < len1; i++) {
            dp[i + 1][0] = s1.charAt(i) == s3.charAt(i) && dp[i][0];
        }

        for (int j = 0; j < len2; j++) {
            dp[0][j + 1] = s2.charAt(j) == s3.charAt(j) && dp[0][j];
        }

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                char c3 = s3.charAt(i + j + 1);
                dp[i + 1][j + 1] = (c1 == c3 && dp[i][j + 1])
                    || (c2 == c3 && dp[i + 1][j]);
            }
        }

        return dp[len1][len2];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(mn)