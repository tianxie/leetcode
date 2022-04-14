package me.txie.leetcode.p24_swap_nodes_in_pairs

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p24_swap_nodes_in_pairs"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.swapPairs(head) == expected

        where: "Samples"
        head                    || expected
        ListNode.of(1, 2, 3, 4) || ListNode.of(2, 1, 4, 3)
    }

}
