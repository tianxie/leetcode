/**
 * LeetCode - jzoffer_097
 * https://leetcode.cn/problems/21dk04/
 */

package me.txie.leetcode.jzoffer_097;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int numDistinct(String s, String t) {
        int[] dp = new int[t.length() + 1];
        if (s.length() > 0) {
            dp[0] = 1;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = Math.min(i, t.length() - 1); j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[j + 1] += dp[j];
                }
            }
        }

        return dp[t.length()];
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：O(n)