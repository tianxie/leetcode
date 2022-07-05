/**
 * LeetCode - jzoffer_105
 * https://leetcode.cn/problems/ZL6zAn/
 */

package me.txie.leetcode.jzoffer_105;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = getArea(grid, visited, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    private int getArea(int[][] grid, boolean[][] visited, int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        visited[i][j] = true;

        int[][] directions = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int area = 0;
        while (!stack.isEmpty()) {
            int[] pos = stack.pop();
            area++;

            for (int[] direction : directions) {
                int row = pos[0] + direction[0];
                int col = pos[1] + direction[1];

                if (row >= 0 && row < grid.length
                    && col >= 0 && col < grid[0].length
                    && grid[row][col] == 1 && !visited[row][col]) {
                    stack.push(new int[]{row, col});
                    visited[row][col] = true;
                }
            }
        }
        return area;
    }
}
// 深度优先搜索
// 时间复杂度：
// 空间复杂度：