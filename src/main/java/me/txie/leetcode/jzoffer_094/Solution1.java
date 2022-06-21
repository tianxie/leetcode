/**
 * LeetCode - jzoffer_094
 * https://leetcode.cn/problems/omKAoA/
 */

package me.txie.leetcode.jzoffer_094;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minCut(String s) {
        int len = s.length();
        boolean[][] isPal = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (c1 == c2 && (i <= j + 1 || isPal[j + 1][i - 1])) {
                    isPal[j][i] = true;
                }
            }
        }

        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            if (isPal[0][i]) {
                dp[i] = 0;
            } else {
                dp[i] = i;
                for (int j = 1; j <= i; j++) {
                    if (isPal[j][i]) {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        return dp[len - 1];
    }
}
// 时间复杂度：O(n^2)
// 空间复杂度：O(n^2)