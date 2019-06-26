/**
 * LeetCode - p9_palindrome_number
 */
package me.txie.leetcode.p9_palindrome_number;

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
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int y = x;
        while (y > 0) {
            reverse = (reverse * 10) + (y % 10);
            y /= 10;
        }
        return reverse == x;
    }
}
