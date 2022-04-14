/**
 * LeetCode - jzoffer_022
 * https://leetcode-cn.com/problems/c32eOV/
 */
 
package me.txie.leetcode.jzoffer_022;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public ListNode detectCycle(ListNode head) {
        ListNode nodeInLoop = getNodeInLoop(head);
        if (nodeInLoop == null) {
            return null;
        }
        
        ListNode node = head;
        while (node != nodeInLoop) {
            node = node.next;
            nodeInLoop = nodeInLoop.next;
        }
        return node;
    }

    private ListNode getNodeInLoop(ListNode head) {
        if (head == null || head.next == null) {
            // 链表为空，或者只有一个节点
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast) {
                return slow;
            }
            // slow走一步，fast走两步
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return null;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)