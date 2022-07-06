/**
 * LeetCode - jzoffer_106
 * https://leetcode.cn/problems/vEAB3K/
 */

package me.txie.leetcode.jzoffer_106;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

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
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        colors[i] = color;

        while (!queue.isEmpty()) {
            Integer v = queue.remove();
            for (int neighbor : graph[v]) {
                if (colors[neighbor] >= 0) {
                    if (colors[neighbor] == colors[v]) {
                        return false;
                    }
                } else {
                    queue.add(neighbor);
                    colors[neighbor] = 1 - colors[v];
                }
            }
        }
        return true;
    }
}
// 广度优先搜索
// 时间复杂度：O(v+e)
// 空间复杂度：