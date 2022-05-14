/**
 * LeetCode - jzoffer_057
 * https://leetcode.cn/problems/7WqeDu/
 */

package me.txie.leetcode.jzoffer_057;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long floor = set.floor((long) nums[i]); // 小于或等于nums[i]的最大的数
            if (floor != null && nums[i] - floor <= t) {
                return true;
            }

            Long ceiling = set.ceiling((long) nums[i]); // 大于或等于nums[i]的最小的数
            if (ceiling != null && ceiling - nums[i] <= t) {
                return true;
            }

            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}
// 时间复杂度：O(nlogk)
// 空间复杂度：O(k)