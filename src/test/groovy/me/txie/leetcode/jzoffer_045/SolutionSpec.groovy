package me.txie.leetcode.jzoffer_045

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_045"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findBottomLeftValue(root) == expected

        where: "Samples"
        root                                               || expected
        TreeNode.of(2, 1, 3)                               || 1
        TreeNode.of(1, 2, 3, 4, null, 5, 6, null, null, 7) || 7
    }

}
