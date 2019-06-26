/**
 * LeetCode - p231_power_of_two
 */
package me.txie.leetcode.p231_power_of_two;

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
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        return (n & (n - 1)) == 0;
    }
}
