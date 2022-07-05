package me.txie.leetcode.jzoffer_105;

public class Solution3 implements Solution {
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
        int area = 1;
        visited[i][j] = true;
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] direction : directions) {
            int row = i + direction[0];
            int col = j + direction[1];

            if (row >= 0 && row < grid.length
                && col >= 0 && col < grid[0].length
                && grid[row][col] == 1 && !visited[row][col]) {
                area += getArea(grid, visited, row, col);
            }
        }
        return area;
    }
}
// 基于递归的深度优先搜索
