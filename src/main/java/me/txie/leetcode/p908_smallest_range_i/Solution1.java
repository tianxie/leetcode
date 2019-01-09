/**
 * Leetcode - p908_smallest_range_i
 */
package me.txie.leetcode.p908_smallest_range_i;
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
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            min = (A[i] < min) ? A[i] : min;
            max = (A[i] > max) ? A[i] : max;
        }

        if ((min + K) < (max - K)) {
            return max - min - 2 * K;
        } else {
            return 0;
        }
    }
}
