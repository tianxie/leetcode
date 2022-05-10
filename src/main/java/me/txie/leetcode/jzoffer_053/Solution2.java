/**
 * LeetCode - jzoffer_053
 * https://leetcode.cn/problems/P5rCT8/
 */
 
package me.txie.leetcode.jzoffer_053;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {
    
    @Override
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode cur = root;
        TreeNode result = null;
        while (cur != null) {
            if (cur.val > p.val) {
                result = cur;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return result;
    }
}
// 时间复杂度：O(h)，h是二叉树的高度
// 空间复杂度：