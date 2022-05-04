/**
 * LeetCode - jzoffer_045
 * https://leetcode-cn.com/problems/LwUNpT/
 */
package me.txie.leetcode.jzoffer_045;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(root);
        int bottomLeft = root.val;

        while (!queue1.isEmpty()) {
            TreeNode node = queue1.poll();
            if (node.left != null) {
                queue2.offer(node.left);
            }
            if (node.right != null) {
                queue2.offer(node.right);
            }

            if (queue1.isEmpty()) {
                queue1 = queue2;
                queue2 = new LinkedList<>();
                if (!queue1.isEmpty()) {
                    bottomLeft = queue1.peek().val;
                }
            }
        }
        return bottomLeft;
    }
}
// 时间复杂度：
// 空间复杂度：
