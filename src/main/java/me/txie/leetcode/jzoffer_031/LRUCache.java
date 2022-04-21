package me.txie.leetcode.jzoffer_031;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private ListNode head;
    private ListNode tail;
    private Map<Integer, ListNode> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
        
        this.map = new HashMap<>();
        this.capacity = capacity;

    }

    public int get(int key) {
        ListNode node = map.get(key);
        if (node == null) {
            return -1;
        }

        moveToTail(node, node.value);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            moveToTail(map.get(key), value);
        } else {
            if (map.size() == capacity) {
                ListNode toDelete = head.next;
                deleteNode(toDelete);
                map.remove(toDelete.key);
            }

            ListNode node = new ListNode(key, value);
            insertToTail(node);
            map.put(key, node);
        }
    }

    private void insertToTail(ListNode node) {
        tail.prev.next = node;
        node.prev = tail.prev;
        node.next = tail;
        tail.prev = node;
    }

    private void deleteNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToTail(ListNode node, int value) {
        deleteNode(node);

        node.value = value;
        insertToTail(node);
    }
}

class ListNode {
    public int key;
    public int value;
    public ListNode prev;
    public ListNode next;

    public ListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
