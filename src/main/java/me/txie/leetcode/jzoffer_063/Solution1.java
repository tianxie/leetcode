/**
 * LeetCode - jzoffer_063
 * https://leetcode.cn/problems/UhWRSj/
 */

package me.txie.leetcode.jzoffer_063;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = buildTrie(dictionary);

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String prefix = findPrefix(root, words[i]);
            if (!prefix.isEmpty()) {
                words[i] = prefix;
            }
        }
        return String.join(" ", words);
    }

    private String findPrefix(TrieNode root, String word) {
        TrieNode node = root;
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (node.isWord || node.children[c - 'a'] == null) {
                break;
            }

            sb.append(c);
            node = node.children[c - 'a'];
        }

        return node.isWord ? sb.toString() : "";
    }

    private TrieNode buildTrie(List<String> dictionary) {
        TrieNode root = new TrieNode();
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

        return root;
    }

    private static class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }

}
// 时间复杂度：
// 空间复杂度：