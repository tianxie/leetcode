/**
 * LeetCode - p144_binary_tree_preorder_traversal
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
 
package me.txie.leetcode.p144_binary_tree_preorder_traversal;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                result.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            
            cur = stack.pop();
            cur = cur.right;
        }
        return result;
    }
}
// 二叉树的前序遍历，迭代解法
// 时间复杂度：O(n)
// 空间复杂度：O(h)