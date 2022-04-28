/**
 * LeetCode - jzoffer_038
 * https://leetcode-cn.com/problems/iIQa4I/
 */
package me.txie.leetcode.jzoffer_038;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>(); // 每天的温度在数组中的下标
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {
                Integer prev = stack.pop();
                result[prev] = i - prev;
            }
            stack.push(i);
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)
