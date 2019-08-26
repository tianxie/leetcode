/**
 * LeetCode - p159_longest_substring_with_at_most_two_distinct_characters
 */
 
package me.txie.leetcode.p159_longest_substring_with_at_most_two_distinct_characters;
import java.util.*;
import me.txie.leetcode.util.*;

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

    // 维护一个滑动窗口，它里面最多有两个不同的字符。
    // O(n)
    @Override
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int i = 0, j = -1, maxLen = 0;
        for (int k = 1; k < s.length(); k++) {
            if (s.charAt(k) == s.charAt(k - 1)) continue;
            if (j >= 0 && s.charAt(j) != s.charAt(k)) {
                maxLen = Math.max(k - i, maxLen);
                i = j + 1;
            }
            j = k - 1;
        }
        return Math.max(s.length() - i, maxLen);
    }
}