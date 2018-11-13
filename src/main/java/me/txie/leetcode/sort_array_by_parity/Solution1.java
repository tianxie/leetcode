/**
 * Leetcode - sort_array_by_parity
 */
package me.txie.leetcode.sort_array_by_parity;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

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
    public int[] sortArrayByParity(int[] A) {
        int firstOdd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                exch(A, firstOdd, i);
                firstOdd++;
            }
        }
        return A;
    }

    private void exch(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
