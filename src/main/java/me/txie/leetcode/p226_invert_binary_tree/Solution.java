/**
 * LeetCode - p226_invert_binary_tree
 */
package me.txie.leetcode.p226_invert_binary_tree;

import java.util.*;

import me.txie.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    TreeNode invertTree(TreeNode root);
}
