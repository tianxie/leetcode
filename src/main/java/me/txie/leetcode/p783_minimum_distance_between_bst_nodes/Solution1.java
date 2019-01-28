/**
 * Leetcode - p783_minimum_distance_between_bst_nodes
 */
package me.txie.leetcode.p783_minimum_distance_between_bst_nodes;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    private int minDiff;
    private TreeNode prev;

    @Override
    public int minDiffInBST(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(node.val - prev.val));
        }
        prev = node;
        inorder(node.right);
    }
}
