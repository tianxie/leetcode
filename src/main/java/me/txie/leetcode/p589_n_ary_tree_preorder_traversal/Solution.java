/**
 * LeetCode - p589_n_ary_tree_preorder_traversal
 */
package me.txie.leetcode.p589_n_ary_tree_preorder_traversal;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    List<Integer> preorder(Node root);
}
