/**
 * LeetCode - jzoffer_109
 * https://leetcode.cn/problems/zlDJc7/
 */

package me.txie.leetcode.jzoffer_109;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        String init = "0000";
        if (dead.contains(init) || dead.contains(target)) {
            return -1;
        }

        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        queue1.offer(init);
        visited.add(init);
        int steps = 0;
        while (!queue1.isEmpty()) {
            String curr = queue1.remove();
            if (curr.equals(target)) {
                return steps;
            }

            List<String> nexts = getNeighbors(curr);
            for (String next : nexts) {
                if (!dead.contains(next) && !visited.contains(next)) {
                    queue2.add(next);
                    visited.add(next);
                }
            }

            if (queue1.isEmpty()) {
                steps++;
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }

        return -1;
    }

    private List<String> getNeighbors(String curr) {
        List<String> nexts = new LinkedList<>();
        for (int i = 0; i < curr.length(); i++) {
            char ch = curr.charAt(i);

            char newCh = (ch == '0') ? '9' : (char) (ch - 1);
            StringBuilder sb = new StringBuilder(curr);
            sb.setCharAt(i, newCh);
            nexts.add(sb.toString());

            newCh = (ch == '9') ? '0' : (char) (ch + 1);
            sb.setCharAt(i, newCh);
            nexts.add(sb.toString());
        }
        
        return nexts;
    }
}
// 单向广度优先搜索
// 时间复杂度：
// 空间复杂度：