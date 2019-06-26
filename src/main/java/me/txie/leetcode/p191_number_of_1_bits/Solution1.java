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
class Solution1 implements Solution {


    @Override
    public int hammingWeight(int n) {
        int weight = 0;

        while (n != 0) {
            weight += (n & 1);
            n >>>= 1;
        }

        return weight;
    }
}
