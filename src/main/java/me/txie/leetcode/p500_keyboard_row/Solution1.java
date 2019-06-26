/**
 * LeetCode - p500_keyboard_row
 */
package me.txie.leetcode.p500_keyboard_row;

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

    private final int[] LETTER = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

    @Override
    public String[] findWords(String[] words) {
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (isOneRow(words[i])) {
                exch(words, i, j++);
            }
        }
        return Arrays.copyOfRange(words, 0, j);
    }

    private boolean isOneRow(String s) {
        char[] chars = s.toCharArray();
        int row = LETTER[getOffset(chars[0])];
        for (int i = 1; i < chars.length; i++) {
            if (LETTER[getOffset(chars[i])] != row) return false;
        }
        return true;
    }

    private void exch(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }

    private int getOffset(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        }
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        }
        return -1;
    }
}
