/**
 * LeetCode - jzoffer_068
 * https://leetcode.cn/problems/N6YdxV/
 */

package me.txie.leetcode.jzoffer_068;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] >= target) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                }
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return nums.length;
    }
}
// 时间复杂度：O(logn)
// 空间复杂度：