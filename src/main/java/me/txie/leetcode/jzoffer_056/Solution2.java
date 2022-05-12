/**
 * LeetCode - jzoffer_056
 * https://leetcode.cn/problems/opLdQZ/
 */

package me.txie.leetcode.jzoffer_056;

import java.util.*;

import me.txie.leetcode.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class Solution2 implements Solution {

    @Override
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        BSTIterator iterNext = new BSTIterator(root);
        BSTIteratorReversed iterPrev = new BSTIteratorReversed(root);

        int next = iterNext.next();
        int prev = iterPrev.prev();
        while (next != prev) {
            if (next + prev == k) {
                return true;
            }

            if (next + prev < k) {
                next = iterNext.next();
            } else {
                prev = iterPrev.prev();
            }
        }

        return false;
    }
}
// 时间复杂度：O(n)
// 空间复杂度：O(h)

class BSTIterator {
    private TreeNode cur;
    private final Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.cur = root;
        stack = new Stack<>();
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }

        cur = stack.pop();
        int val = cur.val;
        cur = cur.right;
        return val;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}

class BSTIteratorReversed {
    private TreeNode cur;
    private final Stack<TreeNode> stack;

    public BSTIteratorReversed(TreeNode root) {
        this.cur = root;
        stack = new Stack<>();
    }

    public int prev() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.right;
        }

        cur = stack.pop();
        int val = cur.val;
        cur = cur.left;
        return val;
    }

    public boolean hasPrev() {
        return cur != null || !stack.isEmpty();
    }
}