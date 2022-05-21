package me.txie.leetcode.jzoffer_064;

public class MagicDictionary {

    private final TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        this.root = new TrieNode();
    }

    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isWord = true;
        }
    }

    public boolean search(String searchWord) {
        // 深度优先搜索
        return dfs(root, searchWord, 0, 0);
    }

    private boolean dfs(TrieNode node, String searchWord, int i, int edit) {
        if (node == null) {
            return false;
        }

        if (node.isWord && i == searchWord.length() && edit == 1) {
            return true;
        }

        if (i < searchWord.length() && edit <= 1) {
            boolean found = false;
            for (int j = 0; j < 26 && !found; j++) {
                int next = (j == searchWord.charAt(i) - 'a') ? edit : edit + 1;
                found = dfs(node.children[j], searchWord, i + 1, next);
            }
            return found;
        }
        return false;
    }

    private static class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */