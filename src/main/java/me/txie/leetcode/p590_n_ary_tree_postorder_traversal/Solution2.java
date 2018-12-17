/**
 * Leetcode - p590_n_ary_tree_postorder_traversal
 */
package me.txie.leetcode.p590_n_ary_tree_postorder_traversal;
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
class Solution2 implements Solution {


    @Override
    public List<Integer> postorder(Node root) {
        List<Integer> values = new ArrayList<>();

        if (root == null) {
            return values;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.addFirst(root);
        while (!stack.isEmpty()) {
            Node node = stack.removeFirst();
            if (node != null) {
                values.add(0, node.val);
                for (Node child : node.children) {
                    stack.addFirst(child);
                }
            }
        }

        return values;
    }
}
