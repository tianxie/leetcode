/**
 * LeetCode - p589_n_ary_tree_preorder_traversal
 */
package me.txie.leetcode.p589_n_ary_tree_preorder_traversal;

import java.util.*;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 * if (log.isDebugEnabled()) {
 * log.debug("a + b = {}", sum);
 * }
 * =============================================
 */
class Solution2 implements Solution {

    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> values = new ArrayList<>();

        if (root != null) {
            Deque<Node> stack = new ArrayDeque<>();
            stack.addFirst(root);

            while (!stack.isEmpty()) {
                Node node = stack.removeFirst();
                if (node != null) {
                    values.add(node.val);
                    for (int i = node.children.size() - 1; i >= 0; i--) {
                        stack.addFirst(node.children.get(i));
                    }
                }
            }
        }

        return values;
    }
}
