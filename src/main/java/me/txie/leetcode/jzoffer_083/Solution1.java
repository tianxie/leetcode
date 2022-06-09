/**
 * LeetCode - jzoffer_083
 * https://leetcode.cn/problems/VvJkup/
 */

package me.txie.leetcode.jzoffer_083;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        helper(nums, 0, result);
        return result;
    }

    private void helper(int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            List<Integer> permutation = new LinkedList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int j = i; j < nums.length; j++) {
                exch(nums, i, j);
                helper(nums, i + 1, result);
                exch(nums, i, j);
            }
        }
    }

    private void exch(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
// 时间复杂度：O(n!)
// 空间复杂度：