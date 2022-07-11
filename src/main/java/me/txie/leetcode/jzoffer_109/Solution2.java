/**
 * LeetCode - jzoffer_109
 * https://leetcode.cn/problems/zlDJc7/
 */

package me.txie.leetcode.jzoffer_109;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int openLock(String[] deadends, String target) {
        String init = "0000";
        if (init.equals(target)) {
            return 0;
        }

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        visited.add(init);
        if (dead.contains(init) || dead.contains(target)) {
            return -1;
        }

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        int steps = 1;
        set1.add(init);
        set2.add(target);
        while (!set1.isEmpty() && !set2.isEmpty()) {
            // 从需要访问的节点数目少的方向搜索，这样做是为了缩小搜索的空间
            if (set2.size() < set1.size()) {
                Set<String> temp = set1;
                set1 = set2;
                set2 = temp;
            }

            Set<String> set3 = new HashSet<>(); // 存放与当前访问节点相邻的节点
            for (String curr : set1) {
                List<String> nexts = getNeighbors(curr);
                for (String next : nexts) {
                    if (set2.contains(next)) {
                        return steps;
                    }

                    if (!dead.contains(next) && !visited.contains(next)) {
                        set3.add(next);
                        visited.add(next);
                    }
                }
            }

            steps++;
            set1 = set3;
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
// 双向广度优先搜索
// 时间复杂度：
// 空间复杂度：