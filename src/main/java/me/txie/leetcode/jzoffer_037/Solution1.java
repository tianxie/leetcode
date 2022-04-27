/**
 * LeetCode - jzoffer_037
 * https://leetcode-cn.com/problems/XagZNi/
 */
 
package me.txie.leetcode.jzoffer_037;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (Integer asteroid : asteroids) {
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                stack.pop();
            }
            
            if (!stack.isEmpty() && asteroid < 0 && stack.peek() == -asteroid) {
                stack.pop();
            } else if (asteroid > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroid);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

}
// 时间复杂度：O(n)
// 空间复杂度：O(n)