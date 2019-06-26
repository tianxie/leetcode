/**
 * LeetCode - p942_di_string_match
 */
package me.txie.leetcode.p942_di_string_match;

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
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] a = new int[N + 1];
        int left = 0, right = N;

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'I') {
                a[i] = left++;
            } else if (c == 'D') {
                a[i] = right--;
            }
        }
        a[N] = right;

        return a;
    }
}
