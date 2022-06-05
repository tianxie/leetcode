/**
 * LeetCode - jzoffer_078
 * https://leetcode.cn/problems/vvXgSW/
 */

package me.txie.leetcode.jzoffer_078;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        while (!minHeap.isEmpty()) {
            ListNode least = minHeap.poll();
            curr.next = least;
            curr = least;
            
            if (least.next != null) {
                minHeap.offer(least.next);
            }
        }
        return dummy.next;
    }
}
// 最小堆方法，k个链表，总共n个节点
// 时间复杂度：O(nlogk)
// 空间复杂度：O(k)