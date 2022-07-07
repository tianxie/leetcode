/**
 * LeetCode - jzoffer_107
 * https://leetcode.cn/problems/2bCMpM/
 */

package me.txie.leetcode.jzoffer_107;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dists = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    dists[i][j] = 0; // 距离最近的0是自己
                } else {
                    dists[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!queue.isEmpty()) {
            int[] pos = queue.remove();
            int dist = dists[pos[0]][pos[1]];
            for (int[] dir : dirs) {
                int r = pos[0] + dir[0];
                int c = pos[1] + dir[1];
                if (r >= 0 && r < rows
                    && c >= 0 && c < cols) {
                    if (dists[r][c] > dist + 1) {
                        dists[r][c] = dist + 1;
                        queue.add(new int[]{r, c});
                    }
                }
            }
        }

        return dists;
    }
}
// 时间复杂度：O(mn)
// 空间复杂度：