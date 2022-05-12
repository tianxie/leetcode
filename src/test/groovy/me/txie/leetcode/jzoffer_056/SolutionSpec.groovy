package me.txie.leetcode.jzoffer_056

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_056"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.findTarget(root, k) == expected

        where: "Samples"
        root                               | k  || expected
        TreeNode.of(8, 6, 10, 5, 7, 9, 1)  | 12 || true
        TreeNode.of(8, 6, 10, 5, 7, 9, 11) | 22 || false
    }

}
