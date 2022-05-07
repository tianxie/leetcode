package me.txie.leetcode.jzoffer_049

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_049"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.sumNumbers(root) == expected

        where: "Samples"
        root                       || expected
        TreeNode.of(1, 2, 3)       || 25
        TreeNode.of(4, 9, 0, 5, 1) || 1026
        
    }

}
