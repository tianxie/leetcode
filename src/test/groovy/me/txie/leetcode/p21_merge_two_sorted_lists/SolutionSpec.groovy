package me.txie.leetcode.p21_merge_two_sorted_lists

import me.txie.leetcode.util.ListNode
import spock.lang.Specification

class SolutionSpec extends Specification {

    def "p21_merge_two_sorted_lists"() {
        given: "Solution"
        Solution solution = new Solution1()
//        Solution solution = new Solution2()

        expect: "Pass unit test"
        solution.mergeTwoLists(l1, l2) == expected

        where: "Samples"
        l1                   | l2                   || expected
        ListNode.of(1, 2, 4) | ListNode.of(1, 3, 4) || ListNode.of(1, 1, 2, 3, 4, 4)
    }

}
