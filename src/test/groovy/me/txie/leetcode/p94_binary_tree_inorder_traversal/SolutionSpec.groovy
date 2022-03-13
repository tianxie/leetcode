package me.txie.leetcode.p94_binary_tree_inorder_traversal

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p94_binary_tree_inorder_traversal"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.inorderTraversal(root) == expected

        where: "Samples"
        root                                   || expected
        TreeNode.of(1, null, 2, null, null, 3) || [1, 3, 2]
        TreeNode.of()                          || []
        TreeNode.of(1)                         || [1]
        TreeNode.of(1, 2)                      || [2, 1]

    }

}
