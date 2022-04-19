/**
 * LeetCode - jzoffer_029
 * https://leetcode-cn.com/problems/4ueAj6/
 */

package me.txie.leetcode.jzoffer_029;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null) {
            head = node;
            head.next = head;
        } else if (head.next == null) {
            head.next = node;
            node.next = head;
        } else {
            insertToList(head, node);
        }

        return head;
    }

    private void insertToList(Node head, Node node) {
        Node cur = head;
        Node next = head.next;
        Node biggest = head;
        while (!(cur.val <= node.val && next.val >= node.val)
            && next != head) {
            cur = next;
            next = next.next;
            if (cur.val >= biggest.val) {
                biggest = cur;
            }
        }

        if (cur.val <= node.val && next.val >= node.val) {
            cur.next = node;
            node.next = next;
        } else {
            node.next = biggest.next;
            biggest.next = node;
        }
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)