/**
 * LeetCode - jzoffer_111
 * https://leetcode.cn/problems/vlzXQL/
 */

package me.txie.leetcode.jzoffer_111;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String from = queries.get(i).get(0);
            String to = queries.get(i).get(1);

            if (!graph.containsKey(from) || !graph.containsKey(to)) {
                result[i] = -1.0;
            } else {
                Set<String> visited = new HashSet<>();
                result[i] = dfs(graph, from, to, visited);
            }
        }
        return result;
    }

    private double dfs(Map<String, Map<String, Double>> graph, String from, String to, Set<String> visited) {
        if (from.equals(to)) {
            return 1.0;
        }

        visited.add(from);
        for (Map.Entry<String, Double> entry : graph.get(from).entrySet()) {
            String next = entry.getKey();
            if (!visited.contains(next)) {
                double nextValue = dfs(graph, next, to, visited);
                if (nextValue > 0) {
                    return entry.getValue() * nextValue;
                }
            }
        }

        visited.remove(from);
        return -1.0;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String v1 = equations.get(i).get(0);
            String v2 = equations.get(i).get(1);

            graph.putIfAbsent(v1, new HashMap<>());
            graph.get(v1).put(v2, values[i]);

            graph.putIfAbsent(v2, new HashMap<>());
            graph.get(v2).put(v1, 1.0 / values[i]);
        }
        return graph;
    }
}
// 时间复杂度：
// 空间复杂度：