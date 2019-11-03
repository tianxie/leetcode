/**
 * LeetCode - p111_minimum_depth_of_binary_tree
 */
 
package me.txie.leetcode.p111_minimum_depth_of_binary_tree;

import me.txie.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution2 implements Solution {
    
    // O(n) runtime, O(n) space – Breadth-first traversal
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode rightMost = root;
        int depth = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) break;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            if (node == rightMost) {
                depth++;
                rightMost = (node.right != null) ? node.right : node.left;
            }
        }
        return depth;
    }
}