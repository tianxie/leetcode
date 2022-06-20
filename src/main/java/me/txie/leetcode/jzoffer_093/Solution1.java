/**
 * LeetCode - jzoffer_093
 * https://leetcode.cn/problems/Q91FMA/
 */

package me.txie.leetcode.jzoffer_093;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        int[][] dp = new int[arr.length][arr.length];
        int result = 2;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int k = map.getOrDefault(arr[i] - arr[j], -1);
                dp[i][j] = (k >= 0 && k < j) ? dp[j][k] + 1 : 2;
                result = Math.max(result, dp[i][j]);
            }
        }

        return result > 2 ? result : 0;
    }
}
// 时间复杂度：O(n^2)
// 空间复杂度：O(n^2)