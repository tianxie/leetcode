/**
 * LeetCode - p258_add_digit
 */
package me.txie.leetcode.p258_add_digit;

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
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
