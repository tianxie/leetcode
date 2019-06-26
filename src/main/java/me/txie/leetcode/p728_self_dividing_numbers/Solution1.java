/**
 * LeetCode - p728_self_dividing_numbers
 */
package me.txie.leetcode.p728_self_dividing_numbers;

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
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividingNumber(int number) {
        int i = number;
        while (i > 0) {
            int digit = i % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            i /= 10;
        }
        return true;
    }
}
