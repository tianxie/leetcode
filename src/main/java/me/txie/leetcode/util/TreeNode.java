package me.txie.leetcode.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    /**
     * val
     * / \
     * left right
     */
    public TreeNode left;
    public TreeNode right;
    public int val;

    // create node with a specific value
    public TreeNode(int x) {
        val = x;
    }

    /**
     * Serialization: print the nodes in BFS order
     */
    public String toString() {
        return bfs().toString();
    }

    /**
     * Parse the tree in BFS order
     *
     * @return List of Integer
     * <p>
     * For example, given the following tree,
     * a
     * / \
     * b  null
     * output = [[a],[b,null]]
     * null node will be listed in the output
     */
    private List<List<Integer>> bfs() {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> buffer = new ArrayList<>();
        buffer.add(this);
        while (!buffer.isEmpty()) {
            List<Integer> line = new ArrayList<>();
            int size = buffer.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = buffer.remove(0);
                if (node == null) {
                    line.add(null);
                } else {
                    line.add(node.val);
                    buffer.add(node.left);
                    buffer.add(node.right);
                }
            }
            if (line.isEmpty()) continue;
            for (Integer n : line) { // ignore the bottom line with all null nodes
                if (n != null) {
                    res.add(line);
                    break;
                }
            }
        }
        return res;
    }

    public static TreeNode of(Object... objects) {
        if (objects == null || objects.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode((int) objects[0]);
        queue.offer(root);

        TreeNode parent = null;
        boolean isLeft = true;
        for (int i = 1; i < objects.length; i++) {
            if (isLeft) {
                parent = queue.poll();
            }

            Object o = objects[i];
            TreeNode node = null;
            if (o != null) {
                node = new TreeNode((int) o);
                queue.offer(node);
            }

            if (isLeft) {
                parent.left = node;
            } else {
                parent.right = node;
            }

            isLeft = !isLeft;
        }

        return root;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TreeNode)) {
            return false;
        }

        List<List<Integer>> thisNodes = this.bfs();
        List<List<Integer>> thatNodes = ((TreeNode) obj).bfs();
        if (thisNodes.size() != thatNodes.size()) {
            return false;
        }
        for (int i = 0; i < thisNodes.size(); i++) {
            if (!(thisNodes.get(i).equals(thatNodes.get(i)))) {
                return false;
            }
        }

        return true;
    }
}
