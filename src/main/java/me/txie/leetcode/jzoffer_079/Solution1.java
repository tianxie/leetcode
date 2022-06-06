/**
 * LeetCode - jzoffer_079
 * https://leetcode.cn/problems/TVdhkn/
 */

package me.txie.leetcode.jzoffer_079;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length == 0) {
            return result;
        }

        helper(nums, 0, new LinkedList<Integer>(), result);
        return result;
    }

    private void helper(int[] nums, int index, LinkedList<Integer> subset, List<List<Integer>> result) {
        if (index == nums.length) {
            // 在result中添加subset的拷贝，因为接下来还要修改subset以便得到其他的子集
            result.add(new LinkedList<>(subset));
        } else if (index < nums.length) {
            // 不将该数组添加到子集的情形
            helper(nums, index + 1, subset, result);

            subset.add(nums[index]);
            helper(nums, index + 1, subset, result);
            subset.removeLast();
        }
    }
}
// 时间复杂度：O(2^n)
// 空间复杂度：