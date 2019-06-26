/**
 * LeetCode - p783_minimum_distance_between_bst_nodes
 */
package me.txie.leetcode.p783_minimum_distance_between_bst_nodes;

import java.util.*;

import me.txie.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int minDiffInBST(TreeNode root);
}
