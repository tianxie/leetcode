/**
 * LeetCode - jzoffer_115
 * https://leetcode.cn/problems/ur2n8P/
 */

package me.txie.leetcode.jzoffer_115;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean sequenceReconstruction(int[] nums, int[][] sequences) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        for (int[] seq : sequences) {
            for (int num : seq) {
                if (num < 1 || num > nums.length) {
                    return false;
                }
                graph.putIfAbsent(num, new HashSet<>());
                inDegree.putIfAbsent(num, 0);
            }

            for (int i = 0; i < seq.length - 1; i++) {
                int num1 = seq[i];
                int num2 = seq[i + 1];
                if (!graph.get(num1).contains(num2)) {
                    graph.get(num1).add(num2);
                    inDegree.put(num2, inDegree.get(num2) + 1);
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int num : inDegree.keySet()) {
            if (inDegree.get(num) == 0) {
                queue.add(num);
            }
        }

        List<Integer> result = new LinkedList<>();
        while (queue.size() == 1) {
            Integer num = queue.remove();
            result.add(num);
            for (int next : graph.get(num)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.add(next);
                }
            }
        }
        return Arrays.equals(result.stream().mapToInt(i -> i).toArray(), nums);
    }
}
// 拓扑排序
// 时间复杂度：O(v+e)
// 空间复杂度：