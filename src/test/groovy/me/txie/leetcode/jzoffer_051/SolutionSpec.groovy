package me.txie.leetcode.jzoffer_051

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_051"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.maxPathSum(root) == expected

        where: "Samples"
        root                                       || expected
        TreeNode.of(1, 2, 3)                       || 6
        TreeNode.of(-10, 9, 20, null, null, 15, 7) || 42
    }

}
