package me.txie.leetcode.jzoffer_044

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_044"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.largestValues(root) == expected

        where: "Samples"
        root                                || expected
        TreeNode.of(1, 3, 2, 5, 3, null, 9) || [1, 3, 9]
        TreeNode.of(1, 2, 3)                || [1, 3]
        TreeNode.of(1)                      || [1]
        TreeNode.of(1, null, 2)             || [1, 2]
        TreeNode.of()                       || []
    }

}
