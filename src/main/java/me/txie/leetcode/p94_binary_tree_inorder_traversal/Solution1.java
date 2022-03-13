/**
 * LeetCode - p94_binary_tree_inorder_traversal
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
 
package me.txie.leetcode.p94_binary_tree_inorder_traversal;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        dfs(node.left, result);
        result.add(node.val);
        dfs(node.right, result);
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(h)