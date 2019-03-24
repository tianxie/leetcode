/**
 * Leetcode - p190_reverse_bits
 */
package me.txie.leetcode.p190_reverse_bits;
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
    public int reverseBits(int n) {
        int reversed = 0;

        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) + (n & 1);
            n >>>= 1;
        }

        return reversed;
    }
}
