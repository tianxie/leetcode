package me.txie.leetcode.jzoffer_046

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_046"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.rightSideView(root) == expected

        where: "Samples"
        root                                   || expected
        TreeNode.of(1, 2, 3, null, 5, null, 4) || [1, 3, 4]
        TreeNode.of(1, null, 3)                || [1, 3]
        TreeNode.of()                          || []
    }

}
