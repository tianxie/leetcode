package me.txie.leetcode.p559_maximum_depth_of_n_ary_tree;

import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
