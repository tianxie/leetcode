package me.txie.leetcode.jzoffer_055;

import me.txie.leetcode.util.TreeNode;

import java.util.Stack;

public class BSTIterator {
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

    /**
     * Your BSTIterator object will be instantiated and called as such:
     * BSTIterator obj = new BSTIterator(root);
     * int param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
    public static void main(String[] args) {

    }
}

