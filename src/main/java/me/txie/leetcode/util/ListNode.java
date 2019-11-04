package me.txie.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    
    public static ListNode of(int... values) {
        ListNode dummyHead = new ListNode(-1);
        ListNode p = dummyHead;
        
        for (int i : values) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return dummyHead.next;
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

