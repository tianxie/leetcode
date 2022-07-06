package me.txie.leetcode.jzoffer_106;

import java.util.Arrays;

public class Solution3 implements Solution {
    @Override
    public boolean isBipartite(int[][] graph) {
        int size = graph.length;
        int[] colors = new int[size]; // 记录每个节点的颜色
        Arrays.fill(colors, -1);
        for (int i = 0; i < size; i++) {
            if (colors[i] == -1) {
                if (!setColor(graph, colors, i, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean setColor(int[][] graph, int[] colors, int i, int color) {
        if (colors[i] >= 0) {
            return colors[i] == color;
        }

        colors[i] = color;
        for (int neighbor : graph[i]) {
            if (!setColor(graph, colors, neighbor, 1 - color)) {
                return false;
            }
        }
        return true;
    }
}
// 基于递归的深度优先搜索
// 时间复杂度：O(v+e)
// 空间复杂度：