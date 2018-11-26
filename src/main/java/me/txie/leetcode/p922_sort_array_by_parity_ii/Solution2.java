/**
 * Leetcode - p922_sort_array_by_parity_ii
 */
package me.txie.leetcode.p922_sort_array_by_parity_ii;
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
class Solution2 implements Solution {


    @Override
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i += 2) {
            if ((A[i] & 1) != 0) {
                while ((A[j] & 1) != 0) {
                    j += 2;
                }

                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}
