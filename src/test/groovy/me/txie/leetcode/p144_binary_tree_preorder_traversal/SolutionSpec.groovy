package me.txie.leetcode.p144_binary_tree_preorder_traversal

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p144_binary_tree_preorder_traversal"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.preorderTraversal(root) == expected

        where: "Samples"
        root                                   || expected
        TreeNode.of(1, null, 2, null, null, 3) || [1, 2, 3]
        TreeNode.of()                          || []
        TreeNode.of(1)                         || [1]
        TreeNode.of(1, 2)                      || [1, 2]
        TreeNode.of(1, null, 2)                || [1, 2]
    }

}
