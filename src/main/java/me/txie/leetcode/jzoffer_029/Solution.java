/**
 * LeetCode - jzoffer_029
 * https://leetcode-cn.com/problems/4ueAj6/
 */
 
package me.txie.leetcode.jzoffer_029;

interface Solution {
    Node insert(Node head, int insertVal);
}

class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};