/**
 * LeetCode - p138_copy_list_with_random_pointer
 */
 
package me.txie.leetcode.p138_copy_list_with_random_pointer;
import java.util.*;
import me.txie.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {
    
    // O(n) runtime, O(n) space – Hash table
    @Override
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node p = head;
        Node dummy = new Node();
        Node q = dummy;
        while (p != null) {
            q.next = new Node(p.val, p.next, p.random);
            map.put(p, q.next);
            p = p.next;
            q = q.next;
        }
        p = head;
        q = dummy;
        while (p != null) {
            q.next.random = map.get(p.random);
            p = p.next;
            q = q.next;
        }
        return dummy.next;
    }
}