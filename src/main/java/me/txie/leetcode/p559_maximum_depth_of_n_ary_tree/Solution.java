/**
 * LeetCode - p559_maximum_depth_of_n_ary_tree
 */
package me.txie.leetcode.p559_maximum_depth_of_n_ary_tree;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int maxDepth(Node root);
}
