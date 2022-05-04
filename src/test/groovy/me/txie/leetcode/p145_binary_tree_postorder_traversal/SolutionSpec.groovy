package me.txie.leetcode.p145_binary_tree_postorder_traversal

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p145_binary_tree_postorder_traversal"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.postorderTraversal(root) == expected

        where: "Samples"
        root                       || expected
        TreeNode.of(1, null, 2, 3) || [3, 2, 1]
        TreeNode.of()              || []
        TreeNode.of(1)             || [1]

    }

}
