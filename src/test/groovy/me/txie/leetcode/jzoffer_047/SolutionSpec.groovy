package me.txie.leetcode.jzoffer_047

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_047"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.pruneTree(root) == expected

        where: "Samples"
        root                                || expected
        TreeNode.of(1, null, 0, 0, 1)       || TreeNode.of(1, null, 0, null, 1)
        TreeNode.of(1, 0, 1, 0, 0, 0, 1)    || TreeNode.of(1, null, 1, null, 1)
        TreeNode.of(1, 1, 0, 1, 1, 0, 1, 0) || TreeNode.of(1, 1, 0, 1, 1, null, 1)
    }

}
