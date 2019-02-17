/**
 * Leetcode - p119_pascals_triangle_ii
 */
package me.txie.leetcode.p119_pascals_triangle_ii;
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
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return Arrays.asList(1);

        List<Integer> prevRow = getRow(rowIndex - 1);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i < prevRow.size(); i++) {
            int sum = prevRow.get(i - 1) + prevRow.get(i);
            currentRow.add(sum);
        }

        currentRow.add(1);
        return currentRow;
    }
}
