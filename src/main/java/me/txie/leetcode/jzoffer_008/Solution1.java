/**
 * LeetCode - jzoffer_008
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */

package me.txie.leetcode.jzoffer_008;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;

        int lo = 0;
        int sum = 0;
        for (int hi = 0; hi < nums.length; hi++) {
            sum += nums[hi];
            while (lo <= hi && sum >= target) {
                result = Math.min(result, hi - lo + 1);
                sum -= nums[lo++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：