package me.txie.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    
    public static ListNode of(List<Integer> values) {
        ListNode head = new ListNode(-1);
        ListNode x = head;
        
        for (int i : values) {
            x.next = new ListNode(i);
            x = x.next;
        }
        return head.next;
    }

    public String toString() {
        ListNode cursor = this;
        List<String> strings = new ArrayList<>();
        do {
            strings.add(cursor.val + "");
            cursor = cursor.next;
        } while (cursor != null);
        return String.join("->", strings);
    }
}

