package me.txie.leetcode.p111_minimum_depth_of_binary_tree

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p111_minimum_depth_of_binary_tree"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.minDepth(root) == expected

        where: "Samples"
        root                                     || expected
        TreeNode.of(3, 9, 20, null, null, 15, 7) || 2
        TreeNode.of(3, 9, 20, null, 7, 15, null) || 3
    }

}
