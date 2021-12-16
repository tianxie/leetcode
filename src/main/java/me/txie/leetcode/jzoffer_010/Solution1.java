/**
 * LeetCode - jzoffer_010
 * https://leetcode-cn.com/problems/QTMn0o/
 */

package me.txie.leetcode.jzoffer_010;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumToCount = new HashMap<>();
        sumToCount.put(0, 1);

        int result = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            result += sumToCount.getOrDefault(sum - k, 0);
            sumToCount.put(sum, sumToCount.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)