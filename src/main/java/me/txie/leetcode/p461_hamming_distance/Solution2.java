/**
 * LeetCode - p461_hamming_distance
 */
package me.txie.leetcode.p461_hamming_distance;

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
    public int hammingDistance(int x, int y) {
        int distance = 0;
        while (x > 0 || y > 0) {
            if ((x & 1) != (y & 1)) {
                distance++;
            }
            x >>= 1;
            y >>= 1;
        }
        return distance;
    }
}
