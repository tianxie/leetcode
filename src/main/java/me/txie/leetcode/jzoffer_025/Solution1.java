/**
 * LeetCode - jzoffer_025
 * https://leetcode-cn.com/problems/lMSNwu/
 */

package me.txie.leetcode.jzoffer_025;

import lombok.extern.slf4j.Slf4j;
import me.txie.leetcode.util.ListNode;

@Slf4j
class Solution1 implements Solution {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        return add(l1, l2);
    }

    private ListNode add(ListNode head1, ListNode head2) {
        int carry = 0;
        ListNode dummy = new ListNode(-1);

        while (head1 != null || head2 != null) {
            int val = (head1 == null ? 0 : head1.val)
                + (head2 == null ? 0 : head2.val)
                + carry;
            carry = (val >= 10) ? 1 : 0;
            val = (val >= 10) ? val - 10 : val;
            ListNode node = new ListNode(val);

            node.next = dummy.next;
            dummy.next = node;
            head1 = (head1 == null) ? null : head1.next;
            head2 = (head2 == null) ? null : head2.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            node.next = dummy.next;
            dummy.next = node;
        }
        return dummy.next;
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
// 时间复杂度：O(n)
// 空间复杂度：O(1)