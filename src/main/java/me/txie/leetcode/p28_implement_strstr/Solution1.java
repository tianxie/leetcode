/**
 * LeetCode - p28_implement_strstr
 */
package me.txie.leetcode.p28_implement_strstr;

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

    // O(nm) runtime, O(1) space
    @Override
    public int strStr(String haystack, String needle) {
        // 若 needle 为空，返回 0；
        // 若 haystack 为空，返回 -1；
        // 若 needle 比 haystack 长，返回 -1；
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }
}
