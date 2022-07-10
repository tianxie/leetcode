/**
 * LeetCode - jzoffer_108
 * https://leetcode.cn/problems/om3reC/
 */

package me.txie.leetcode.jzoffer_108;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        Set<String> notVisited = new HashSet<>(wordList);
        int length = 1;
        queue1.add(beginWord);

        while (!queue1.isEmpty()) {
            String word = queue1.remove();
            if (word.equals(endWord)) {
                return length;
            }

            List<String> neighbors = getNeighbors(word);
            for (String neighbor : neighbors) {
                if (notVisited.contains(neighbor)) {
                    queue2.add(neighbor);
                    notVisited.remove(neighbor);
                }
            }

            if (queue1.isEmpty()) {
                length++;
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
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
// 单向广度优先搜索
// 时间复杂度：
// 空间复杂度：