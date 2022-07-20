/**
 * LeetCode - jzoffer_119
 * https://leetcode.cn/problems/WhsWhI/
 */

package me.txie.leetcode.jzoffer_119;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        while (!set.isEmpty()) {
            Iterator<Integer> iterator = set.iterator();
            longest = Math.max(longest, bfs(set, iterator.next()));
        }
        return longest;
    }

    private int bfs(Set<Integer> set, Integer num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        set.remove(num);
        int length = 1;
        while (!queue.isEmpty()) {
            int i = queue.poll();
            int[] neighbors = new int[]{i - 1, i + 1};
            for (int neighbor : neighbors) {
                if (set.contains(neighbor)) {
                    queue.offer(neighbor);
                    set.remove(neighbor);
                    length++;
                }
            }
        }
        return length;
    }
}
// 广度优先搜索
// 时间复杂度：O(n)
// 空间复杂度：