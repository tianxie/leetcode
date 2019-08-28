/**
 * LeetCode - p163_missing_ranges
 */
 
package me.txie.leetcode.p163_missing_ranges;
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

    // 在数组的前后分别插入 start-1 和 end+1，可避免所有的特殊情况。
    @Override
    public List<String> findMissingRanges(int[] vals, int start, int end) {
        List<String> ranges = new ArrayList<>();
        int prev = start - 1;
        for (int i = 0; i <= vals.length; i++) {
            int curr = (i == vals.length) ? (end + 1) : vals[i];
            if (curr - prev > 1) {
                ranges.add(getRange(prev + 1, curr - 1));
            }
            prev = curr;
        }
        return ranges;
    }

    private String getRange(int from, int to) {
        return (from == to) ? String.valueOf(from) : (from + "->" + to);
    }
}