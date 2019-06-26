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
class Solution2 implements Solution {

    private static final String[] ROWS = new String[]{
        "qwertyuiop",
        "asdfghjkl",
        "zxcvbnm"
    };

    @Override
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            int[] count = new int[3];
            char[] chars = s.toLowerCase().toCharArray();
            for (char c : chars) {
                for (int i = 0; i < 3; i++) {
                    if (ROWS[i].indexOf(c) >= 0) {
                        count[i]++;
                    }
                }
            }
            if ((count[0] > 0 && count[1] == 0 && count[2] == 0)
                || (count[1] > 0 && count[0] == 0 && count[2] == 0)
                || (count[2] > 0 && count[0] == 0 && count[1] == 0)) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
    }
}
