package me.txie.leetcode.jzoffer_039;

import java.util.Stack;

public class Solution3 implements Solution {
    @Override
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>(); // 存储柱子在数组中的下标
        stack.push(-1);

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1
                && heights[stack.peek()] >= heights[i]) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            
            stack.push(i);
        }

        while (stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)