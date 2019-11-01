package me.txie.leetcode.p98_validate_binary_search_tree

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p98_validate_binary_search_tree"() {
        given: "Solution"
//        Solution solution = new Solution1()
        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.isValidBST(root) == expected

        where: "Samples"
        root                                   || expected
        TreeNode.of(2, 1, 3)                   || true
        TreeNode.of(5, 1, 4, null, null, 3, 6) || false
        TreeNode.of()                          || true
    }

}
