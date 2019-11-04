/**
 * LeetCode - p23_merge_k_sorted_lists
 */
 
package me.txie.leetcode.p23_merge_k_sorted_lists;
import java.util.*;
import me.txie.leetcode.util.*;

import static java.util.Comparator.comparingInt;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    // O(nk log k) runtime, O(k) space – Heap
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        Queue<ListNode> queue = new PriorityQueue<>(lists.length, comparingInt(node -> node.val));
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            p = p.next;
            if (node.next != null) {
                queue.add(node.next);
            }
        }
        return dummyHead.next;
    }
}