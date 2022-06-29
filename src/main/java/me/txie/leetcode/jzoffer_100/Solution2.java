/**
 * LeetCode - jzoffer_100
 * https://leetcode.cn/problems/IlPe0q/
 */

package me.txie.leetcode.jzoffer_100;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        for (List<Integer> row : triangle) {
            for (int j = row.size() - 1; j >= 0; j--) {
                if (j == 0) {
                    dp[j] += row.get(j);
                } else if (j == row.size() - 1) {
                    dp[j] = dp[j - 1] + row.get(j);
                } else {
                    dp[j] = Math.min(dp[j], dp[j - 1]) + row.get(j);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int num : dp) {
            min = Math.min(min, num);
        }
        return min;
    }
}
// 时间复杂度：O(n^2)
// 空间复杂度：O(n)