/**
 * LeetCode - p3_longest_substring_without_repeating_characters
 */
package me.txie.leetcode.p3_longest_substring_without_repeating_characters;

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

    // O(n) runtime, O(1) space
    @Override
    public int lengthOfLongestSubstring(String s) {
        boolean[] existed = new boolean[256];
        int i = 0, maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            while (existed[s.charAt(j)]) {
                existed[s.charAt(i)] = false;
                i++;
            }
            existed[s.charAt(j)] = true;
            maxLen = Math.max(j - i + 1, maxLen);
        }
        return maxLen;
    }
}
