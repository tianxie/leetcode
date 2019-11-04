/**
 * LeetCode - p70_climbing_stairs
 */
 
package me.txie.leetcode.p70_climbing_stairs;
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
    
    // O(n) runtime, O(1) space – Dynamic programming
    @Override
    public int climbStairs(int n) {
        int p = 1, q = 1;
        for (int i = 2; i <= n; i++) {
            int temp = q;
            q += p;
            p = temp;
        }
        return q;
    }
}