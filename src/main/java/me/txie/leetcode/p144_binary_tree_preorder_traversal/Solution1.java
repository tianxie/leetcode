/**
 * LeetCode - p144_binary_tree_preorder_traversal
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */

package me.txie.leetcode.p144_binary_tree_preorder_traversal;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> nodes) {
        if (node == null) {
            return;
        }

        nodes.add(node.val);
        dfs(node.left, nodes);
        dfs(node.right, nodes);
    }
}
// 二叉树的前序遍历，递归解法
// 时间复杂度：O(n)
// 空间复杂度：O(h)，h是二叉树的高度