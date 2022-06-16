/**
 * LeetCode - jzoffer_090
 * https://leetcode.cn/problems/PzWKhm/
 */

package me.txie.leetcode.jzoffer_090;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        // 从0到n-2能偷得的最多财物数量
        int result1 = helper(nums, 0, nums.length - 2);
        // 从1到n-1能偷得的最多财物数量
        int result2 = helper(nums, 1, nums.length - 1);
        return Math.max(result1, result2);
    }

    private int helper(int[] nums, int start, int end) {
        int[] dp = new int[2];
        dp[0] = nums[start];

        if (start < end) {
            dp[1] = Math.max(nums[start], nums[start + 1]);
        }

        for (int i = start + 2; i <= end; i++) {
            int j = i - start;
            dp[j % 2] = Math.max(dp[(j - 2) % 2] + nums[i], dp[(j - 1) % 2]);
        }
        return dp[(end - start) % 2];
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)