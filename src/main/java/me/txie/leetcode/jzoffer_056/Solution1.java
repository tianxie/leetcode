/**
 * LeetCode - jzoffer_056
 * https://leetcode.cn/problems/opLdQZ/
 */

package me.txie.leetcode.jzoffer_056;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution1 implements Solution {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            if (set.contains(k - cur.val)) {
                return true;
            }

            set.add(cur.val);
            cur = cur.right;
        }
        return false;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(n)