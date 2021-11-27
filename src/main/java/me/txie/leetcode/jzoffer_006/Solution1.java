/**
 * LeetCode - jzoffer_006
 * https://leetcode-cn.com/problems/kLl5u1/
 */

package me.txie.leetcode.jzoffer_006;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0, hi = numbers.length - 1;

        while (lo < hi) {
            int sum = numbers[lo] + numbers[hi];
            if (sum < target) {
                lo += 1;
            } else if (sum > target) {
                hi -= 1;
            } else {
                break;
            }
        }
        return new int[]{lo, hi};
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)