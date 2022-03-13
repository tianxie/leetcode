/**
 * LeetCode - p94_binary_tree_inorder_traversal
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
 
package me.txie.leetcode.p94_binary_tree_inorder_traversal;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            cur = stack.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }
}
// 时间复杂度：
// 空间复杂度：