/**
 * LeetCode - jzoffer_052
 * https://leetcode.cn/problems/NYBBNL/
 */
 
package me.txie.leetcode.jzoffer_052;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        TreeNode first = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            if (prev != null) {
                prev.right = cur; // 把前一个遍历到的节点的右子节点指针指向当前节点
            } else {
                first = cur; // 记录第一个遍历到的节点，作为根节点返回
            }
            
            prev = cur;
            cur.left = null;
            cur = cur.right;
        }
        return first;
    }
}
// 时间复杂度：
// 空间复杂度：