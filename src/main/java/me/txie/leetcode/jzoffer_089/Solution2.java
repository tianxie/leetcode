/**
 * LeetCode - jzoffer_089
 * https://leetcode.cn/problems/Gu0c2T/
 */

package me.txie.leetcode.jzoffer_089;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        if (nums.length > 1) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)