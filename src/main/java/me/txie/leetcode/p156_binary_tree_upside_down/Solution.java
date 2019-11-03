/**
 * LeetCode - p156_binary_tree_upside_down
 */
 
package me.txie.leetcode.p156_binary_tree_upside_down;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    TreeNode upsideDownBinaryTree(TreeNode root);
}
