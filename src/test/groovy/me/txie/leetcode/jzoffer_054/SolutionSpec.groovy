package me.txie.leetcode.jzoffer_054

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_054"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.convertBST(root) == expected

        where: "Samples"
        root                                                                       || expected
        TreeNode.of(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8) || TreeNode.of(30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8)
        TreeNode.of(0, null, 1)                                                    || TreeNode.of(1, null, 1)
        TreeNode.of(1, 0, 2)                                                       || TreeNode.of(3, 3, 2)
        TreeNode.of(3, 2, 4, 1)                                                    || TreeNode.of(7, 9, 4, 10)
    }

}
