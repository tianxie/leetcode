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
class Solution2 implements Solution {
    
    // O(n) runtime, O(1) space – Modify original structure
    @Override
    public Node copyRandomList(Node head) {
        Node p = head;
        while (p != null) {
            Node next = p.next;
            Node copy = new Node(p.val, p.next, p.random);
            p.next = copy;
            copy.next = next;
            p = next;
        }
        p = head;
        while (p != null) {
            p.next.random = (p.random != null) ? p.random.next : null;
            p = p.next.next;
        }
        p = head;
        Node headCopy = (p != null) ? p.next : null;
        while (p != null) {
            Node copy = p.next;
            p.next = copy.next;
            p = p.next;
            copy.next = (p != null) ? p.next : null;
        }
        return headCopy;
    }
}