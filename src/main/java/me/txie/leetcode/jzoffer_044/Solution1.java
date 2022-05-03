/**
 * LeetCode - jzoffer_044
 * https://leetcode-cn.com/problems/hPov7L/
 */
 
package me.txie.leetcode.jzoffer_044;

import lombok.extern.slf4j.Slf4j;
import me.txie.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int current = 0; // 当前层的节点数
        int next = 0; // 下一层的节点数
        
        if (root != null) {
            queue.offer(root);
            current = 1;
        }
        
        List<Integer> result = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            current--;
            max = Math.max(max, node.val);
            
            if (node.left != null) {
                queue.offer(node.left);
                next++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                next++;
            }
            
            if (current == 0) {
                result.add(max);
                max = Integer.MIN_VALUE;
                current = next;
                next = 0;
            }
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)