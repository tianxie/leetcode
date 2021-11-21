/**
 * LeetCode - jzoffer_004
 * https://leetcode-cn.com/problems/single-number-ii/
 */

package me.txie.leetcode.jzoffer_004;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int singleNumber(int[] nums) {
        int[] bitSums = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                // 从左数的第 i 位
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % 3;
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)