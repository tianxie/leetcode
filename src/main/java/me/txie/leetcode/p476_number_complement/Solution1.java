/**
 * LeetCode - p476_number_complement
 */
package me.txie.leetcode.p476_number_complement;

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
    public int findComplement(int num) {
        int i = 0, result = 0;
        while (num != 0) {
            result += ((num & 1) ^ 1) << i;
            num >>= 1;
            i++;
        }
        return result;
    }
}
