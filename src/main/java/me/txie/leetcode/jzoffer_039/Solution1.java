/**
 * LeetCode - jzoffer_039
 * https://leetcode-cn.com/problems/0ynMMM/
 */
 
package me.txie.leetcode.jzoffer_039;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];
            for (int j = i; j < heights.length; j++) {
                min = Math.min(heights[j], min);
                int area = (j - i + 1) * min;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }
}
// 蛮力法
// 时间复杂度：O(n^2)
// 空间复杂度：O(1)