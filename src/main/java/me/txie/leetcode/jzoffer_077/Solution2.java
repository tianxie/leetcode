/**
 * LeetCode - jzoffer_077
 * https://leetcode.cn/problems/7WHec2/
 */

package me.txie.leetcode.jzoffer_077;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length += 1;
            node = node.next;
        }

        ListNode dummy = new ListNode(0, head);
        for (int sz = 1; sz < length; sz = sz + sz) {
            ListNode prev = dummy, curr = dummy.next;
            while (curr != null) {
                ListNode head1 = curr;
                for (int i = 1; i < sz && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode head2 = curr.next;
                curr.next = null; // head1链表结尾
                curr = head2;
                for (int i = 1; i < sz && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode next = null; // 下次合并的起始节点
                if (curr != null) {
                    next = curr.next;
                    curr.next = null; // head2链表结尾
                }
                
                prev.next = merge(head1, head2); // 与上个链表拼接
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;
            }
        }
        return dummy.next;
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
// 自底向上归并排序
// 时间复杂度：O(nlogn)
// 空间复杂度：O(1)