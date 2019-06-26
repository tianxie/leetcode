/**
 * LeetCode - p119_pascals_triangle_ii
 */
package me.txie.leetcode.p119_pascals_triangle_ii;

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
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (rowIndex == 0)
            return res;

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(res.get(j - 1) + res.get(j));
            }
            temp.add(1);
            res = temp;
        }
        return res;
    }
}
