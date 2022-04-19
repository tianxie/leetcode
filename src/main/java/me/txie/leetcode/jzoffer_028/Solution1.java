/**
 * LeetCode - jzoffer_028
 * https://leetcode-cn.com/problems/Qv1Da2/
 */
 
package me.txie.leetcode.jzoffer_028;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public Node flatten(Node head) {
        flattenGetTail(head);
        return head;
    }

    private Node flattenGetTail(Node head) {
        Node node = head;
        Node tail = null;
        while (node != null) {
            Node next = node.next;
            if (node.child != null) {
                Node child = node.child; // 子链表的头节点
                Node childTail = flattenGetTail(node.child); // 子链表的尾节点
                
                node.child = null;
                node.next = child;
                child.prev = node;
                childTail.next = next;
                if (next != null) {
                    next.prev = childTail;
                }
                
                tail = childTail;
            } else {
                tail = node;
            }
            
            node = next;
        }
        return tail;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(k)，k是链表嵌套的层数