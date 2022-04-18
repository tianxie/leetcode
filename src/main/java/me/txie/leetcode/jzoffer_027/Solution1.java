/**
 * LeetCode - jzoffer_027
 * https://leetcode-cn.com/problems/aMhZSa/
 */

package me.txie.leetcode.jzoffer_027;

import lombok.extern.slf4j.Slf4j;
import me.txie.leetcode.util.ListNode;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        if (fast.next != null) {
            // 链表节点数是奇数，跳过中间节点
            secondHalf = slow.next.next;
        }

        slow.next = null;
        return equals(reverseList(head), secondHalf);
    }

    private boolean equals(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1 == null && head2 == null;
    }

    private ListNode reverseList(ListNode head) {
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