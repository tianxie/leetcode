/**
 * Leetcode - p938_range_sum_of_bst
 */
package me.txie.leetcode.p938_range_sum_of_bst;
import java.rmi.activation.ActivationGroup_Stub;
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

    @Override
    public int rangeSumBST(TreeNode root, int L, int R) {
        return inorder(root, L, R);
    }

    private int inorder(TreeNode node, int L, int R) {
        if (node == null) return 0;
        if (node.val < L) {
            return inorder(node.right, L, R);
        } else if (node.val > R) {
            return inorder(node.left, L, R);
        }
        return node.val + inorder(node.left, L, R) + inorder(node.right, L, R);
    }
}
