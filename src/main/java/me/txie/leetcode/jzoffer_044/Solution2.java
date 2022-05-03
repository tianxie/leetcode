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
class Solution2 implements Solution {

    @Override
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if (root != null) {
            queue1.offer(root);
        }
        
        List<Integer> result = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            max = Math.max(max, node.val);
            
            if (node.left != null) {
                queue2.offer(node.left);
            }
            if (node.right != null) {
                queue2.offer(node.right);
            }
            
            if (queue1.isEmpty()) {
                result.add(max);
                max = Integer.MIN_VALUE;
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }
        return result;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)