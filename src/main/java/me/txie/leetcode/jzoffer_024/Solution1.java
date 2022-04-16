/**
 * LeetCode - jzoffer_024
 * https://leetcode-cn.com/problems/UHnkqh/
 */
 
package me.txie.leetcode.jzoffer_024;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public ListNode reverseList(ListNode head) {
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