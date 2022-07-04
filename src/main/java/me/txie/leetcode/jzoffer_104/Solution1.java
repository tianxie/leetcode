/**
 * LeetCode - jzoffer_104
 * https://leetcode.cn/problems/D0F0SV/
 */

package me.txie.leetcode.jzoffer_104;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
// 时间复杂度：O(nt)
// 空间复杂度：O(t)
// n为输入数组的长度，t为排列的目标和。