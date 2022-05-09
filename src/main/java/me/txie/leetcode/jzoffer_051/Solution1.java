/**
 * LeetCode - jzoffer_051
 * https://leetcode.cn/problems/jC7MId/
 */
 
package me.txie.leetcode.jzoffer_051;

import java.util.*;
import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {
    
    @Override
    public int maxPathSum(TreeNode root) {
        int[] maxSum = {Integer.MIN_VALUE};
        dfs(root, maxSum);
        return maxSum[0];
    }

    private int dfs(TreeNode root, int[] maxSum) {
        if (root == null) {
            return 0;
        }
        
        int[] maxSumLeft = {Integer.MIN_VALUE};
        int left = Math.max(0, dfs(root.left, maxSumLeft));
        
        int[] maxSumRight = {Integer.MIN_VALUE};
        int right = Math.max(0, dfs(root.right, maxSumRight));
        
        maxSum[0] = Math.max(maxSumLeft[0], maxSumRight[0]);
        maxSum[0] = Math.max(maxSum[0], root.val + left + right);
        
        return root.val + Math.max(left, right);
    }
}
// 时间复杂度：
// 空间复杂度：