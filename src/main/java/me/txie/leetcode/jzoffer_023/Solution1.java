/**
 * LeetCode - jzoffer_023
 * https://leetcode-cn.com/problems/3u1WK4/
 */

package me.txie.leetcode.jzoffer_023;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = countList(headA);
        int countB = countList(headB);

        ListNode longHead = (countA > countB) ? headA : headB;
        ListNode shortHead = (countA > countB) ? headB : headA;
        int steps = Math.abs(countA - countB);

        // 长链表先走
        for (int i = 0; i < steps; i++) {
            longHead = longHead.next;
        }

        while (longHead != shortHead) {
            longHead = longHead.next;
            shortHead = shortHead.next;
        }
        return longHead;
    }

    private int countList(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
// 时间复杂度：O(m+n)
// 空间复杂度：O(1)