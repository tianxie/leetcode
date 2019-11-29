package me.txie.leetcode.p208_implement_trie_prefix_tree;

class Trie {
    
    private Node root;
    
    private static class Node {
        private boolean inTrie;
        private Node[] next;
        
        Node() {
            this.next = new Node[26];
        }
    }

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                node.next[index] = new Node();
            }
            node = node.next[index];
        }
        node.inTrie = true;
    }

    private Node getNode(String path) {
        Node node = root;
        for (char c : path.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                return null;
            }
            node = node.next[index];
        }
        return node;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.inTrie;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node node = getNode(prefix);
        return node != null;
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("word");
        System.out.println(obj.search("word"));
        System.out.println(obj.startsWith("wo"));
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
