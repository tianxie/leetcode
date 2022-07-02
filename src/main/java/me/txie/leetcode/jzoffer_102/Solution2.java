/**
 * LeetCode - jzoffer_102
 * https://leetcode.cn/problems/YaVDxD/
 */

package me.txie.leetcode.jzoffer_102;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum < target || (sum + target) % 2 == 1) {
            return 0;
        }

        return helper(nums, (sum + target) / 2);
    }

    private int helper(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[target];
    }
}
// 时间复杂度：O(nt)
// 空间复杂度：O(t)