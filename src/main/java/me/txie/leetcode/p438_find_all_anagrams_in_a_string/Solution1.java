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
class Solution1 implements Solution {


    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String substring = s.substring(i, i + p.length());
            if (isAnagram(p, substring)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int[] counts = new int[26];
        for (char c : s1.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            counts[c - 'a']--;
        }

        for (int i : counts) {
            if (i != 0) return false;
        }
        return true;
    }
}
