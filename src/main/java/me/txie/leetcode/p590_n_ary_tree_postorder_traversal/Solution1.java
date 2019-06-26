/**
 * LeetCode - p590_n_ary_tree_postorder_traversal
 */
package me.txie.leetcode.p590_n_ary_tree_postorder_traversal;

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
    public List<Integer> postorder(Node root) {
        List<Integer> values = new ArrayList<>();
        postorder(root, values);
        return values;
    }

    private void postorder(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            postorder(child, values);
        }
        values.add(node.val);
    }
}
