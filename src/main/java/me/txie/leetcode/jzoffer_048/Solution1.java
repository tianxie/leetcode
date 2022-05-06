/**
 * LeetCode - jzoffer_048
 * https://leetcode-cn.com/problems/h54YBf/
 */

package me.txie.leetcode.jzoffer_048;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String leftStr = serialize(root.left);
        String rightStr = serialize(root.right);
        return root.val + "," + leftStr + "," + rightStr;
    }

    @Override
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        int[] i = {0};
        return dfs(strs, i);
    }

    private TreeNode dfs(String[] strs, int[] i) {
        String s = strs[i[0]];
        i[0]++;

        if ("#".equals(s)) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = dfs(strs, i);
        node.right = dfs(strs, i);
        return node;
    }
}
// 时间复杂度：
// 空间复杂度：