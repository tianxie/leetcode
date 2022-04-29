/**
 * LeetCode - jzoffer_039
 * https://leetcode-cn.com/problems/0ynMMM/
 */

package me.txie.leetcode.jzoffer_039;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        return helper(heights, 0, heights.length);
    }

    private int helper(int[] heights, int start, int end) {
        if (start == end) {
            return 0;
        }

        if (start + 1 == end) {
            return heights[start];
        }

        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (heights[i] < heights[minIndex]) {
                minIndex = i;
            }
        }

        int area = (end - start) * heights[minIndex];
        int left = helper(heights, start, minIndex);
        int right = helper(heights, minIndex + 1, end);

        area = Math.max(area, left);
        return Math.max(area, right);
    }
}
// 分治法
// 时间复杂度：O(nlogn)
// 空间复杂度：O(logn)