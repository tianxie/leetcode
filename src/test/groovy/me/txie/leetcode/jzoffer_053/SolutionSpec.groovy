package me.txie.leetcode.jzoffer_053

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification
import spock.lang.Unroll

class SolutionSpec extends Specification {

    @Unroll
    def "jzoffer_053"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.inorderSuccessor(root, p) == expected

        where: "Samples"
        root                                      | p              || expected
        TreeNode.of(2, 1, 3)                      | TreeNode.of(1) || TreeNode.of(2)
        TreeNode.of(5, 3, 6, 2, 4, null, null, 1) | TreeNode.of(6) || null
    }

}
