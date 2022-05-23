package me.txie.leetcode.jzoffer_066;

public class MapSum {

    private final TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        this.root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode node = root;
        for (char c : key.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.val = val;
    }

    public int sum(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return 0;
            }
            node = node.children[c - 'a'];
        }
        return getSum(node);
    }

    private int getSum(TrieNode node) {
        if (node == null) {
            return 0;
        }

        int result = node.val;
        for (TrieNode child : node.children) {
            result += getSum(child);
        }
        return result;
    }

    private static class TrieNode {
        TrieNode[] children;
        int val;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */