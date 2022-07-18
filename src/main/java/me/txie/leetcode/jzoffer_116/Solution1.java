/**
 * LeetCode - jzoffer_116
 * https://leetcode.cn/problems/bLyHh0/
 */

package me.txie.leetcode.jzoffer_116;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int result = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                findCircle(isConnected, visited, i);
                result++;
            }
        }
        return result;
    }

    private void findCircle(int[][] isConnected, boolean[] visited, int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;
        while (!queue.isEmpty()) {
            int me = queue.remove();
            for (int friend = 0; friend < isConnected.length; friend++) {
                if (isConnected[me][friend] == 1 && !visited[friend]) {
                    queue.add(friend);
                    visited[friend] = true;
                }
            }
        }
    }
}
// 广度优先搜索
// 时间复杂度：O(n^2)
// 空间复杂度：