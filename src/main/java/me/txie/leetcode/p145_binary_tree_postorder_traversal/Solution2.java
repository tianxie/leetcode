/**
 * LeetCode - p145_binary_tree_postorder_traversal
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */
 
package me.txie.leetcode.p145_binary_tree_postorder_traversal;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.peek();
            if (cur.right != null && cur.right != prev) {
                // 还没有遍历过当前节点的右子树，先遍历右子树
                cur = cur.right;
            } else {
                // 已经遍历过当前节点的右子树，开始遍历当前节点
                stack.pop();
                result.add(cur.val);
                prev = cur;
                // 将cur重置为null，准备遍历它的父节点
                cur = null;
            }
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(h)