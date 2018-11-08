/**
 * Leetcode - increasing_order_search_tree
 */
package me.txie.leetcode.increasing_order_search_tree;

import java.util.*;

import com.ciaoshen.leetcode.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution2 implements Solution {


    @Override
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inOrder(root, vals);
        TreeNode newRoot = new TreeNode(0);
        TreeNode current = newRoot;
        for (int v : vals) {
            current.right = new TreeNode(v);
            current = current.right;
        }
        return newRoot.right;
    }

    private void inOrder(TreeNode node, List<Integer> vals) {
        if (node == null) return;

        inOrder(node.left, vals);
        vals.add(node.val);
        inOrder(node.right, vals);
    }
}
