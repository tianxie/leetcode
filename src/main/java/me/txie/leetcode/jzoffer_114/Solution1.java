/**
 * LeetCode - jzoffer_114
 * https://leetcode.cn/problems/Jf1JuT/
 */

package me.txie.leetcode.jzoffer_114;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        for (int i = 1; i < words.length; i++) {
            String w1 = words[i - 1];
            String w2 = words[i];
            if (w1.startsWith(w2) && !w1.equals(w2)) {
                return "";
            }

            for (int j = 0; j < w1.length() && j < w2.length(); j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);
                if (c1 != c2) {
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        inDegree.put(c2, inDegree.get(c2) + 1);
                    }
                    break;
                }
            }
        }

        Queue<Character> queue = new LinkedList<>();
        for (char ch : inDegree.keySet()) {
            if (inDegree.get(ch) == 0) {
                queue.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Character ch = queue.remove();
            sb.append(ch);
            for (char next : graph.get(ch)) {
                inDegree.put(next, inDegree.get(next) - 1);
                if (inDegree.get(next) == 0) {
                    queue.add(next);
                }
            }
        }
        return sb.length() == graph.size() ? sb.toString() : "";
    }
}
// 拓扑排序
// 时间复杂度：O(mn)，词列表的长度为m，平均每个单词的长度为n
// 空间复杂度：