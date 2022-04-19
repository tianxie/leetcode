/**
 * LeetCode - jzoffer_028
 * https://leetcode-cn.com/problems/Qv1Da2/
 */
 
package me.txie.leetcode.jzoffer_028;
import java.util.*;
import me.txie.leetcode.util.*;

interface Solution {
    Node flatten(Node head);
}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
