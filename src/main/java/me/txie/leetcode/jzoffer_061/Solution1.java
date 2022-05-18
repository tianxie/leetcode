/**
 * LeetCode - jzoffer_061
 * https://leetcode.cn/problems/qn8gGX/
 */

package me.txie.leetcode.jzoffer_061;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (p1, p2) -> p2[0] + p2[1] - p1[0] - p1[1]
        );

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            for (int j = 0; j < Math.min(k, nums2.length); j++) {
                if (maxHeap.size() >= k) {
                    int[] root = maxHeap.peek();
                    if (nums1[i] + nums2[j] < root[0] + root[1]) {
                        maxHeap.poll();
                        maxHeap.offer(new int[]{nums1[i], nums2[j]});
                    }
                } else {
                    maxHeap.offer(new int[]{nums1[i], nums2[j]});
                }
            }
        }

        List<List<Integer>> result = new LinkedList<>();
        while (!maxHeap.isEmpty()) {
            int[] pair = maxHeap.poll();
            result.add(Arrays.asList(pair[0], pair[1]));
        }
        return result;
    }
}
// 时间复杂度：O(kklogk)
// 空间复杂度：