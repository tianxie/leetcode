/**
 * Leetcode - p617_merge_two_binary_trees
 */
package me.txie.leetcode.p617_merge_two_binary_trees;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);
    TreeNode mergeTrees(TreeNode t1, TreeNode t2);
}
