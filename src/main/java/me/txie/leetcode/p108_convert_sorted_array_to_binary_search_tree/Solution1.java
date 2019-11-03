/**
 * LeetCode - p108_convert_sorted_array_to_binary_search_tree
 */
 
package me.txie.leetcode.p108_convert_sorted_array_to_binary_search_tree;
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
    
    // O(n) runtime, O(log n) stack space – Divide and conquer
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = (lo + hi) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, lo, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, hi);
        return node;
    }
}