/**
 * LeetCode - jzoffer_026
 * https://leetcode-cn.com/problems/LGjMqU/
 */

package me.txie.leetcode.jzoffer_026;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy; // 为什么要从dummy出发？
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }

        // 从中间断开链表
        ListNode temp = slow.next;
        slow.next = null;

        merge(head, reverse(temp), dummy);
    }

    private void merge(ListNode l1, ListNode l2, ListNode head) {
        ListNode prev = head;
        while (l1 != null && l2 != null) {
            ListNode temp = l1.next;

            prev.next = l1;
            l1.next = l2;
            prev = l2;

            l1 = temp;
            l2 = l2.next;
        }

        if (l1 != null) {
            prev.next = l1;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
// 时间复杂度：
// 空间复杂度：