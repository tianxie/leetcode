/**
 * LeetCode - p171_excel_sheet_column_number
 */
package me.txie.leetcode.p171_excel_sheet_column_number;

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
    public int titleToNumber(String s) {
        int number = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            number += (c - 'A' + 1) * (int) Math.pow(26, length - i - 1);
        }
        return number;
    }
}
