/**
 * LeetCode - increasing_order_search_tree
 */
package me.txie.leetcode.increasing_order_search_tree;

import java.util.*;

import me.txie.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    TreeNode increasingBST(TreeNode root);
}
