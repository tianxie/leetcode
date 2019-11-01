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
class Solution1 implements Solution {
    
    // O(n) time, O(n) space
    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;
        return (low == null || node.val > low) && (high == null || node.val < high)
            && isValidBST(node.left, low, node.val)
            && isValidBST(node.right, node.val, high);
    }
}