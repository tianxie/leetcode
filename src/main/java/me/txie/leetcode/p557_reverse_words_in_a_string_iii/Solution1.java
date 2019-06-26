/**
 * LeetCode - p557_reverse_words_in_a_string_iii
 */
package me.txie.leetcode.p557_reverse_words_in_a_string_iii;

import java.util.*;

import static org.apache.commons.lang3.ArrayUtils.reverse;

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
    public String reverseWords(String s) {
        int len = s.length();
        if (len <= 1) return s;

        char[] chars = s.toCharArray();
        int start = 0;
        while (start < len) {
            int end = s.indexOf(' ', start);
            if (end == -1) {
                reverse(chars, start, s.length());
                break;
            } else {
                reverse(chars, start, end);
                start = end + 1;
            }
        }

        return new String(chars);
    }

    private static void reverse(char[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array != null) {
            int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;

            for (int j = Math.min(array.length, endIndexExclusive) - 1; j > i; ++i) {
                char tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                --j;
            }
        }
    }
}
