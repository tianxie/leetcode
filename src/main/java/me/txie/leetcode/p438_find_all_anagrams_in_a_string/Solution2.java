/**
 * LeetCode - p438_find_all_anagrams_in_a_string
 */
package me.txie.leetcode.p438_find_all_anagrams_in_a_string;

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
class Solution2 implements Solution {


    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] expected = new int[26];
        for (int i = 0; i < p.length(); i++) {
            expected[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            int[] actual = new int[26];
            for (int j = i; j < (i + p.length()); j++) {
                actual[s.charAt(j) - 'a']++;
            }

            if (Arrays.equals(expected, actual)) {
                result.add(i);
            }
        }
        return result;
    }
}
