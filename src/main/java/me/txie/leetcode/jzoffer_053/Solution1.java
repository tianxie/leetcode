/**
 * LeetCode - jzoffer_053
 * https://leetcode.cn/problems/P5rCT8/
 */
 
package me.txie.leetcode.jzoffer_053;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        boolean found = false;
        
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            
            cur = stack.pop();
            if (found) {
                break;
            } else if (p == cur) {
                found = true;
            }
            
            cur = cur.right;
        }
        
        return cur;
    }
}
// 中序遍历
// 时间复杂度：O(n)
// 空间复杂度：