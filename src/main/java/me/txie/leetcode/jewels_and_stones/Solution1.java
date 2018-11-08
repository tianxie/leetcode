/**
 * Leetcode - jewels_and_stones
 */
package me.txie.leetcode.jewels_and_stones;
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
    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (char j : J.toCharArray()) {
            for(char s : S.toCharArray()) {
                if (j == s) num++;
            }
        }
        return num;
    }
}
