/**
 * Leetcode - p559_maximum_depth_of_n_ary_tree
 */
package me.txie.leetcode.p559_maximum_depth_of_n_ary_tree;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

/** 
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {


    @Override
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        for (Node n : root.children) {
            int maxDepth = maxDepth(n);
            if (depth < maxDepth) {
                depth = maxDepth;
            }
        }
        return depth + 1;
    }
}
