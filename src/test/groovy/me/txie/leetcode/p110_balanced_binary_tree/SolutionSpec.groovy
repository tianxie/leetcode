package me.txie.leetcode.p110_balanced_binary_tree

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p110_balanced_binary_tree"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isBalanced(root) == expected

        where: "Samples"
        root                                         || expected
        TreeNode.of(3, 9, 20, null, null, 15, 7)     || true
        TreeNode.of(1, 2, 2, 3, 3, null, null, 4, 4) || false

    }

}
