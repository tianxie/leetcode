/**
 * LeetCode - p13_roman_to_integer
 */
 
package me.txie.leetcode.p13_roman_to_integer;
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

    private static final Map<Character, Integer> map = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    @Override
    public int romanToInt(String s) {
        int prev = 0, total = 0;
        for (char c : s.toCharArray()) {
            int curr = map.get(c);
            total += (curr > prev) ? (curr - 2 * prev) : curr;
            prev = curr;
        }
        return total;
    }
}