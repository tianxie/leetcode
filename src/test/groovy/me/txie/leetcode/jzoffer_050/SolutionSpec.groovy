package me.txie.leetcode.jzoffer_050

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_050"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.pathSum(root, targetSum) == expected

        where: "Samples"
        root                                                          | targetSum || expected
        TreeNode.of(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)        | 8         || 3
        TreeNode.of(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1) | 22        || 3
        TreeNode.of(1)                                                | 0         || 0
    }

}
