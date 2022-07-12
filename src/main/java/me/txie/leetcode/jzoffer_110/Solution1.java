/**
 * LeetCode - jzoffer_110
 * https://leetcode.cn/problems/bP4bmD/
 */

package me.txie.leetcode.jzoffer_110;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        dfs(graph, 0, path, result);
        return result;
    }

    private void dfs(int[][] graph, int i, List<Integer> path, List<List<Integer>> result) {
        path.add(i);
        if (i == graph.length - 1) {
            result.add(new LinkedList<>(path));
        } else {
            for (int next : graph[i]) {
                dfs(graph, next, path, result);
            }
        }

        path.remove(path.size() - 1);
    }
}
// 时间复杂度：O(v+e)
// 空间复杂度：