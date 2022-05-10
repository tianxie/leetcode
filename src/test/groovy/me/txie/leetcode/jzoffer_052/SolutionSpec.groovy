package me.txie.leetcode.jzoffer_052

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_052"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.increasingBST(root) == expected

        where: "Samples"
        root                                                           || expected
        TreeNode.of(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9) || TreeNode.of(1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9)
        TreeNode.of(5, 1, 7)                                           || TreeNode.of(1, null, 5, null, 7)
    }

}
