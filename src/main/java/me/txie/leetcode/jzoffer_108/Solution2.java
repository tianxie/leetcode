/**
 * LeetCode - jzoffer_108
 * https://leetcode.cn/problems/om3reC/
 */

package me.txie.leetcode.jzoffer_108;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Slf4j
class Solution2 implements Solution {

    @Override
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> notVisited = new HashSet<>(wordList);
        if (!notVisited.contains(endWord)) {
            return 0;
        }

        Set<String> set1 = new HashSet<>(); // 从起始节点朝目标节点
        Set<String> set2 = new HashSet<>(); // 从目标节点朝起始节点
        int length = 2; // 为什么初始值是2？
        set1.add(beginWord);
        set2.add(endWord);

        while (!set1.isEmpty() && !set2.isEmpty()) {
            // 从需要访问的节点数目少的方向搜索，这样做是为了缩小搜索的空间
            if (set2.size() < set1.size()) {
                Set<String> temp = set1;
                set1 = set2;
                set2 = temp;
            }

            Set<String> set3 = new HashSet<>(); // 存放与当前访问节点相邻的节点
            for (String word : set1) {
                List<String> neighbors = getNeighbors(word);
                for (String neighbor : neighbors) {
                    if (set2.contains(neighbor)) {
                        return length;
                    }

                    if (notVisited.contains(neighbor)) {
                        set3.add(neighbor);
                        notVisited.remove(neighbor);
                    }
                }
            }

            length++;
            set1 = set3;
        }

        return 0;
    }

    private List<String> getNeighbors(String word) {
        List<String> neighbors = new LinkedList<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char old = chars[i];

            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (old != ch) {
                    chars[i] = ch;
                    neighbors.add(new String(chars));
                }
            }
            chars[i] = old;
        }
        return neighbors;
    }
}
// 双向广度优先搜索
// 时间复杂度：
// 空间复杂度：