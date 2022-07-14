/**
 * LeetCode - jzoffer_113
 * https://leetcode.cn/problems/QA2IGt/
 */

package me.txie.leetcode.jzoffer_113;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new LinkedList<>());
        }

        int[] inDegree = new int[numCourses];
        for (int[] prereq : prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
            inDegree[prereq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> result = new LinkedList<>();
        while (!queue.isEmpty()) {
            int course = queue.remove();
            result.add(course);

            for (int next : graph.get(course)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.add(next);
                }
            }
        }

        return result.size() == numCourses
            ? result.stream().mapToInt(i -> i).toArray()
            : new int[0];
    }
}
// 有向无环图的拓扑排序算法
// 时间复杂度：O(v + e)
// 空间复杂度：