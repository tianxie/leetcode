/**
 * LeetCode - jzoffer_050
 * https://leetcode-cn.com/problems/6eUYwP/
 */

package me.txie.leetcode.jzoffer_050;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        // 前序遍历
        return dfs(root, targetSum, map, 0);
    }

    private int dfs(TreeNode root, int targetSum, Map<Integer, Integer> map, int path) {
        if (root == null) {
            return 0;
        }

        path += root.val;
        int count = map.getOrDefault(path - targetSum, 0);
        // key是从根节点到当前节点的和
        map.put(path, map.getOrDefault(path, 0) + 1);
        
        count += dfs(root.left, targetSum, map, path);
        count += dfs(root.right, targetSum, map, path);

        // why?
        // 在函数结束之前需要将当前节点从路径中删除
        map.put(path, map.get(path) - 1);
        return count;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)