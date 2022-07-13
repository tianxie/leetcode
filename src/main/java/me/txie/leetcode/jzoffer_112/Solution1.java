/**
 * LeetCode - jzoffer_112
 * https://leetcode.cn/problems/fpTFWP/
 */

package me.txie.leetcode.jzoffer_112;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        // 从矩阵中坐标为（i，j）的数字出发的最长递增路径的长度
        int[][] lengths = new int[matrix.length][matrix[0].length];
        int longest = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int length = dfs(matrix, lengths, i, j);
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    private int dfs(int[][] matrix, int[][] lengths, int i, int j) {
        if (lengths[i][j] != 0) {
            return lengths[i][j];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int length = 1;
        for (int[] dir : dirs) {
            int r = i + dir[0];
            int c = j + dir[1];
            if (r >= 0 && r < rows && c >= 0 && c < cols
                && matrix[r][c] > matrix[i][j]) {
                int path = dfs(matrix, lengths, r, c);
                length = Math.max(path + 1, length);
            }
        }
        lengths[i][j] = length;
        return length;
    }
}
// 时间复杂度：
// 空间复杂度：