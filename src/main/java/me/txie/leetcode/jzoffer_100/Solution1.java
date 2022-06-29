/**
 * LeetCode - jzoffer_100
 * https://leetcode.cn/problems/IlPe0q/
 */

package me.txie.leetcode.jzoffer_100;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j);
                if (i > 0 && j == 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if (i > 0 && i == j) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else if (i > 0) {
                    dp[i][j] += Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int num : dp[size - 1]) {
            min = Math.min(min, num);
        }
        return min;
    }
}
// 动态规划
// 时间复杂度：O(n^2)
// 空间复杂度：O(n^2)