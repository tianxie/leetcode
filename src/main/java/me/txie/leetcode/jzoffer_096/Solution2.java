/**
 * LeetCode - jzoffer_096
 * https://leetcode.cn/problems/IY6buf/
 */

package me.txie.leetcode.jzoffer_096;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        if (s1.length() < s2.length()) {
            return isInterleave(s2, s1, s3);
        }

        boolean[] dp = new boolean[s2.length() + 1];
        dp[0] = true;

        for (int j = 0; j < s2.length(); j++) {
            dp[j + 1] = s2.charAt(j) == s3.charAt(j) && dp[j];
        }

        for (int i = 0; i < s1.length(); i++) {
            dp[0] = dp[0] && s1.charAt(i) == s3.charAt(i);

            for (int j = 0; j < s2.length(); j++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                char c3 = s3.charAt(i + j + 1);
                dp[j + 1] = (c1 == c3 && dp[j + 1])
                    || (c2 == c3 && dp[j]);
            }
        }

        return dp[s2.length()];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(min(m, n))