/**
 * LeetCode - p118_pascals_triangle
 */
package me.txie.leetcode.p118_pascals_triangle;

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


    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result;

        // 第0行总是1
        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            List<Integer> previousRow = result.get(i - 1);
            for (int j = 1; j < previousRow.size(); j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }

            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }
}
