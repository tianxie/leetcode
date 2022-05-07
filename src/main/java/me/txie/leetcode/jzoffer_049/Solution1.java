/**
 * LeetCode - jzoffer_049
 * https://leetcode-cn.com/problems/3Etpl5/
 */

package me.txie.leetcode.jzoffer_049;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int num) {
        if (root == null) {
            // 路径已终止，但终点不是叶节点，返回0
            return 0;
        }

        num = num * 10 + root.val;
        // 遇到叶节点才返回路径表示的数字
        if (root.left == null && root.right == null) {
            return num;
        }
        return dfs(root.left, num) + dfs(root.right, num);
    }
}
// 时间复杂度：
// 空间复杂度：