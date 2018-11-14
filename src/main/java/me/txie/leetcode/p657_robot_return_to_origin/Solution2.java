/**
 * Leetcode - p657_robot_return_to_origin
 */
package me.txie.leetcode.p657_robot_return_to_origin;
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
class Solution2 implements Solution {


    @Override
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        char[] chars = moves.toCharArray();
        for (char c : chars) {
            count[c - 'A']++;
        }
        return (count['U' - 'A'] == count['D' - 'A']) && (count['L' - 'A'] == count['R' - 'A']);
    }
}
