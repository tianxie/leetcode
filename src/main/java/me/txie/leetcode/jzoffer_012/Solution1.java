/**
 * LeetCode - jzoffer_012
 * https://leetcode-cn.com/problems/tvdfij/
 */

package me.txie.leetcode.jzoffer_012;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum - nums[i] == total - sum) {
                return i;
            }
        }
        return -1;
    }
}
// 时间复杂度：
// 空间复杂度：