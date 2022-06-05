/**
 * LeetCode - jzoffer_078
 * https://leetcode.cn/problems/vvXgSW/
 */

package me.txie.leetcode.jzoffer_078;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return mergeLists(lists, 0, lists.length);
    }

    private ListNode mergeLists(ListNode[] lists, int start, int end) {
        if (end - start == 1) {
            return lists[start];
        }

        int mid = (start + end) / 2;
        ListNode head1 = mergeLists(lists, start, mid);
        ListNode head2 = mergeLists(lists, mid, end);
        return merge(head1, head2);
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }

            cur = cur.next;
        }

        cur.next = (head1 == null) ? head2 : head1;
        return dummy.next;
    }
}
// 递归方法，k个链表，总共n个节点
// 时间复杂度：O(nlogk)
// 空间复杂度：O(logk)