/**
 * LeetCode - p944_delete_columns_to_make_sorted
 */
package me.txie.leetcode.p944_delete_columns_to_make_sorted;

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


    @Override
    public int minDeletionSize(String[] A) {
        int size = 0;
        int row = A.length;
        int col = A[0].length();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row - 1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    size++;
                    break;
                }
            }
        }
        return size;
    }
}
