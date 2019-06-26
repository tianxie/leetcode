/**
 * LeetCode - p938_range_sum_of_bst
 */
package me.txie.leetcode.p938_range_sum_of_bst;

import java.util.*;

import me.txie.leetcode.util.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int rangeSumBST(TreeNode root, int L, int R);
}
