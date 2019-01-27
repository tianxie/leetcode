/**
 * Leetcode - p961_n_repeated_element_in_size_2n_array
 */
package me.txie.leetcode.p961_n_repeated_element_in_size_2n_array;
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
    public int repeatedNTimes(int[] A) {
        boolean[] existed = new boolean[10000];
        for (int a : A) {
            if (existed[a]) {
                return a;
            } else {
                existed[a] = true;
            }
        }
        return 0;
    }
}
