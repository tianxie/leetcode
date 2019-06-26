/**
 * LeetCode - p530_minimum_absolute_difference_in_bst
 */
package me.txie.leetcode.p530_minimum_absolute_difference_in_bst;

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

    private int minDiff, prev;

    @Override
    public int getMinimumDifference(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = -1;
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev >= 0) {
            minDiff = Math.min(minDiff, Math.abs(node.val - prev));
        }
        prev = node.val;
        inorder(node.right);
    }
}
