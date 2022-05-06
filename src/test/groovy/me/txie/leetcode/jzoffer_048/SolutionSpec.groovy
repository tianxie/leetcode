package me.txie.leetcode.jzoffer_048

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "jzoffer_048"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.deserialize(solution.serialize(root)) == expected

        where: "Samples"
        root                                   || expected
        TreeNode.of(1, 2, 3, null, null, 4, 5) || TreeNode.of(1, 2, 3, null, null, 4, 5)
        TreeNode.of()                          || TreeNode.of()
        TreeNode.of(1)                         || TreeNode.of(1)
        TreeNode.of(1, 2)                      || TreeNode.of(1, 2)

    }

}
