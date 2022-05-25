/**
 * LeetCode - jzoffer_070
 * https://leetcode.cn/problems/skFtm2/
 */

package me.txie.leetcode.jzoffer_070;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length / 2;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int i = mid * 2;
            if (i < nums.length - 1 && nums[i] != nums[i + 1]) {
                if (mid == 0 || nums[i - 2] == nums[i - 1]) {
                    return nums[i];
                }

                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        
        return nums[nums.length - 1];
    }
}
// 时间复杂度：O(logn)
// 空间复杂度：