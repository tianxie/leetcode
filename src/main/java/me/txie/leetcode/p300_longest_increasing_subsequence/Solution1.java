/**
 * Leetcode - p300_longest_increasing_subsequence
 */
package me.txie.leetcode.p300_longest_increasing_subsequence;
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

    // O(n^2)
    @Override
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        // dp[i] 存放的是以 nums[i] 结尾的最长上升子序列的长度
        int[] dp = new int[len];

        // 每个元素都是它本身的最长上升子序列
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
        }

        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}
