package me.txie.leetcode.p108_convert_sorted_array_to_binary_search_tree

import me.txie.leetcode.util.TreeNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p108_convert_sorted_array_to_binary_search_tree"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.sortedArrayToBST(nums).toString() == expected.toString()

        where: "Samples"
        nums                        || expected
        [-10, -3, 0, 5, 9] as int[] || TreeNode.of(0, -10, 5, null, -3, null, 9)
    }

}
