/**
 * LeetCode - p153_find_minimum_in_rotated_sorted_array
 */
 
package me.txie.leetcode.p153_find_minimum_in_rotated_sorted_array;
import java.util.*;
import me.txie.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {
    
    @Override
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi && nums[lo] >= nums[hi]) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }
}