/**
 * LeetCode - jzoffer_011
 * https://leetcode-cn.com/problems/A1NYOS/
 */

package me.txie.leetcode.jzoffer_011;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findMaxLength(int[] nums) {
        // 哈希表的键是从第1个数字开始累加到当前扫描到的数字之和，而值是当前扫描的数字的下标。
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        
        return maxLength;
    }
}
// 把 0 替换成 -1， 求和为 0 的最长连续子数组的长度。
// 时间复杂度：O（n)
// 空间复杂度：O（n)