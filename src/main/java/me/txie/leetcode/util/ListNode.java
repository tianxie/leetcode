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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListNode)) {
            return false;
        }
        
        ListNode e1 = this;
        ListNode e2 = (ListNode) obj;
        while (e1 != null && e2 != null && e1.val == e2.val) {
            e1 = e1.next;
            e2 = e2.next;
        }
        return (e1 == null) && (e2 == null);
    }
}

