/**
 * Leetcode - p461_hamming_distance
 */
package me.txie.leetcode.p461_hamming_distance;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

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
    public int hammingDistance(int x, int y) {
        int distance = 0;
        for (int i = 0; i < 32; i++) {
            distance += ((x >> i) & 1) ^ ((y >> i) & 1);
        }
        return distance;
    }
}
