/**
 * LeetCode - jzoffer_067
 * https://leetcode.cn/problems/ms70jA/
 */

package me.txie.leetcode.jzoffer_067;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findMaximumXOR(int[] nums) {
        TrieNode root = buildTrie(nums);
        int max = 0;
        for (int num : nums) {
            TrieNode node = root;
            int xor = 0;
            // 从高位开始扫描整数num的每个数位
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                // 优先选择相反的数位
                if (node.children[1 - bit] != null) {
                    xor = (xor << 1) + 1;
                    node = node.children[1 - bit];
                } else {
                    xor = xor << 1;
                    node = node.children[bit];
                }
            }
            max = Math.max(max, xor);
        }
        return max;
    }

    private TrieNode buildTrie(int[] nums) {
        TrieNode root = new TrieNode();
        for (int num : nums) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }
        return root;
    }

    private static class TrieNode {
        TrieNode[] children;

        public TrieNode() {
            this.children = new TrieNode[2];
        }
    }
}
// 时间复杂度：O(n)
// 空间复杂度：