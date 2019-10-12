/**
 * LeetCode - p137_single_number_ii
 */
 
package me.txie.leetcode.p137_single_number_ii;
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
    
    @Override
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0, threes = 0;
        for (int num : nums) {
            // twos的第i位等于1，表示该位出现过两次。
            twos |= ones & num;
            // ones的第i位等于1，表示该位出现过一次。
            ones ^= num;
            // threes的第i位等于1，表示该位出现过三次。
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}