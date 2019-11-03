/**
 * LeetCode - p111_minimum_depth_of_binary_tree
 */
 
package me.txie.leetcode.p111_minimum_depth_of_binary_tree;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    int minDepth(TreeNode root);
}
