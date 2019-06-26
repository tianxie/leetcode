/**
 * LeetCode - p438_find_all_anagrams_in_a_string
 */
package me.txie.leetcode.p438_find_all_anagrams_in_a_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution3 implements Solution {


    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] freq = new int[256];
        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i)]++;
        }

        int left = 0, right = 0;
        int count = p.length();
        while (right < s.length()) {
            if (--freq[s.charAt(right++)] >= 0) count--;
            if (count == 0) result.add(left);
            if (right - left == p.length() && freq[s.charAt(left++)]++ >= 0) count++;
        }

        return result;
    }
}
