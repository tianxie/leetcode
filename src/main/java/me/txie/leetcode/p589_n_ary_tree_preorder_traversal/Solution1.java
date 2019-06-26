/**
 * LeetCode - p589_n_ary_tree_preorder_traversal
 */
package me.txie.leetcode.p589_n_ary_tree_preorder_traversal;

import java.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */

class Solution1 implements Solution {

    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> values = new ArrayList<>();
        preorder(root, values);
        return values;
    }

    private void preorder(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        values.add(node.val);
        for (Node child : node.children) {
            preorder(child, values);
        }
    }
}
