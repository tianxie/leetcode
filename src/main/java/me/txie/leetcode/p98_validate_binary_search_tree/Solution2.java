/**
 * LeetCode - p98_validate_binary_search_tree
 */
 
package me.txie.leetcode.p98_validate_binary_search_tree;
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
class Solution2 implements Solution {
    
    private TreeNode prev;
    
    @Override
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return isMonotonicIncreasing(root);
    }

    private boolean isMonotonicIncreasing(TreeNode node) {
        if (node == null) return true;
        if (isMonotonicIncreasing(node.left)) {
            if (prev != null && node.val <= prev.val) return false;
            prev = node;
            return isMonotonicIncreasing(node.right);
        }
        return false;
    }
}