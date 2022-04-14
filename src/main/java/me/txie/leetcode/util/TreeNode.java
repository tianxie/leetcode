package me.txie.leetcode.util;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    /**
     *    val
     *    / \
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
     *   a
     *  / \
     * b  null
     * output = [[a],[b,null]]
     * null node will be listed in the output
     */
    private List<List<Integer>> bfs() {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
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
        return makeTree(objects, 0);
    }

    private static TreeNode makeTree(Object[] objects, int i) {
        if (i < objects.length) {
            Object o = objects[i];
            if (o != null) {
                TreeNode node = new TreeNode((int) o);
                node.left = makeTree(objects, 2 * i + 1);
                node.right = makeTree(objects, 2 * i + 2);
                return node;
            }
        }
        return null;
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
