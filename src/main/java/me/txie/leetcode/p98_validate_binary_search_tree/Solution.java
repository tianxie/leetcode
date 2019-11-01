/**
 * LeetCode - p98_validate_binary_search_tree
 */
 
package me.txie.leetcode.p98_validate_binary_search_tree;
import java.util.*;
import me.txie.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    boolean isValidBST(TreeNode root);
}
