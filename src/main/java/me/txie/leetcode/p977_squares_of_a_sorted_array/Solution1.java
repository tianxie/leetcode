/**
 * LeetCode - p977_squares_of_a_sorted_array
 */
package me.txie.leetcode.p977_squares_of_a_sorted_array;

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

    // O(n) runtime, O(n) space
    @Override
    public int[] sortedSquares(int[] A) {
        int[] nums = new int[A.length];
        int curr = A.length - 1;
        int i = 0, j = A.length - 1;
        while (i <= j) {
            if (A[i] * A[i] < A[j] * A[j]) {
                nums[curr--] = A[j] * A[j];
                j--;
            } else {
                nums[curr--] = A[i] * A[i];
                i++;
            }
        }
        return nums;
    }
}
