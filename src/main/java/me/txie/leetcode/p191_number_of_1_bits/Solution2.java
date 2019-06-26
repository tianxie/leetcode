/**
 * LeetCode - p191_number_of_1_bits
 */
package me.txie.leetcode.p191_number_of_1_bits;

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
class Solution2 implements Solution {


    @Override
    public int hammingWeight(int n) {
        int weight = 0;
        while (n != 0) {
            n = n & (n - 1);
            weight++;
        }
        return weight;
    }
}
