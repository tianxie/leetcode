/**
 * LeetCode - p110_balanced_binary_tree
 */
 
package me.txie.leetcode.p110_balanced_binary_tree;
import java.util.*;
import me.txie.leetcode.util.*;

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
    
    // O(n) runtime, O(n) stack space – Bottom-up recursion
    @Override
    public boolean isBalanced(TreeNode root) {
        return depthDifference(root) != -1;
    }

    private int depthDifference(TreeNode node) {
        if (node == null) return 0;
        int L = depthDifference(node.left);
        if (L == -1) return -1;
        int R = depthDifference(node.right);
        if (R == -1) return -1;
        return Math.abs(L - R) <= 1 ? (Math.max(L, R) + 1) : -1;
    }
}