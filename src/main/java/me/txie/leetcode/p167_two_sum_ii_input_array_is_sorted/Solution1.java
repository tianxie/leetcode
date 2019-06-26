/**
 * LeetCode - p167_two_sum_ii_input_array_is_sorted
 */
package me.txie.leetcode.p167_two_sum_ii_input_array_is_sorted;

import java.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution1 implements Solution {

    // O(nlogn) runtime, O(1) space, 二分查找
    @Override
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            int j = binarySearch(numbers, target - x, i + 1, numbers.length - 1);
            if (j != -1) return new int[]{i + 1, j + 1};
        }
        return new int[0];
    }

    private int binarySearch(int[] numbers, int key, int lo, int hi) {
        while (lo <= hi) { // 注意这里是小于等于
            int mid = (lo + hi) / 2;
            if (numbers[mid] < key) {
                lo = mid + 1;
            } else if (numbers[mid] > key) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
