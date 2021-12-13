/**
 * LeetCode - jzoffer_007
 * https://leetcode-cn.com/problems/3sum/
 */

package me.txie.leetcode.jzoffer_007;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length >= 3) {
            // 先对数组排序
            Arrays.sort(nums);

            int i = 0;
            while (i < nums.length - 2) {
                // 固定一个数字，找到另外两个和为-nums[i]的数字
                twoSum(nums, i, result);
                int temp = nums[i];
                while (i < nums.length && nums[i] == temp) {
                    ++i; // 跳过重复的数字
                }
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            if (nums[i] + nums[j] + nums[k] == 0) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                int temp = nums[j];
                while (nums[j] == temp && j < k) {
                    ++j;
                }
            } else if (nums[i] + nums[j] + nums[k] < 0) {
                ++j; // 跳过重复的数字
            } else {
                --k;
            }
        }
    }
}
// 时间复杂度：O(n^2)
// 空间复杂度：