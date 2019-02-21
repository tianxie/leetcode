/**
 * Leetcode - p26_remove_duplicates_from_sorted_array
 */
package me.txie.leetcode.p26_remove_duplicates_from_sorted_array;
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
    public int removeDuplicates(int[] nums) {
        int last = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[last]) {
                last++;
                nums[last] = nums[i];
            }
        }

        return last + 1;
    }
}
