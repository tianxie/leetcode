/**
 * LeetCode - jzoffer_009
 * https://leetcode-cn.com/problems/subarray-product-less-than-k/
 */

package me.txie.leetcode.jzoffer_009;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int result = 0;

        int lo = 0;
        int product = 1;
        for (int hi = 0; hi < nums.length; hi++) {
            product *= nums[hi];
            while (lo <= hi && product >= k) {
                product /= nums[lo++];
            }

            result += (hi >= lo) ? hi - lo + 1 : 0;
        }

        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：