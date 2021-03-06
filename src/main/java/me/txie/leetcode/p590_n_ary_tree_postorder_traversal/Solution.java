/**
 * LeetCode - p590_n_ary_tree_postorder_traversal
 */
package me.txie.leetcode.p590_n_ary_tree_postorder_traversal;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> postorder(Node root);
}
