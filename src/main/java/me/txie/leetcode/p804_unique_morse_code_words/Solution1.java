/**
 * LeetCode - p804_unique_morse_code_words
 */
package me.txie.leetcode.p804_unique_morse_code_words;

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

    private static final String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    @Override
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String w : words) {
            StringBuilder s = new StringBuilder();
            for (char c : w.toCharArray()) {
                s.append(MORSE[c - 'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}
