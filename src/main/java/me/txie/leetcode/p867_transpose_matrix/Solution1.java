/**
 * LeetCode - p867_transpose_matrix
 */
package me.txie.leetcode.p867_transpose_matrix;

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
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] B = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
