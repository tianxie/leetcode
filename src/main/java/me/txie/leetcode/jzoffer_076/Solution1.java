/**
 * LeetCode - jzoffer_076
 * https://leetcode.cn/problems/xx4gT2/
 */

package me.txie.leetcode.jzoffer_076;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int start = 0, end = nums.length - 1;
        int index = partition(nums, start, end);
        while (index != target) {
            if (index > target) {
                end = index - 1;
            } else {
                start = index + 1;
            }

            index = partition(nums, start, end);
        }
        return nums[index];
    }

    private int partition(int[] nums, int start, int end) {
        if (start == end) return start;

        int i = start, j = end + 1;
        int v = nums[start];
        while (true) {
            while (nums[++i] < v) {
                if (i == end) break;
            }
            while (v < nums[--j]) {
                if (j == start) break;
            }
            if (i >= j) break;
            exch(nums, i, j);
        }
        exch(nums, start, j);
        return j;
    }

    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
// 时间复杂度：
// 空间复杂度：