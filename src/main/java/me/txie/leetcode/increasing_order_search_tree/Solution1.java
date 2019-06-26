/**
 * LeetCode - increasing_order_search_tree
 */
package me.txie.leetcode.increasing_order_search_tree;

import me.txie.leetcode.util.TreeNode;

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

    private TreeNode current;

    @Override
    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(0);
        current = newRoot;
        inOrder(root);
        return newRoot.right;
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inOrder(node.right);
    }
}
