/**
 * LeetCode - jzoffer_021
 * https://leetcode-cn.com/problems/SLwz0R/
 */
 
package me.txie.leetcode.jzoffer_021;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode front = head, back = dummy;
        for (int i = 0; i < n; i++) {
            front = front.next;
        }
        
        while (front != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        
        return dummy.next;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(1)