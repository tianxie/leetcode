/**
 * LeetCode - jzoffer_047
 * https://leetcode-cn.com/problems/pOCWxh/
 */
 
package me.txie.leetcode.jzoffer_047;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
}
// 时间复杂度：
// 空间复杂度：