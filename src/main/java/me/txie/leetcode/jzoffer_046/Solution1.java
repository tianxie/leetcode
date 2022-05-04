/**
 * LeetCode - jzoffer_046
 * https://leetcode-cn.com/problems/WNC0Lk/
 */
 
package me.txie.leetcode.jzoffer_046;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            
            if (node.left != null) {
                queue2.offer(node.left);
            }
            if (node.right != null) {
                queue2.offer(node.right);
            }
            
            if (queue1.isEmpty()) {
                result.add(node.val);
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)