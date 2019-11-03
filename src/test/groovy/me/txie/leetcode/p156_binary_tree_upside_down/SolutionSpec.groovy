package me.txie.leetcode.p156_binary_tree_upside_down

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p156_binary_tree_upside_down"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.upsideDownBinaryTree(root) == expected

        where: "Samples"
        root || expected
        TreeNode.of() || TreeNode.of()
    }
    
}
